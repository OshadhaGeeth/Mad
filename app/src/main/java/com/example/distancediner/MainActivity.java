package com.example.distancediner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                btnGo();
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profit Calculator");
        //actionBar.setSubtitle("Insert your details to calculate");
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public void btnGo(){
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

}