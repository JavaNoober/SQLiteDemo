package com.xiaoqi.sqlitedemo;

import android.database.Cursor;

import java.util.List;

/**
 * Created by xiaoqi on 2016/9/1.
 */
public interface ISQLiteOperate {

	boolean execSQL(String sql);

	boolean execSQLList(List<String> sqlList);

	boolean execSQLs(List<String[]> sqlList);

	boolean execSQLIgnoreError(List<String> sqlList);

	Cursor query(String sql);

	Cursor query(String sql, String[] params);

	void close();
}
