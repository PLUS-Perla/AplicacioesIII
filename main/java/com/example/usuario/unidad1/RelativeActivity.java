package com.example.usuario.unidad1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 01/02/2018.
 */

public class RelativeActivity extends AppCompatActivity {
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        TextView helloMessage = findViewById(R.id.txt_message);
        String data = getIntent().getStringExtra("data");
        helloMessage.setText(data);


        btnExit = findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });
    }

}
