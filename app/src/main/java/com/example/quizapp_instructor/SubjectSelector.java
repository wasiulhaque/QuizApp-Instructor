package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubjectSelector extends AppCompatActivity {
    Button bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_selector);

        bangla = findViewById(R.id.SubBangla);
        bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(SubjectSelector.this, ChapterSelector.class);
                startActivity(intent1);
            }
        });
    }
}