package com.example.mynails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseMaster extends AppCompatActivity {

    Button chooseMasterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_master);

        chooseMasterBtn = (Button) findViewById(R.id.btnChooseMaster);

        chooseMasterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
}
