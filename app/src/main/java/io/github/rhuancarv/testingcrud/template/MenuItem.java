package io.github.rhuancarv.testingcrud.template;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import io.github.rhuancarv.testingcrud.R;

/**
 * Created by Rhuan on 10/09/2015.
 */
public class MenuItem extends ArrayAdapter {

    private static String[] menutext = {"Add", "List", };
    private static Integer[] menuicon = {
            android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_search
    };

    Activity act;

    public MenuItem(Context ctx, int resource, Activity act){
        super(ctx, resource, menutext);
        this.act = act;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = act.getLayoutInflater();
        View view = inflater.inflate(R.layout.menu_item, null);

        TextView txt = (TextView) view.findViewById(R.id.menutext);
        txt.setText(menutext[position]);

        txt.setCompoundDrawablesWithIntrinsicBounds(0,menuicon[position],0,0);

        return view;
    }
}
