package com.example.buenasondas;


import android.os.Build;
import android.os.Bundle;




import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //boton 1
        final Button vibrate_btn = findViewById(R.id.bt_vibrate);
        final long[] pattern = {0, 100, 0, 100, 0, 100, 0, 100, 0, 100};
        final int[] amplitude = {0, 50, 0, 100, 0, 150, 0, 200, 0, 255};

        //boton 2
        final Button vibrate_btn2 = findViewById(R.id.bt_vibrate2);
        final long[] pattern2 = {0, 200, 0, 200, 0, 200, 0, 200, 0, 200};
        final int[] amplitude2 = {0, 255, 0, 100, 0, 100, 0, 250, 0, 255};

        //botton 3
        final Button vibrate_btn3 = findViewById(R.id.bt_vibrate3);
        final long[] pattern3 = {0, 300, 0, 100, 0, 300, 0, 400, 0, 200};
        final int[] amplitude3 = {0, 255, 0, 200, 0, 150, 0, 100, 0, 50};

        //botton 4
        final Button vibrate_btn4 = findViewById(R.id.bt_vibrate4);
        final long[] pattern4 = {0, 300, 0, 400, 0, 500, 0, 400, 0, 500};
        final int[] amplitude4 = {0, 255, 0, 100, 0, 50, 0, 50, 0, 255};

        //botton 5
        final Button vibrate_btn5 = findViewById(R.id.bt_vibrate5);
        final long[] pattern5 = {0, 400, 0, 200, 0, 400, 0, 200, 0, 400};
        final int[] amplitude5 = {0, 25, 0, 255, 0, 255, 0, 200, 0, 25};

        //botton 6
        final Button vibrate_btn6 = findViewById(R.id.bt_vibrate6);
        final long[] pattern6 = {0, 300, 0, 500, 0, 400, 0, 300, 0, 300};
        final int[] amplitude6 = {0, 50, 0, 50, 0, 50, 0, 200, 0, 255};

        //botton 7
        final Button vibrate_btn7 = findViewById(R.id.bt_vibrate7);
        final long[] pattern7 = {0, 500, 0, 300, 0, 500, 0, 300, 0, 200};
        final int[] amplitude7 = {0, 255, 0, 255, 0, 255, 0, 100, 0, 25};

        //botton 8
        final Button vibrate_btn8 = findViewById(R.id.bt_vibrate8);
        final long[] pattern8 = {0, 400, 0, 100, 0, 400, 0, 100, 0, 400};
        final int[] amplitude8 = {0, 25, 0, 25, 0, 25, 0, 25, 0, 25};

        //botton 9
        final Button vibrate_btn9 = findViewById(R.id.bt_vibrate9);
        final long[] pattern9 = {0, 250, 0, 350, 0, 550, 0, 350, 0, 250};
        final int[] amplitude9 = {0, 255, 0, 255, 0, 255, 0, 255, 0, 255};

        //vibracion y animacion
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);


        vibrate_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                vibrator.vibrate(VibrationEffect.createWaveform(pattern, amplitude,-1));
                vibrate_btn.startAnimation(animation);
            }
        });

        vibrate_btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                vibrator.vibrate(VibrationEffect.createWaveform(pattern2, amplitude2,-1));
                vibrate_btn2.startAnimation(animation);
            }
        });

        vibrate_btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern3, amplitude3,-1));
                vibrate_btn3.startAnimation(animation);
            }
        });

        vibrate_btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern4, amplitude4,-1));
                vibrate_btn4.startAnimation(animation);
            }
        });

        vibrate_btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern5, amplitude5,-1));
                vibrate_btn5.startAnimation(animation);
            }
        });

        vibrate_btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern6, amplitude6,-1));
                vibrate_btn6.startAnimation(animation);
            }
        });

        vibrate_btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern7, amplitude7,-1));
                vibrate_btn7.startAnimation(animation);
            }
        });

        vibrate_btn8.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                vibrator.vibrate(VibrationEffect.createWaveform(pattern8, amplitude8,-1));
                vibrate_btn8.startAnimation(animation);
            }
        });


        vibrate_btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                vibrator.vibrate(VibrationEffect.createWaveform(pattern9, amplitude9,-1));
                vibrate_btn9.startAnimation(animation);
            }
        });



    }


    public void tapToAnimate(View view) {
        Button button = (Button)findViewById(R.id.bt_vibrate2);
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final long[] pattern = {4000, 2600};

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        button.startAnimation(animation);


    }





}