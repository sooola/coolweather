package com.coolweather.app.db;

import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {
	/*
	 * ���ݿ���
	 */
	public static final String DB_name = "cool_weather";
	
	/*
	 * ���ݿ�汾
	 */
	
	public static final int VERSION = 1;
	
	private static CoolWeatherDB coolWeatherDB;
	private SQLiteDatabase db;

}