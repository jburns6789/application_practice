package com.zybooks.application_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNextButton();
    }

    public void clickFunction(View view){

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        EditText secondName = (EditText) findViewById(R.id.secondName);

       Log.i("Info", "Button Pressed");

       Log.i("Values", nameEditText.getText().toString());

       Log.i("Values", secondName.getText().toString());

       Toast.makeText(this, "Hello " + secondName.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void pictureChange(View view){
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.outlander);
    }

    private void configureNextButton(){
        Button screenChange = (Button) findViewById((R.id.screenChange));
        screenChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
            });
        }
}





