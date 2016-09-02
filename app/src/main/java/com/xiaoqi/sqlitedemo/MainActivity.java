package com.xiaoqi.sqlitedemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	SQLiteDatabase db;
	ArrayList<Fragment> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		InitializeDatabase();
		ViewPager vp = (ViewPager) findViewById(R.id.Vp);
		list = new ArrayList<>();
		list.add(new Fragment1());
		list.add(new Fragment2());
		vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
			@Override
			public Fragment getItem(int position) {
				return list.get(position);
			}

			@Override
			public int getCount() {
				return 2;
			}
		});

	}

	class MyAdapter extends FragmentPagerAdapter{

		public MyAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			return null;
		}

		@Override
		public int getCount() {
			return 0;
		}
	}


	public boolean InitializeDatabase() {
		try {
//			File oldDbFile = new File(getFilesDir().getAbsolutePath()+"/foowwlite.db");
//			if (oldDbFile.exists()) {
//				return true;
//			}
			InputStream is = getResources().openRawResource(
					R.raw.foowwlite);
			FileOutputStream fos = new FileOutputStream(getFilesDir().getAbsolutePath()+"/foowwlite.db");
			byte[] buffer = new byte[8192];
			while (is.read(buffer) > 0) {
				fos.write(buffer);
			}
			fos.close();
			is.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;

		} catch (IOException e) {
			return false;
		}
	}


}
