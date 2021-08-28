package com.example.votee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class VotingChefck extends AppCompatActivity {

    Button checkBtn, back;
    EditText ageArea;
    ImageView circleR;
    TextView ageResult, home;
    int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_chefck);

        checkBtn = findViewById(R.id.checkBtn);
        ageArea = findViewById(R.id.ageArea);
        circleR = findViewById(R.id.circleR);
        ageResult = findViewById(R.id.ageResult);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VotingChefck.this, Details.class));
            }
        });
        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age = Integer.valueOf(ageArea.getText().toString());
                if(age >= 18){
                    ageResult.setText("You can vote!");
                    circleR.setBackgroundResource(R.drawable.green_c);
                }
                else{
                    ageResult.setText("You can't vote!");
                    circleR.setBackgroundResource(R.drawable.red_c);
                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VotingChefck.this, MainActivity.class));
            }
        });
    }
}