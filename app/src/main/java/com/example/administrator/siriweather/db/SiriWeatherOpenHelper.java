package com.example.administrator.siriweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.id;
import static android.R.attr.key;
import static android.R.id.primary;

/**
 * Created by Administrator on 2016/11/11.
 */

public class SiriWeatherOpenHelper extends SQLiteOpenHelper{

        //Province表建表语句
        public static final String CREATE_PROVINCE ="create table Province (" + "id integer primary key autoincrement, " + "province_name text, " + "province_code text)";

        //City表建表语句
        public static final String CREATE_CITY = "create table City("+"id integer primary key autoincrement, " + "city_name text, " + "city_code text,"+"province_id integer)";

        //County表建表语句
        public static final String CREATE_COUNTY = "create table City(\"+\"id integer primary key autoincrement, " + "county_name text, " + "county_code text,"+"city_id integer)";

        public SiriWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
            super(context,name,factory,version);
        }

        public void onCreate(SQLiteDatabase db){
            db.execSQL(CREATE_PROVINCE); //创建Province表
            db.execSQL(CREATE_CITY);  //创建City表
            db.execSQL(CREATE_COUNTY);  //创建County表
        }

        public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){}
}
