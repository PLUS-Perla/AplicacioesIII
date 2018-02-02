package com.example.usuario.unidad1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by USUARIO on 01/02/2018.
 */

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, TableActivity.class));
        finish();
    }

}
