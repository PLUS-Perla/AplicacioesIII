package com.example.usuario.unidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Admin on 01/02/2018.
 */


public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
    }

    public void nextActivityA(View view) {
        startActivity(new Intent(this, GridActivity.class));
        //finish();
    }
    public void nextActivityB(View view) {
        startActivity(new Intent(this, LinearActivity.class));
        //finish();
    }
}
