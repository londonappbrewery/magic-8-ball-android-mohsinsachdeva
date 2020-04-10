package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button ask;
        ask = (Button)requireViewById(R.id.askmeplz);
        final ImageView predictor;
        predictor = (ImageView)requireViewById(R.id.predicctor);
        final int[] picarray ={
                R.drawable.ball1, R.drawable.ball2,R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randgenerator = new Random();
                int rand = randgenerator.nextInt(4);
                predictor.setImageResource(picarray[rand]);


            }
        });



    }
}
