package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChapterSelectorModify extends AppCompatActivity {
    Button chapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_selector);

        chapter1 =findViewById(R.id.chapter1);
        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ChapterSelectorModify.this, QuizWindowModify.class);
                startActivity(intent1);
            }
        });
    }
}