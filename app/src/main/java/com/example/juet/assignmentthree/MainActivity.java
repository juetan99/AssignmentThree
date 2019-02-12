package com.example.juet.assignmentthree;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnActivity2 = null;
    private Button btnActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnActivity2 = (Button)findViewById(R.id.btnActivity2);
        this.btnActivity3 = (Button)findViewById(R.id.btnActivity3);

        this.btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.juet.assignmentthree.Activity2.class);
                startActivity(intent);
            }
        });


        this.btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.juet.assignmentthree.Activity3.class);
                startActivity(intent);
            }
        });

    }

}
