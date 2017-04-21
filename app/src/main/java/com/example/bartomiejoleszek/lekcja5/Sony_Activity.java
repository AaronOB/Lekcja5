package com.example.bartomiejoleszek.lekcja5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Bartłomiej Oleszek on 06.04.2017.
 */

public class Sony_Activity extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sony);
    }

    public void Return(View view) {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);

    }
}
