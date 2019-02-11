package com.example.juet.assignmentthree;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button btnActivity1 = null;
    private Button btnActivity2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        this.btnActivity1 = (Button)findViewById(R.id.btnActivity1);
        this.btnActivity2 = (Button)findViewById(R.id.btnActivity2);

        this.btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, com.example.juet.assignmentthree.MainActivity.class);
                startActivity(intent);
            }
        });

        this.btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, com.example.juet.assignmentthree.Activity2.class);
                startActivity(intent);
            }
        });
    }

}
