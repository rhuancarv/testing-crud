package io.github.rhuancarv.testingcrud;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.github.rhuancarv.testingcrud.R;
import io.github.rhuancarv.testingcrud.entity.Product;
import io.github.rhuancarv.testingcrud.persistence.ProductDao;

public class Register extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void back(View v){
        finish();
    }

    public void register(View v){
        EditText edtName = (EditText) findViewById(R.id.txtname);
        EditText edtQuantity = (EditText) findViewById(R.id.txtquantity);
        EditText edtPrice = (EditText) findViewById(R.id.txtprice);

        String name = edtName.getText().toString();
        String quantity = edtQuantity.getText().toString();
        String price = edtPrice.getText().toString();

        Product prod = new Product();
        prod.setName(name);
        prod.setQuantity(new Integer(quantity));
        prod.setPrice(new Double(price));

        ProductDao pd = new ProductDao(getApplicationContext());
        if (pd.register(prod) > 0){
            Toast.makeText(getApplicationContext(), "Product registered successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Product not registered", Toast.LENGTH_SHORT).show();
        }
    }

}
