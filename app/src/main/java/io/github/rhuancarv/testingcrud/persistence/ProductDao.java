package io.github.rhuancarv.testingcrud.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import io.github.rhuancarv.testingcrud.entity.Product;

/**
 * Created by Rhuan on 11/09/2015.
 */
public class ProductDao {

    private static final String[] FLDPRODUCT = {
            "id", "name", "quantity", "price"
    };

    private SQLiteDatabase db;

    public ProductDao(Context ctx){
        db = new Dao(ctx).getWritableDatabase();
    }

    public long register(Product prod){
        long idproduct = -1;
        db.beginTransaction();
        try {
            ContentValues cv = new ContentValues();
            cv.put(FLDPRODUCT[1], prod.getName());
            cv.put(FLDPRODUCT[2], prod.getQuantity());
            cv.put(FLDPRODUCT[3], prod.getPrice());

            idproduct = db.insert(Dao.TBLPRODUCT, null, cv);
            db.setTransactionSuccessful();
        }catch (Exception e){
            Log.i("ERROR", e.getMessage());
        }finally {
            db.endTransaction();
            db.close();
        }
        return idproduct;
    }
}
