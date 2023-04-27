package com.zybooks.application_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        thirdScreenReturnToMain();
        //fade();
    }

    public void thirdScreenReturnToMain(){
        Button thirdScreenMain = (Button) findViewById(R.id.thirdScreenBack);
        thirdScreenMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void fade(View view){
        Log.i("Info", "Imageview Tapped");

        ImageView imageView = (ImageView) findViewById((R.id.imageView));

        imageView.animate().alpha(0).setDuration(2000);
    }

}