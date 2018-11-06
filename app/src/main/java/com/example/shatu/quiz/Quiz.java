package com.example.shatu.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    TextView ques_TV,question_TV,correct_TV,wrong_TV,score_TV;
    RadioButton optionA_RB, optionB_RB,optionC_RB, optionD_RB;
    RadioButton selectedRadioButton;

    int second = 0;
    boolean run=true;
    TextView time1_TV,time2_TV;

    int totalNumberOfQues = 10;
    int quesNo = 0;
    int question = 0, correct = 0, wrong = 0, score = 0;

    RadioButton[] correctAns = new RadioButton[100];
    RadioGroup allOptions;


    String[] questions = new String[100];
    String[] optionA = new String[100];
    String[] optionB = new String[100];
    String[] optionC = new String[100];
    String[] optionD = new String[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        runtime();
        readyContent();
        readyQues();
        readyOptionA();
        readyOptionB();
        readyOptionC();
        readyOptionD();
        readyAns();
        showQuesAndOptions();
    }

    public  void runtime(){
        final Handler handler=new Handler();
        if(run) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    int sec = second % 1000;
                    String time = String.format("%d", sec);
                    int intTime = Integer.parseInt(time);

                    time1_TV.setText(time);
                    time2_TV.setText(time);

                    second++;

                    handler.postDelayed(this, 1000);
                    if(intTime >=50){
                        time1_TV.setTextColor(Color.parseColor("#f50101"));
                        time2_TV.setTextColor(Color.parseColor("#f50101"));
                    }

                    if (intTime == 60 && run==true) {
                        run = false;
                        IntentScore();
                    }
                }
            });
        }
    }

    public void onSubmitButtonClick(View v){
        if(quesNo<totalNumberOfQues){
            quesNo++;

            question++;
            question_TV.setText(Integer.toString(question));

            selectedRadioButton = (RadioButton)findViewById(allOptions.getCheckedRadioButtonId());

            if(allOptions.getCheckedRadioButtonId()==-1){
                //Do Nothing
            }
            else if(selectedRadioButton==correctAns[quesNo-1]){
                Toast.makeText(this,"Right",Toast.LENGTH_SHORT).show();

                correct++;
                correct_TV.setText(Integer.toString(correct));
                score++;
                score_TV.setText(Integer.toString(score));
                selectedRadioButton = null;
            }
            else{
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();

                /*Toast toast= Toast.makeText(getApplicationContext(),
                        "Correct Ans: "+correctAns[quesNo-1].getText().toString(), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER| Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();*/

                wrong++;
                wrong_TV.setText(Integer.toString(wrong));
                score--;
                score_TV.setText(Integer.toString(score));
                selectedRadioButton = null;
            }
            resetRadioButtons();
            showQuesAndOptions();

            if(quesNo==totalNumberOfQues){
                IntentScore();
            }
        }
        else{
            IntentScore();
        }
    }

    public void onEndButtonClick(View v){

        run=false;
        IntentScore();
    }

    public void IntentScore(){
        Intent scoreIntent = new Intent(this, Score.class);
        scoreIntent.putExtra("correct",correct);
        scoreIntent.putExtra("wrong",wrong);
        scoreIntent.putExtra("score",score);
        scoreIntent.putExtra("question",question);

        startActivity(scoreIntent);
    }

    public void resetRadioButtons() {

        allOptions.clearCheck();
    }


    public void readyContent() {
        ques_TV = (TextView) findViewById(R.id.tvQuestion);
        optionA_RB = (RadioButton) findViewById(R.id.a);
        optionB_RB = (RadioButton) findViewById(R.id.b);
        optionC_RB = (RadioButton) findViewById(R.id.c);
        optionD_RB = (RadioButton) findViewById(R.id.d);
        allOptions = (RadioGroup) findViewById(R.id.rg);
        question_TV = (TextView)findViewById(R.id.question);
        correct_TV = (TextView)findViewById(R.id.correct);
        wrong_TV = (TextView)findViewById(R.id.wrong);
        score_TV = (TextView)findViewById(R.id.score);

        time1_TV = (TextView)findViewById(R.id.time1);
        time2_TV = (TextView)findViewById(R.id.time2);
    }

    public void showQuesAndOptions() {
        ques_TV.setText(questions[quesNo]);
        optionA_RB.setText(optionA[quesNo]);
        optionB_RB.setText(optionB[quesNo]);
        optionC_RB.setText(optionC[quesNo]);
        optionD_RB.setText(optionD[quesNo]);
    }

    public void readyAns() {
        correctAns[0] = optionA_RB;
        correctAns[1] = optionD_RB;
        correctAns[2] = optionB_RB;
        correctAns[3] = optionC_RB;
        correctAns[4] = optionC_RB;
        correctAns[5] = optionB_RB;
        correctAns[6] = optionB_RB;
        correctAns[7] = optionA_RB;
        correctAns[8] = optionA_RB;
        correctAns[9] = optionD_RB;
    }

    public void readyQues(){
        questions[0] = "1. Which programming language is the best ?";
        questions[1] = "2. Which will legally declare, construct, and initialize an array ?";
        questions[2] = "3. Which is a valid keyword in java ?";
        questions[3] = "4. What difference does the 5th generation computer have from other generation computers ?";
        questions[4] = "5. 'OS' computer abbreviation usually means ?";
        questions[5] = "6. '.MOV' extension refers usually to what kind of file ?";
        questions[6] = "7. Who developed Yahoo ?";
        questions[7] = "8. In what year was the \"@\" chosen for its use in e-mail addresses ?";
        questions[8] = "9. 'DB' computer abbreviation usually means ?";
        questions[9] = "10. What was the first ARPANET message?";
        questions[10] = "New Question Coming Soon...."  +
                "Press 'SUBMIT' or 'END' to see your 'SCORE'";
    }

    public void readyOptionA(){
        optionA[0] = "A. Java";
        optionA[1] = "A. int [] myList = {\"1\", \"2\", \"3\"}";
        optionA[2] = "A. string";
        optionA[3] = "A. Scientific code";
        optionA[4] = "A. Order of Significance";
        optionA[5] = "A. Image file";
        optionA[6] = "A. Dennis Ritchie & Ken Thompson";
        optionA[7] = "A. 1972";
        optionA[8] = "A. Database";
        optionA[9] = "A. \"cyberspace, the final frontier\"";
        optionA[10] = "Updating...";
    }

    public void readyOptionB(){
        optionB[0] = "B. C";
        optionB[1] = "B. int [] myList = (5, 8, 2)";
        optionB[2] = "B. interface";
        optionB[3] = "B. Object Oriented Programming";
        optionB[4] = "B. Open Software";
        optionB[5] = "B. Movie file";
        optionB[6] = "B. David Filo & Jerry Yang";
        optionB[7] = "B. 1976";
        optionB[8] = "B. Double Byte";
        optionB[9] = "B. \"hello world\"";
        optionB[10] = "Updating...";
    }

    public void readyOptionC(){
        optionC[0] = "C. C++";
        optionC[1] = "C. int myList [] [] = {4,9,7,0}";
        optionC[2] = "C. Float";
        optionC[3] = "C. Technological advancement";
        optionC[4] = "C. Operating System";
        optionC[5] = "C. Audio file";
        optionC[6] = "C. Vint Cerf & Robert Kahn";
        optionC[7] = "C. 1980";
        optionC[8] = "C. Data Block";
        optionC[9] = "C. \"mary had a little lamb\"";
        optionC[10] = "Updating...";
    }

    public void readyOptionD(){
        optionD[0] = "D. C#";
        optionD[1] = "D. int myList [] = {4, 3, 7}";
        optionD[2] = "D. unsigned";
        optionD[3] = "D. All of the above";
        optionD[4] = "D. Optical Sensor";
        optionD[5] = "D. MS Office document";
        optionD[6] = "D. Steve Case & Jeff Bezos";
        optionD[7] = "D. 1984";
        optionD[8] = "D. Driver Boot";
        optionD[9] = "D. \"lo\"";
        optionD[10] = "Updating...";
    }

}
