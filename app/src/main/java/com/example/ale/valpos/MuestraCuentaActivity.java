package com.example.ale.valpos;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MuestraCuentaActivity extends AppCompatActivity {
    DatabaseHelper lcDatabaseHelper;
    CuentasItems cuentasItems;
    TextView muestraCuentaTxtView;
    Operador lcOperador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_cuenta);
        lcDatabaseHelper = new DatabaseHelper(this);
        cuentasItems = new CuentasItems();
        muestraCuentaTxtView = findViewById(R.id.MuestraCuentaTextView);
        lcOperador = new Operador();
        String idx = getIntent().getStringExtra("IDX");
        lcOperador.setNemo(getIntent().getStringExtra("NOMBREOPERADOR"));
        cuentasItems = new CuentasItems(idx);
        listaItems();
    }

    public void listaItems(){
        Cursor items = lcDatabaseHelper.getItemsFromCuenta(cuentasItems);
        if(items.getCount() == 0){
            // Show message
            showMessage("Error", "No data found");
            return;
        }

        while(items.moveToNext()){
            cuentasItems.setNumCuenta(items.getString(1));
            cuentasItems.setNumItem(items.getString(2));
            cuentasItems.setCodPLU(items.getString(3));
            cuentasItems.setCantidad(items.getString(4));
            cuentasItems.setImporte(items.getString(7));
            cuentasItems.setBarCode(items.getString(13));
        }

        final String item [] = new String[]{"Cuenta " + cuentasItems.getIdx(),
                "Account number "+ cuentasItems.getNumCuenta(),
                "Item number " + cuentasItems.getNumItem(),
                "PLU Code " + cuentasItems.getCodPLU(),
                "Amount of items " + cuentasItems.getCantidad(),
                "Received " + cuentasItems.getImporte(),
                "Barcode " + cuentasItems.getBarCode()
        };

        muestraCuentaTxtView.setText(item[0] + " Operador " + lcOperador.getNemo());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        ListView listaItems = (ListView) findViewById(R.id.ListaItemsLstView);
        listaItems.setAdapter(adapter);
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
