package com.example.luckynumberapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText;
    EditText userName;
    Button luckButton;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.welcome);
        userName = findViewById(R.id.userName);
        luckButton = findViewById(R.id.luckButton);





     luckButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name = userName.getText().toString();


        Intent i = new Intent(
                getApplicationContext(),
                Page2.class
        );

        i.putExtra("name",name);
          startActivity(i);
    }});}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }


}