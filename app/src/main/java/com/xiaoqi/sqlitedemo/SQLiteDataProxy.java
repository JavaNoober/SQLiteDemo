package com.xiaoqi.sqlitedemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SQLiteDataProxy implements ISQLiteOperate {

	private java.util.concurrent.Semaphore semaphoreTransaction = new java.util.concurrent.Semaphore(1);
	private AtomicInteger mOpenCounter = new AtomicInteger();

	private SQLiteDatabase db;
	private Cursor cursor;

	private SQLiteDataProxy() {

	}

	private static SQLiteDataProxy proxy;
	private static DBOpenHelper helper;

	public static SQLiteDataProxy getSQLiteProxy(Context context) {
		helper = DBOpenHelper.getInstance(context);
		if (proxy == null) {
			synchronized (SQLiteDataProxy.class) {
				if (proxy == null) {
					proxy = new SQLiteDataProxy();
				}
			}
		}
		return proxy;
	}

	private SQLiteDatabase getSQLiteDataBase() {
		if (mOpenCounter.incrementAndGet() == 1) {
			db = helper.getWritableDatabase();
		}
		return db;
	}

	private void closeSQLiteDatabase(){
		if(mOpenCounter.decrementAndGet() == 0){
			db.close();
		}
	}

	@Override
	public boolean execSQL(String sql) {
		boolean result = true;
		db = getSQLiteDataBase();
		try {
			db.execSQL(sql);
		} catch (Exception e) {
			Log.e("SQLERROR", "In SQLDA：" + e.getMessage() + sql);
			result = false;
		} finally {
			closeSQLiteDatabase();
		}
		return result;
	}

	@Override
	public boolean execSQLList(List<String> sqlList) {
		boolean result = true;
		db = getSQLiteDataBase();
		String currentSqlString = "";
		try {
			semaphoreTransaction.acquire();
			db.beginTransaction();
			for (String sql : sqlList) {
				currentSqlString = sql;
				db.execSQL(sql);
			}
			db.setTransactionSuccessful();
			result = true;
		} catch (Exception e) {
			result = false;
			Log.e("SQLERROR", "IN SQLDA: " + e.getMessage() + currentSqlString);
		} finally {
			db.endTransaction();
			semaphoreTransaction.release();
			closeSQLiteDatabase();
		}
		return result;
	}

	@Override
	public boolean execSQLs(List<String[]> sqlList) {
		boolean result = true;
		db = getSQLiteDataBase();
		String currentSql = "";
		try {
			semaphoreTransaction.acquire();
			db.beginTransaction();
			for (String[] arr : sqlList) {
				currentSql = arr[0];
				Cursor curCount = db.rawQuery(arr[0], null);
				curCount.moveToFirst();
				int count = curCount.getInt(0);
				curCount.close();
				if (count == 0) {
					if (arr[1] != null && arr[1].length() > 0) {
						currentSql = arr[1];
						db.execSQL(arr[1]);
					}
				} else {
					if (arr.length > 2 && arr[2] != null && arr[2].length() > 0) {
						currentSql = arr[2];
						db.execSQL(arr[2]);
					}
				}
			}
			db.setTransactionSuccessful();
			result = true;
		} catch (Exception e) {
			Log.e("SQLERROR", "IN SQLDA: " + currentSql + e.getMessage());
			result = false;
		} finally {
			db.endTransaction();
			semaphoreTransaction.release();
			closeSQLiteDatabase();
		}
		return result;
	}

	@Override
	public boolean execSQLIgnoreError(List<String> sqlList) {
		db = getSQLiteDataBase();
		try {
			semaphoreTransaction.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		db.beginTransaction();
		for (String sql : sqlList) {
			try {
				db.execSQL(sql);
			} catch (Exception e) {
				Log.e("SQLERROR", "IN SQLDA: " + sql + e.getMessage());
			}
		}
		db.setTransactionSuccessful();
		db.endTransaction();
		semaphoreTransaction.release();
		closeSQLiteDatabase();
		return true;
	}

	@Override
	public Cursor query(String sql) {
		return query(sql, null);
	}

	@Override
	public Cursor query(String sql, String[] params) {
		db = getSQLiteDataBase();
		cursor = db.rawQuery(sql, params);
		return cursor;
	}

	@Override
	public void close() {
		if (cursor != null) {
			cursor.close();
		}
		if (db != null) {
			db.close();
		}
	}
}
