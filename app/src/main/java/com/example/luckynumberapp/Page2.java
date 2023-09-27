package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class Page2 extends AppCompatActivity {



    Button shareButton;
    TextView headerText,resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        shareButton =findViewById(R.id.shareButton);
        headerText = findViewById(R.id.headerText);
        resultText = findViewById(R.id.resultText);


shareButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = getIntent();
        String userName = i.getStringExtra("name");


        int random_number = generateRandomNumber();
        resultText.setText(" " + random_number);



        shareDate(userName, random_number);
    }
});


    }

    public int generateRandomNumber(){

        Random random = new Random();
int upper_limit= 1000;


int randomNumberGenerated = random.nextInt(upper_limit);
return randomNumberGenerated;

    }

public void shareDate(String userName, int randomNumber){

Intent i = new Intent(Intent.ACTION_SEND);
i.setType("text/plain");

i.putExtra(Intent.EXTRA_SUBJECT,userName+" got Lucky Today !!");
i.putExtra(Intent.EXTRA_TEXT, "His lucky Number is "+randomNumber);

startActivity(Intent.createChooser(i,"Choose a platform"));

}



}
