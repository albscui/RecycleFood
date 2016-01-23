package com.uofthacks.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.uofthacks.recyclefood.R;
import android.widget.BaseAdapter;
import android.view.View;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
/**
 * Created by PatrickHsu on 16-01-23.
 */
public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        //
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainScreen.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
