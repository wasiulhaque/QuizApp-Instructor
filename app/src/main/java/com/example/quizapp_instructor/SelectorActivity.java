package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quizapp_instructor.ui.login.LoginActivity;

public class SelectorActivity extends AppCompatActivity {
    Button newQuiz;
    Button modify;
    Button material;
    Button feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        newQuiz =findViewById(R.id.buttonCreateQuiz);
        newQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(SelectorActivity.this, SelectClass.class);
                startActivity(intent1);
            }
        });

        modify = findViewById(R.id.buttonModifyQuiz);
        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(SelectorActivity.this, SelectClassModify.class);
                startActivity(intent2);
            }
        });

        material = findViewById(R.id.buttonMaterialSection);
        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(SelectorActivity.this, StudyMaterials.class);
                startActivity(intent3);
            }
        });

        feedback = findViewById(R.id.buttonFeedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent(SelectorActivity.this, Feedback.class);
                startActivity(intent4);
            }
        });
    }
}
