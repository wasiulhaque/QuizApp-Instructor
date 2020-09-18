package com.example.quizapp_instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudyMaterials extends AppCompatActivity {
    Button AddMaterialbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_materials);

        findViewById(R.id.AddMaterialbtn);
        AddMaterialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(StudyMaterials.this, UploadStudyMaterials.class);
                startActivity(intent);*/
            }
        });
    }
}
