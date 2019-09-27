package com.leonard.demos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);

        Button btnGlobalSignUp = (Button) findViewById(R.id.button2);

        btnGlobalSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nxtPage = new Intent(StudentSignUp.this, StudentSignIn.class);
                startActivity(nxtPage);
            }
        });
    }
}
