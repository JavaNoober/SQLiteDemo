package com.xiaoqi.sqlitedemo;

import android.content.Context;
import android.database.Cursor;

import java.util.List;

public class DBManager {

	public static void asyncExecSQL(final Context context, final String sql){
		new Thread(new Runnable() {
			@Override
			public void run() {
				SQLiteDataProxy.getSQLiteProxy(context).execSQL(sql);
			}
		}).start();
	}

	public static void asyncExecSQLList(final Context context,final List<String> sqlList){
		new Thread(new Runnable() {
			@Override
			public void run() {
				SQLiteDataProxy.getSQLiteProxy(context).execSQLList(sqlList);
			}
		}).start();
	}

	public static void asyncExecSQLs(final Context context,final List<String[]> sqlList){
		new Thread(new Runnable() {
			@Override
			public void run() {
				SQLiteDataProxy.getSQLiteProxy(context).execSQLs(sqlList);
			}
		}).start();
	}

	public static void asyncExecSQLIgnoreError(final Context context,final List<String> sqlList){
		new Thread(new Runnable() {
			@Override
			public void run() {
				SQLiteDataProxy.getSQLiteProxy(context).execSQLIgnoreError(sqlList);
			}
		}).start();
	}

	public static boolean execSQL( Context context, String sql){
		return SQLiteDataProxy.getSQLiteProxy(context).execSQL(sql);
	}

	public static boolean execSQLList( Context context, List<String> sqlList){
		return SQLiteDataProxy.getSQLiteProxy(context).execSQLList(sqlList);
	}

	public static boolean execSQLs( Context context, List<String[]> sqlList){
		return SQLiteDataProxy.getSQLiteProxy(context).execSQLs(sqlList);
	}

	public static boolean execSQL( Context context, List<String> sqlList){
		return SQLiteDataProxy.getSQLiteProxy(context).execSQLIgnoreError(sqlList);
	}

	public static Cursor query(Context context, String sql){
		return SQLiteDataProxy.getSQLiteProxy(context).query(sql);
	}

	public static Cursor query(Context context, String sql, String[] params){
		return SQLiteDataProxy.getSQLiteProxy(context).query(sql, params);
	}

	public static void close(Context context){
		SQLiteDataProxy.getSQLiteProxy(context).close();
	}
}
