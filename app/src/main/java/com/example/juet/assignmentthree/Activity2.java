package com.example.juet.assignmentthree;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button btnActivity1 = null;
    private Button btnActicity3 = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        this.btnActivity1= (Button)findViewById(R.id.btnActivity1);
        this.btnActicity3 = (Button)findViewById(R.id.btnActivity3);

        this.btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, com.example.juet.assignmentthree.MainActivity.class);
                startActivity(intent);
            }
        });

        this.btnActicity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, com.example.juet.assignmentthree.Activity3.class);
                startActivity(intent);
            }
        });
    }
}
