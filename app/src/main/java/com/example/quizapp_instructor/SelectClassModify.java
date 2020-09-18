package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SelectClassModify extends AppCompatActivity {
    Spinner classSpinner;
    TextView select_class;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class);

        classSpinner = findViewById(R.id.classSpinner);
        select_class = findViewById(R.id.select_class);
        proceed = findViewById(R.id.proceed);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Class 5");
        arrayList.add("Class 6");
        arrayList.add("Class 7");
        arrayList.add("Class 8");
        arrayList.add("Class 9");
        arrayList.add("Class 10");
        arrayList.add("Class 11");
        arrayList.add("Class 12");
        arrayList.add("Varsity Admission Candidate");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        classSpinner.setAdapter(arrayAdapter);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectClassModify.this, SubjectSelectorModify.class);
                startActivity(intent);
            }
        });
    }
}