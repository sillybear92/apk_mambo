package com.example.bbik.apk_mambo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RemoteActivity extends AppCompatActivity{
    Intent intent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remote);

        intent = getIntent();
        Log.d("Log","Hi Remote");

        RemoteBtn onClickListener = new RemoteBtn();

        Button buttonUp=(Button)findViewById(R.id.up_mambo);
        buttonUp.setOnClickListener(onClickListener);
        Button buttonDown=(Button)findViewById(R.id.down_mambo);
        buttonDown.setOnClickListener(onClickListener);
        Button buttonLeft=(Button)findViewById(R.id.left_mambo);
        buttonLeft.setOnClickListener(onClickListener);
        Button buttonRight=(Button)findViewById(R.id.right_mambo);
        buttonRight.setOnClickListener(onClickListener);
        Button buttonFront=(Button)findViewById(R.id.front_mambo);
        buttonFront.setOnClickListener(onClickListener);
        Button buttonBack=(Button)findViewById(R.id.back_mambo);
        buttonBack.setOnClickListener(onClickListener);
        Button buttonLturn=(Button)findViewById(R.id.lturn_mambo);
        buttonLturn.setOnClickListener(onClickListener);
        Button buttonRturn=(Button)findViewById(R.id.rturn_mambo);
        buttonRturn.setOnClickListener(onClickListener);
        Button buttonTakeOff=(Button)findViewById(R.id.takeoff_mambo);
        buttonTakeOff.setOnClickListener(onClickListener);
        Button buttonLand=(Button)findViewById(R.id.land_mambo);
        buttonLand.setOnClickListener(onClickListener);



    }

    public class RemoteBtn implements Button.OnClickListener{
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.up_mambo:
                    Log.d("Log","UP MAMBO");
                    break;
                case R.id.left_mambo:
                    Log.d("Log","LEFT MAMBO");
                    break;
                case R.id.right_mambo:
                    Log.d("Log","RIGHT MAMBO");
                    break;
                case R.id.down_mambo:
                    Log.d("Log","DOWN MAMBO");
                    break;
                case R.id.front_mambo:
                    Log.d("Log","GO FRONT MAMBO");
                    break;
                case R.id.back_mambo:
                    Log.d("Log","GO BACK MAMBO");
                    break;
                case R.id.lturn_mambo:
                    Log.d("Log","TURN LEFT MAMBO");
                    break;
                case R.id.rturn_mambo:
                    Log.d("Log","TURN RIGHT MAMBO");
                    break;
                case R.id.takeoff_mambo:
                    Log.d("Log","Take Off MAMBO");
                    break;
                case R.id.land_mambo:
                    Log.d("Log","Land MAMBO");
                    break;
            }
        }
    }
}
