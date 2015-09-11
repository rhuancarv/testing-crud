package io.github.rhuancarv.testingcrud.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rhuan on 11/09/2015.
 */
public class Dao extends SQLiteOpenHelper {

    private static final String DBNAME = "testingcrud";
    public static final String TBLPRODUCT = "product";
    public static final int VERSION = 1;

    private static String SCRIPT = "create table product(" + "id integer primary key autoincrement, " + "name varchar(30) not null," + "quantity integer," + "price double(10,2))";
    public Dao(Context ctx){
        super(ctx, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table product");
        db.execSQL(SCRIPT);
    }
}
