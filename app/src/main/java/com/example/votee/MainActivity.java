package com.example.votee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fullN, fatherN, motherN, citizen, mobNo, addr;
    Button cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullN=findViewById(R.id.fullN);
        fatherN=findViewById(R.id.fatherN);
        motherN=findViewById(R.id.motherN);
        citizen=findViewById(R.id.citizen);
        mobNo=findViewById(R.id.mobNO);
        addr=findViewById(R.id.addr);

        cont=findViewById(R.id.conDetail);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = fullN.getText().toString();
                String fName = fatherN.getText().toString();
                String mName = motherN.getText().toString();
                String citizenNo = citizen.getText().toString();
                String mobileN = mobNo.getText().toString();
                String address = addr.getText().toString();

                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("username", fullName);
                intent.putExtra("father", fName);
                intent.putExtra("mother",mName);
                intent.putExtra("citizenship",citizenNo);
                intent.putExtra("mobile",mobileN);
                intent.putExtra("addresss",address);

                startActivity(intent);
            }
        });
    }
}