package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    public void developer (View v){
        Intent developer = new Intent(this,Developer.class);
        startActivity(developer);
    }
    public void start(View v){
        Intent start = new Intent(this,Start.class);
        startActivity(start);
    }
    public void iq_first(View v){
        Intent iq = new Intent(this,IqFirst.class);
        startActivity(iq);
    }
    public void fun_first(View v){
        Intent fun = new Intent(this,FunFirst.class);
        startActivity(fun);
    }
    public void quiz_first(View v){
        Intent quiz = new Intent(this,QuizFirst.class);
        startActivity(quiz);
    }
    public void about (View v) {
        Intent about = new Intent(this, About.class);
        startActivity(about);
    }

}
