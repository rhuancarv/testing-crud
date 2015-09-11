package io.github.rhuancarv.testingcrud;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import io.github.rhuancarv.testingcrud.template.MenuItem;

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    GridView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (GridView) findViewById(R.id.menu);
        menu.setAdapter(new MenuItem(getApplicationContext(), R.layout.menu_item, this));
        menu.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent it;
        switch (position){
            case 0 :
                it = new Intent(getApplicationContext(), Register.class);
                startActivity(it);
                break;
        }
    }
}
