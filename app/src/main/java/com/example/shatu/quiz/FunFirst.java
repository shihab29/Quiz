package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FunFirst extends AppCompatActivity {

    EditText password_ET;
    int password;
    int my_password = 2930;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_first);

        password_ET = (EditText)findViewById(R.id.password);
    }
    public void onOkButtonClick(View v){

        try {
            password = Integer.parseInt(password_ET.getText().toString());
            if (password == my_password) {
                IntentIq();
            } else {
                Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }
    public void IntentIq(){
        Intent iqIntent = new Intent(this,Fun.class);
        //iqIntent.putExtra("password",password);
        startActivity(iqIntent);
    }
}
