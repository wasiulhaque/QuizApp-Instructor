package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.quizapp_instructor.ui.login.LoginActivity;

public class QuizWindowModify extends AppCompatActivity {
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_window_modify);
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Changes saved", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(QuizWindowModify.this, SelectorActivity.class);
                startActivity(intent);

            }
        });
    }
}
