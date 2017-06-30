package com.example.sandy.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button go_to_subjects, go_to_tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_to_subjects = (Button) findViewById(R.id.btn_subjects);
        go_to_subjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });

        go_to_tt = (Button) findViewById(R.id.btn_TT);
        go_to_tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,TimeTableActivity.class);
                startActivity(intent);
            }
        });
    }
}
