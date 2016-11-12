package com.example.administrator.siriweather.db;

import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.id;
import static android.R.attr.key;
import static android.R.id.primary;

/**
 * Created by Administrator on 2016/11/11.
 */

public class SiriWeatherOpenHelper extends SQLiteOpenHelper{
    Province:
    create table Province(
            id integer primary key autoincrement,
            province_name text,
            province_code text)
        public static final String CREATE_PROVINCE ="create table Province ("
                + "id integer primary key autoincrement, "
                + "province_name text, "
                + "province_code text)";


}
