package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView text_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        text_TV = (TextView)findViewById(R.id.text);

        text();
    }
    public void text(){

        String about = "Welcome to our application \"QUIZ\".\n" +
                "\n" +
                "We can use this application in lieu of typical written MCQ system. Basically it is an educational app.So the developers tried to add different features like solving question without any time limit or within time limit or choosing the amount of questions.\n" +
                "\n" +
                "And finally if boredom fully consume yourself then there is a fun part \"FUN\" that will refresh your mind.\n" +
                "\n" +
                "\n" +
                "*START*\n" +
                "1. A bunch of questions will be set automatically chosen by the Developers in the begining.\n" +
                "2. Every question have four options.\n" +
                "3. User have to choose only one option and then select 'SUBMIT' to progress.\n" +
                "4. User gets one point for every correct answer but s/he will loose one point for a wrong answer.\n" +
                "5. If user don't know any answer s/he can skip the question by selecting 'SUBMIT' button without checking any option.This won't add or remove any point.\n" +
                "6. If user dont want to play along s/he can end the QUIZ by seleting 'END' button.\n" +
                "7. Finally s/he will get a COMMENT according to his score.\n" +
                "\n" +
                "*QUIZ*\n" +
                "1. Rules are similar to the rules of Start.\n" +
                "2. User have to answer many questions within 60 seconds.\n" +
                "3. After 60 seconds the app will automatically go to the END page.\n" +
                "\n" +
                "*IQ TEST*\n" +
                "1. Rules are similar to the rules of Start.\n" +
                "2. This time all questions are based on IQ type.\n" +
                "3. At the begining user have to put his/her name,age and the number of questions that s/he want to answer.\n" +
                "\n" +
                "*FUN*\n" +
                "1.As this part is only for fun,one has to enter password to enter the FUN part.\n" +
                "2.The the user have to enter their Name,Roll,Weight and Relationship status.\n" +
                "3.Finally the \"QUIZ\" will judge the user and give him/her a compliment.\n" +
                "4.The developers hope that this compliment will make the user jolly.\n" +
                "\n" +
                "*DEVELOPER*\n" +
                "1. User can see our picture & basic information :p\n" +
                "\n" +
                "WE HOPE THAT YOU WILL LIKE OUR APPLICATION!!!\n" +
                "\n";

        text_TV.setMovementMethod(new ScrollingMovementMethod());
        text_TV.setText(about);
    }
    public void onBackButtonClick(View v){
        Intent back = new Intent(this,Option.class);
        startActivity(back);
    }
}
