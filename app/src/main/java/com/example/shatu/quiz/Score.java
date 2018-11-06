package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView total_TV,correct_TV,wrong_TV,score_TV,comment_TV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        total_TV = (TextView)findViewById(R.id.total);
        correct_TV = (TextView)findViewById(R.id.correct);
        wrong_TV = (TextView)findViewById(R.id.wrong);
        score_TV = (TextView)findViewById(R.id.score);
        comment_TV = (TextView)findViewById(R.id.comment);

        getValue();
    }
    public void getValue(){
        Bundle extras = getIntent().getExtras();
        int total = extras.getInt("question");
        int correct = extras.getInt("correct");
        int wrong = extras.getInt("wrong");
        int score = extras.getInt("score");

        total_TV.setText(Integer.toString(total));
        correct_TV.setText(Integer.toString(correct));
        wrong_TV.setText(Integer.toString(wrong));
        score_TV.setText(Integer.toString(score));

        if(total == 0){
            comment_TV.setText("Please Start Again");
        }
        else{
            int percent;
            percent = (score*100)/total;
            comment_TV.setText(Integer.toString(percent));

            if(percent==100){
                comment_TV.setText("Execellent !!! " +
                    "You are Awesome");
            }
            else if(percent>=75 && percent<100){
                comment_TV.setText("Nice Performance ! " +
                    "Good Try");
            }
            else if(percent>=50 && percent<75){
                 comment_TV.setText("Not Bad ! " +
                    "Better Luck Next Time");
            }
            else if(percent>=1 && percent<50){
                comment_TV.setText("Not Good ! " +
                    "Try Harder");
            }
            else{
                comment_TV.setText("Too Poor !!! " +
                    "Sorry");
            }
        }
    }

    public void onOkButtonClick(View v){
        Intent ok = new Intent(this,Option.class);
        startActivity(ok);
    }
}
