package com.example.messkhataabook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHandler extends SQLiteOpenHelper {

    private static final String DB_NAME="UserInfoDB";
    private static final int DB_VERSION=1;

    private static final String USER_TABLE="user_info";
    private static final String ID_COL="id";
    private static final String NAME_COL="name";
    private static final String EMAIL_COL="email";
    private static final String PASSWORD_COL="password";

    public DbHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE " + USER_TABLE + "("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + EMAIL_COL + " TEXT,"
                + PASSWORD_COL + " TEXT" +")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
