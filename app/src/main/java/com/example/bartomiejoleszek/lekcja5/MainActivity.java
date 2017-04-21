package com.example.bartomiejoleszek.lekcja5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private String[] lang;
    private String[] phrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            lv = (ListView) findViewById(R.id.langagues);
            initResources();
        initLanguagesListView();
        }

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.model);

    }

    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id){


                Context context;
                    context = getApplicationContext();


                if(pos==1) {
                    Intent intent = new Intent(context, Huawei_Activity.class);
                    startActivity(intent);
                }

                else if(pos==2) {
                    Intent intent = new Intent(context, Sony_Activity.class);
                    startActivity(intent);

                }

                else {
                    Intent intent = new Intent(context, new_Activity.class);
                    startActivity(intent);
                }

            }});


    }}
