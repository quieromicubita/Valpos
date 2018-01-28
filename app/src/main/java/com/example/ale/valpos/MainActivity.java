package com.example.ale.valpos;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
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
    OperadoresPerfiles operadoresPerfiles1;
    OperadoresPerfiles operadoresPerfiles2;
    OperadoresPerfiles operadoresPerfiles3;
    OperadoresPerfiles operadoresPerfiles4;
    OperadoresPerfiles operadoresPerfiles5;
    OperadoresPerfiles operadoresPerfiles6;
    DatabaseHelper mDataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDataBaseHelper = new DatabaseHelper(this);
        operadoresPerfiles1 = new OperadoresPerfiles();
        operadoresPerfiles2 = new OperadoresPerfiles();
        operadoresPerfiles3 = new OperadoresPerfiles();
        operadoresPerfiles4 = new OperadoresPerfiles();
        operadoresPerfiles5 = new OperadoresPerfiles();
        operadoresPerfiles6 = new OperadoresPerfiles();
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
        showAllOperatorProfiles();

        setOperadoresPerfiles(operadoresPerfiles1, operadoresPerfiles2, operadoresPerfiles3,
                 operadoresPerfiles4, operadoresPerfiles5, operadoresPerfiles6
        );

        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles1);
        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles2);
        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles3);
        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles4);
        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles5);
        mDataBaseHelper.insertOperadorPerfil(operadoresPerfiles6);

    }

    public void showAllOperatorProfiles(){
        Cursor operatorprofilecursor = mDataBaseHelper.getOperatorProfile();
        if(operatorprofilecursor.getCount() == 0){
            // Show message
            showMessage("Error", "No data found");
            return;
        }

        StringBuffer buffer = new StringBuffer();
        while (operatorprofilecursor.moveToNext()){
            buffer.append("ID: "+ operatorprofilecursor.getString(0)+"\n");
            buffer.append("Descripción: "+ operatorprofilecursor.getString(1)+"\n");
            buffer.append("Permisos: "+ operatorprofilecursor.getString(2)+"\n");
            buffer.append("Estado: "+ operatorprofilecursor.getString(3)+"\n");
            buffer.append("Hay que borrarlo: "+ operatorprofilecursor.getString(4)+"\n\n");
        }

        // Show all data
        showMessage("Data", buffer.toString());
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    //Assign values to OperadoresPerfiles
    public void setOperadoresPerfiles(OperadoresPerfiles operadoresPerfiles1,
                                      OperadoresPerfiles operadoresPerfiles2,
                                      OperadoresPerfiles operadoresPerfiles3,
                                      OperadoresPerfiles operadoresPerfiles4,
                                      OperadoresPerfiles operadoresPerfiles5,
                                      OperadoresPerfiles operadoresPerfiles6) {

        this.operadoresPerfiles1 = operadoresPerfiles1;
        operadoresPerfiles1.setDescripcion("Cajero");
        operadoresPerfiles1.setPermisos("26591");
        operadoresPerfiles1.setEstado("0");
        operadoresPerfiles1.setHayQueBorrarlo("0");

        this.operadoresPerfiles2 = operadoresPerfiles2;
        operadoresPerfiles2.setDescripcion("Supervisor");
        operadoresPerfiles2.setPermisos("425983");
        operadoresPerfiles2.setEstado("0");
        operadoresPerfiles2.setHayQueBorrarlo("0");

        this.operadoresPerfiles3 = operadoresPerfiles3;
        operadoresPerfiles3.setDescripcion("Dependiente");
        operadoresPerfiles3.setPermisos("256");
        operadoresPerfiles3.setEstado("0");
        operadoresPerfiles3.setHayQueBorrarlo("0");

        this.operadoresPerfiles4 = operadoresPerfiles4;
        operadoresPerfiles4.setDescripcion("Informático");
        operadoresPerfiles4.setPermisos("524287");
        operadoresPerfiles4.setEstado("0");
        operadoresPerfiles4.setHayQueBorrarlo("0");

        this.operadoresPerfiles5 = operadoresPerfiles5;
        operadoresPerfiles5.setDescripcion("Dependiente/Cajero");
        operadoresPerfiles5.setPermisos("157663");
        operadoresPerfiles5.setEstado("0");
        operadoresPerfiles5.setHayQueBorrarlo("0");

        this.operadoresPerfiles6 = operadoresPerfiles6;
        operadoresPerfiles6.setDescripcion("Cierre de Turno");
        operadoresPerfiles6.setPermisos("16480");
        operadoresPerfiles6.setEstado("0");
        operadoresPerfiles6.setHayQueBorrarlo("0");
    }

    //Button one
    public void btnOnePressed(){
        keyOneBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
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
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("2");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "2");
                    }
                }
        );
    }

    //Button three
    public void btnThreePressed(){
        keyThreeBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("3");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "3");
                    }
                }
        );
    }

    //Button four
    public void btnFourPressed(){
        keyFourBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("4");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "4");
                    }
                }
        );
    }

    //Button five
    public void btnFivePressed(){
        keyFiveBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("5");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "5");
                    }
                }
        );
    }

    //Button six
    public void btnSixPressed(){
        keySixBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("6");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "6");
                    }
                }
        );
    }

    //Button seven
    public void btnSevenPressed(){
        keySevenBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("7");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "7");
                    }
                }
        );
    }

    //Button eight
    public void btnEightPressed(){
        keyEightBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("8");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "8");
                    }
                }
        );
    }

    //Button nine
    public void btnNinePressed(){
        keyNineBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("9");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "9");
                    }
                }
        );
    }

    //Button zero
    public void btnZeroPressed(){
        keyZeroBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        CharSequence txtviewcharsequence = entraCodigoTxtView.getText();
                        if(txtviewcharsequence.toString().equals("ENTER ACCESS CODE"))
                            entraCodigoTxtView.setText("0");
                        else
                            entraCodigoTxtView.setText(txtviewcharsequence + "0");
                    }
                }
        );
    }

    //Button del
    public void btnDelPressed(){
        keyDelBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
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

    //Button done
    public void btnDonePressed(){
        keyDoneBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        Toast.makeText(MainActivity.this, "DONE", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    //Button settings
    public void btnSettingsPressed(){
        keySettingsBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
                        Toast.makeText(MainActivity.this, "SETTINGS", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    //Button dot
    public void btnDotPressed(){
        keyDotBtnImg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(animAlfa);
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
