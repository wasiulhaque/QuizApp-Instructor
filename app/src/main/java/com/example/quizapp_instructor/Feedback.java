package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {
    TextView textView;
    Button feedback1,feedback2,feedback3,feedback4,back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        textView=(TextView)findViewById(R.id.rcv_feed);
        feedback1=(Button)findViewById(R.id.feedback_1);
        feedback2=(Button)findViewById(R.id.feedback_2);
        feedback3=(Button)findViewById(R.id.feedback_3);
        feedback4=(Button)findViewById(R.id.feedback_4);
        back_btn=(Button)findViewById(R.id.back_button);
    }
}
