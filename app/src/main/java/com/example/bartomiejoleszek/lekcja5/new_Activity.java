package com.example.bartomiejoleszek.lekcja5;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Bartłomiej Oleszek on 03.04.2017.
 */

public class new_Activity extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.samsung);
    }

    public void Return(View view) {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);

    }
}
