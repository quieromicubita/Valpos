package com.example.ale.valpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.TextView;
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
    TextView entraCodigoTxtView;

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
        entraCodigoTxtView = findViewById(R.id.EntraCodigoTxtView);
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("1");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "1");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("2");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "2");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("3");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "3");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("4");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "4");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("5");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "5");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("6");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "6");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("7");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "7");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("8");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "8");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("9");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "9");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("0");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "0");
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals(""))
                            Toast.makeText(MainActivity.this, "Nothing to delete", Toast.LENGTH_SHORT).show();
                        else
                            txtviewcharsequence = txtviewcharsequence.toString().substring(0,
                                txtviewcharsequence.length() - 1);
                            entraCodigoTxtView.setText(txtviewcharsequence);
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText(".");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + ".");
                    }
                }
        );
    }
}
