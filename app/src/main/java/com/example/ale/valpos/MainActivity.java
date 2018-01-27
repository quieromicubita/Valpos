package com.example.ale.valpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton keyOneBtnImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyOneBtnImg = findViewById(R.id.KeyOneImgBtn);
        btnOnePressed();
    }

    public void btnOnePressed(){
        keyOneBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        keyOneBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "ONE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
