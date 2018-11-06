package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IqFirst extends AppCompatActivity {

    EditText NumOfQues_ET;
    int NumOfQues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq_first);

        NumOfQues_ET = (EditText)findViewById(R.id.question_et);
    }
    public void onGoButtonClick(View v){

       try {
           NumOfQues = Integer.parseInt(NumOfQues_ET.getText().toString());
           IntentIq();
       }catch (Exception e){
           Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
       }
    }
    public void IntentIq(){
        Intent iqIntent = new Intent(this,Iq.class);
        iqIntent.putExtra("NumOfQues",NumOfQues);
        startActivity(iqIntent);
    }
}
