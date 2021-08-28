package com.example.votee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView name, fName, mName, citizen, mobNo, addr, voteText;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.textView);
        fName = findViewById(R.id.textView2);
        mName = findViewById(R.id.textView3);
        citizen= findViewById(R.id.textView4);
        mobNo = findViewById(R.id.textView5);
        addr = findViewById(R.id.textView6);
        voteText = findViewById(R.id.voteText);

        String userN = getIntent().getStringExtra("username");
        String fatherN = getIntent().getStringExtra("father");
        String motherN = getIntent().getStringExtra("mother");
        String citizenNo = getIntent().getStringExtra("citizenship");
        String phone = getIntent().getStringExtra("mobile");
        String adr = getIntent().getStringExtra("addresss");

        name.setText(userN);
        fName.setText(fatherN);
        mName.setText(motherN);
        citizen.setText(citizenNo);
        mobNo.setText(phone);
        addr.setText(adr);

        back=findViewById(R.id.detailBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Details.this, MainActivity.class));
            }
        });

        voteText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Details.this, VotingChefck.class));
            }
        });

    }
}