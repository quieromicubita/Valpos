package com.example.ale.valpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton keyOneBtnImg;
    ImageButton keyTwoBtnImg;
    ImageButton keyThreeBtnImg;
    ImageButton keyFourBtnImg;
    ImageButton keyFiveBtnImg;
    ImageButton keySixBtnImg;
    ImageButton keySevenBtnImg;
    ImageButton keyEightBtnImg;
    ImageButton keyNineBtnImg;
    ImageButton keyZeroBtnImg;
    ImageButton keyDelBtnImg;
    ImageButton keyDoneBtnImg;
    ImageButton keySettingsBtnImg;
    ImageButton keyDotBtnImg;
    Animation animAlfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyOneBtnImg = findViewById(R.id.KeyOneImgBtn);
        keyTwoBtnImg = findViewById(R.id.KeyTwoImgBtn);
        keyThreeBtnImg = findViewById(R.id.KeyThreeImgBtn);
        keyFourBtnImg = findViewById(R.id.KeyFourImgBtn);
        keyFiveBtnImg = findViewById(R.id.KeyFiveImgBtn);
        keySixBtnImg = findViewById(R.id.KeySixImgBtn);
        keySevenBtnImg = findViewById(R.id.KeySevenImgBtn);
        keyEightBtnImg = findViewById(R.id.KeyEightImgBtn);
        keyNineBtnImg = findViewById(R.id.KeyNineImgBtn);
        keyZeroBtnImg = findViewById(R.id.KeyZeroImgBtn);
        keyDelBtnImg = findViewById(R.id.KeyDelImgBtn);
        keyDoneBtnImg = findViewById(R.id.KeyDoneImgBtn);
        keySettingsBtnImg = findViewById(R.id.KeySettingsImgBtn);
        keyDotBtnImg = findViewById(R.id.KeyDotImgBtn);
        animAlfa = AnimationUtils.loadAnimation(this, R.anim.btn_anim);
        btnOnePressed();
        btnTwoPressed();
        btnThreePressed();
        btnFourPressed();
        btnFivePressed();
        btnSixPressed();
        btnSevenPressed();
        btnEightPressed();
        btnNinePressed();
        btnDelPressed();
        btnDelPressed();
        btnDonePressed();
        btnDonePressed();
        btnSettingsPressed();
        btnDotPressed();
        btnZeroPressed();
    }


    //Button one
    public void btnOnePressed(){
        keyOneBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyOneBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "ONE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    //Button two
    public void btnTwoPressed(){
        keyTwoBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyTwoBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "TWO", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnThreePressed(){
        keyThreeBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyThreeBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "THREE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnFourPressed(){
        keyFourBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyFourBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "FOUR", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnFivePressed(){
        keyFiveBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyFiveBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "FIVE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnSixPressed(){
        keySixBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keySixBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "SIX", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnSevenPressed(){
        keySevenBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keySevenBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "SEVEN", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnEightPressed(){
        keyEightBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyEightBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "EIGHT", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnNinePressed(){
        keyNineBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyNineBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "NINE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnZeroPressed(){
        keyZeroBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyZeroBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "ZERO", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnDelPressed(){
        keyDelBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyDelBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "DEL", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnDonePressed(){
        keyDoneBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyDoneBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "DONE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnSettingsPressed(){
        keySettingsBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keySettingsBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "SETTINGS", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void btnDotPressed(){
        keyDotBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        keyDotBtnImg.setActivated(true);
                        Toast.makeText(MainActivity.this, "DOT", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
