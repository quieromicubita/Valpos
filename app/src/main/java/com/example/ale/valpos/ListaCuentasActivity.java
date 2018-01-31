package com.example.ale.valpos;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ListaCuentasActivity extends AppCompatActivity {
    Operador operadorActivo;
    TextView operadorActivoTxtView;
    DatabaseHelper lstDataBaseHelper;
    Spinner ordenarCuentasSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentas);
        String contrasenha = getIntent().getStringExtra("CONTRASENHA");
        operadorActivo = new Operador();
        operadorActivo.setContrasenha(contrasenha);
        operadorActivoTxtView = findViewById(R.id.OperadorActivoTxtView);
        lstDataBaseHelper = new DatabaseHelper(this);
        ordenarCuentasSpinner = findViewById(R.id.OrdenarCuentasSpinner);
        listaCuentas();
        ordenarCuentasSpinner();
    }

    public void ordenarCuentasSpinner(){
        ArrayAdapter<String> ordenaCuentasAdapter = new ArrayAdapter<String>(ListaCuentasActivity.this,
                R.layout.spinner_ordenar_cuentas, getResources().getStringArray(R.array.ordenarcuentas));
        ordenaCuentasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ordenarCuentasSpinner.setAdapter(ordenaCuentasAdapter);
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    public void listaCuentas(){

        Cursor operatorname = lstDataBaseHelper.getNameOfOperator(operadorActivo);
        if(operatorname.getCount() > 0)
            while (operatorname.moveToNext()){
                String nameresult = operatorname.getString(0);
                operadorActivoTxtView.setText("Operator: " + nameresult);
                operadorActivo.setNemo(nameresult);
            }

        boolean contrasenhaExiste = lstDataBaseHelper.validarContrasenhaOperador(operadorActivo);
        if(contrasenhaExiste == true){
            Cursor res = lstDataBaseHelper.getCuentas();
            if(res.getCount() == 0){
                // Show message
                showMessage("Vuelve a intentar", "No se encontraron cuentas");
                return;
            }

            final String cuentaslstview [] = new String [res.getCount()];
            final String cuentasidxclicked [] = new String [res.getCount()];
            int c = 0;
            while (res.moveToNext()){
                String cuenta = res.getString(0) + res.getString(1) +
                        "           " + res.getString(2) + "        " + res.getString(8);
                cuentaslstview[c] = cuenta.substring(1, cuenta.length());
                cuentasidxclicked[c] = cuenta.substring(0,1);
                c += 1;

                operadorActivo.setCodOperador(res.getString(0));
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cuentaslstview);
            final ListView cuentasListView = findViewById(R.id.CuentasListView);
            cuentasListView.setAdapter(adapter);

            cuentasListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getApplicationContext(), MuestraCuentaActivity.class);
                    intent.putExtra("CUENTAIDX", cuentasidxclicked[position]);
                    intent.putExtra("NOMBREOPERADOR", operadorActivo.getNemo());
                    startActivity(intent);
                }
            });
        }
        else{
            Toast.makeText(ListaCuentasActivity.this, "The code doesn't exist", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }

    }
}
