package com.xiaoqi.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xiaoqi on 2016/9/1.
 */
public class DBOpenHelper extends SQLiteOpenHelper{

	private DBOpenHelper(Context context,String dbPath, int version) {
		super(context, dbPath , null, version);
	}

	private volatile static DBOpenHelper uniqueInstance;
	public static DBOpenHelper getInstance(Context context) {
		if (uniqueInstance == null) {
			synchronized (DBOpenHelper.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DBOpenHelper(context,context.getFilesDir().getAbsolutePath()+"/foowwlite.db",1);
				}
			}
		}
		return uniqueInstance;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
