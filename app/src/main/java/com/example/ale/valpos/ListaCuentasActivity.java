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
import android.widget.TextView;
import android.widget.Toast;

public class ListaCuentasActivity extends AppCompatActivity {
    Operador operadorActivo;
    TextView operadorActivoTxtView;
    DatabaseHelper lstDataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentas);
        String contrasenha = getIntent().getStringExtra("CONTRASENHA");
        operadorActivo = new Operador();
        operadorActivo.setContrasenha(contrasenha);
        operadorActivoTxtView = findViewById(R.id.OperadorActivoTxtView);
        lstDataBaseHelper = new DatabaseHelper(this);
        listaCuentas();
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
                Toast.makeText(ListaCuentasActivity.this, "Welcome " + nameresult, Toast.LENGTH_SHORT).show();
                operadorActivoTxtView.setText("Operator: " + nameresult);
                operadorActivo.setNemo(nameresult);
            }

        boolean contrasenhaExiste = lstDataBaseHelper.validarContrasenhaOperador(operadorActivo);
        if(contrasenhaExiste == true){
            Cursor res = lstDataBaseHelper.getCuentas();
            if(res.getCount() == 0){
                // Show message
                showMessage("Error", "No data found");
                return;
            }

            final String cuentas [] = new String [res.getCount()];
            int c = 0;
            while (res.moveToNext()){
                String idx = "Cuenta " + res.getString(0) + "  Número de cuenta "
                        + res.getString(1) + "  Items " + res.getString(2);
                cuentas[c] = idx;
                c += 1;

                operadorActivo.setCodOperador(res.getString(0));
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cuentas);
            ListView cuentasListView = (ListView) findViewById(R.id.CuentasListView);
            cuentasListView.setAdapter(adapter);

            cuentasListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(ListaCuentasActivity.this, cuentas[position], Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MuestraCuentaActivity.class);
                    String idX = Character.toString(cuentas[position].charAt(7));
                    intent.putExtra("IDX", idX);
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
