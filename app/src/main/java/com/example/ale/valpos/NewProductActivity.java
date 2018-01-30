package com.example.ale.valpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewProductActivity extends AppCompatActivity {
    TextView codPLU;
    EditText descripEditTxt;
    EditText cantExistEditTxt;
    CheckBox pesajeChckBx;
    CheckBox rebajaChckBx;
    CheckBox lottoChckBx;
    PLUs newPLUs;
    Button insertNewCheckBtn;
    DatabaseHelper newCheckDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);
        String newcodeplu = getIntent().getStringExtra("NEWCODEPLU");
        codPLU = findViewById(R.id.CodPluTxtView);
        descripEditTxt = findViewById(R.id.DescripcEditTxt);
        cantExistEditTxt = findViewById(R.id.CantidEditTxt);
        pesajeChckBx = findViewById(R.id.PesajeChckBx);
        rebajaChckBx = findViewById(R.id.RebajaChckBx);
        lottoChckBx = findViewById(R.id.LottoChckBx);
        insertNewCheckBtn = findViewById(R.id.InsertNewCheckBtn);
        newCheckDatabaseHelper = new DatabaseHelper(this);
        newPLUs = new PLUs();
        newPLUs.setBarCode(newcodeplu);
        codPLU.setText(newcodeplu);
        insertNewCheckInDB();
    }

    //Botón inserta nueva cuenta en BD y realiza la siguiente acción (??)
    public void insertNewCheckInDB(){
        insertNewCheckBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        insertValuesToPLUs();
                        boolean plusenbd = newCheckDatabaseHelper.insertPLUs(newPLUs);
                        if(plusenbd){
                            Toast.makeText(NewProductActivity.this,
                                    "El producto se añadió corrrectamente", Toast.LENGTH_LONG).show();
                        }else Toast.makeText(NewProductActivity.this,
                                "El producto NO se añadió", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void insertValuesToPLUs(){
        newPLUs.setDescripcion(descripEditTxt.getText().toString());
        newPLUs.setPVP("0");
        newPLUs.setCodDpto("0");
        newPLUs.setEsVariableSuPVP("0");
        newPLUs.setHayQueBorrarlo("0");
        if(pesajeChckBx.isChecked()){
            newPLUs.setEsDePesaje("1");
        }else newPLUs.setEsDePesaje("0");
        newPLUs.setCodDptoDeMenu("0");
        newPLUs.setCodARebaja("0");
        newPLUs.setExistencia(cantExistEditTxt.getText().toString());
        newPLUs.setEsFraccionable("0");
        if(rebajaChckBx.isChecked()){
            newPLUs.setEsDeRebaja("1");
        }else newPLUs.setEsDeRebaja("0");
        if(lottoChckBx.isChecked()){
            newPLUs.setEsLotto("1");
        }else newPLUs.setEsLotto("0");
    }
}
