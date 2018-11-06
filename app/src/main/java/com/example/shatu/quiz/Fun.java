package com.example.shatu.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fun extends AppCompatActivity {

    EditText id_ET;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        id_ET=(EditText) findViewById(R.id.id);
    }

    public void onNextButtonClick(View v){

        try {
            id = Integer.parseInt(id_ET.getText().toString());

            if(id==29){
                id29();
            }
            else if(id==30){
                id30();
            }
            else if(id==31){
                id31();
            }
            else if(id==32){
                id32();
            }
            else if(id==33){
                id33();
            }
            else if(id==34){
                id34();
            }
            else if(id==35){
                id35();
            }
            else if(id==36){
                id36();
            }
            else if(id==37){
                id37();
            }
            else if(id==39){
                id39();
            }
            else if(id==40){
                id40();
            }
            else if(id==41){
                id41();
            }
            else if(id==42){
                id42();
            }
            else if(id==43){
                id43();
            }
            else if(id==44){
                id44();
            }
            else if(id==45){
                id45();
            }
            else if(id==47){
                id47();
            }
            else if(id==48){
                id48();
            }
            else if(id==49){
                id49();
            }
            else{
                idelse();
            }
        }catch (Exception e){
            Toast.makeText(this,"Invalid ID",Toast.LENGTH_SHORT).show();
        }
    }

    public void id29(){
        Intent id = new Intent(this,Id29.class);
        startActivity(id);
    }

    public void id30(){
        Intent id = new Intent(this,Id30.class);
        startActivity(id);
    }

    public void id31(){
        Intent id = new Intent(this,Id31.class);
        startActivity(id);
    }

    public void id32(){
        Intent id = new Intent(this,Id32.class);
        startActivity(id);
    }

    public void id33(){
        Intent id = new Intent(this,Id33.class);
        startActivity(id);
    }

    public void id34(){
        Intent id = new Intent(this,Id34.class);
        startActivity(id);
    }
    public void id35(){
        Intent id = new Intent(this,Id35.class);
        startActivity(id);
    }

    public void id36(){
        Intent id = new Intent(this,Id36.class);
        startActivity(id);
    }

    public void id37(){
        Intent id = new Intent(this,Id37.class);
        startActivity(id);
    }

    public void id39(){
        Intent id = new Intent(this,Id39.class);
        startActivity(id);
    }

    public void id40(){
        Intent id = new Intent(this,Id40.class);
        startActivity(id);
    }

    public void id41(){
        Intent id = new Intent(this,Id41.class);
        startActivity(id);
    }

    public void id42(){
        Intent id = new Intent(this,Id42.class);
        startActivity(id);
    }

    public void id43(){
        Intent id = new Intent(this,Id43.class);
        startActivity(id);
    }

    public void id44(){
        Intent id = new Intent(this,Id44.class);
        startActivity(id);
    }

    public void id45(){
        Intent id = new Intent(this,Id45.class);
        startActivity(id);
    }

    public void id47(){
        Intent id = new Intent(this,Id47.class);
        startActivity(id);
    }

    public void id48(){
        Intent id = new Intent(this,Id48.class);
        startActivity(id);
    }

    public void id49(){
        Intent id = new Intent(this,Id49.class);
        startActivity(id);
    }

    public void idelse(){
        Intent id = new Intent(this,Idelse.class);
        startActivity(id);
    }
}
