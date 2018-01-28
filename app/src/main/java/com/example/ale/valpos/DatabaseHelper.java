package com.example.ale.valpos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alejandro on 20/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public final static String DATABASE_NAME = "valpos.db";

    //Tabla de Operadores
    public final static String TABLE_OPERADORES = "Tbl_Operadores";
    public final static String COL_OPERADORES_ID = "CodOperador";
    public final static String COL_OPERADORES_DESCRIPCION = "Descripcion";
    public final static String COL_OPERADORES_NEMO = "Nemo";
    public final static String COL_OPERADORES_CONTRASENHA = "Contrasenha";
    public final static String COL_OPERADORES_ESTADO = "Estado";
    public final static String COL_OPERADORES_CODPERFIL = "CodPerfil";
    public final static String COL_OPERADORES_HAYQUEBORRARLO = "HayQueBorrarlo";

    //Tabla OperadoresPerfiles
    public final static String TABLE_PERFILES_OPERADORES = "OperadoresPerfiles";
    public final static String COL_PERFILES_ID = "CodPerfil";
    public final static String COL_PERFILES_DESCRIPCION = "Descripcion";
    public final static String COL_PERFILES_PERMISOS = "Permisos";
    public final static String COL_PERFILES_ESTADO = "Estado";
    public final static String COL_PERFILES_HAYQUEBORRARLO = "HayQueBorrarlo";

    //Tabla Cuentas_items
    public final static String TABLE_CUENTAS_ITEMS = "Cuentas_Items";
    public final static String COL_CUENTAS_IDX = "idx";
    public final static String COL_CUENTAS_NUMCUENTA = "NumCuenta";
    public final static String COL_CUENTAS_NUMITEM = "NumItem";
    public final static String COL_CUENTAS_CODPLU = "CodPLU";
    public final static String COL_CUENTAS_CANTIDAD = "Cantidad";
    public final static String COL_CUENTAS_PVP = "PVP";
    public final static String COL_CUENTAS_IMPUESTO = "Impuesto";
    public final static String COL_CUENTAS_IMPORTE = "Importe";
    public final static String COL_CUENTAS_ESTADO1 = "Estado1";
    public final static String COL_CUENTAS_ESTADO2 = "Estado2";
    public final static String COL_CUENTAS_CODMODIFICADOR = "CodModificador";
    public final static String COL_CUENTAS_CODPCPOSREBAJA = "CodPCPOSRebaja";
    public final static String COL_CUENTAS_ATRIBUTOSPLU = "AtributosPLU";
    public final static String COL_CUENTAS_BARCODE = "BarCode";
    public final static String COL_CUENTAS_TARA = "Tara";
    public final static String COL_CUENTAS_VALORDELATARA = "ValorDeLaTara";
    public final static String COL_CUENTAS_IMPORTESINTARA = "ImporteSinTara";
    public final static String COL_CUENTAS_CODAREAIMPCOCINA = "CodAreaImpCocina";
    public final static String COL_CUENTAS_CANTIMPRESIONESCOCINA = "CantImpresionesEnCocina";
    public final static String COL_CUENTAS_SECUENCIAL = "Secuencial";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TBL_CUENTAS_ITEMS = ("CREATE TABLE " + TABLE_CUENTAS_ITEMS + " (" +
                COL_CUENTAS_IDX + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_CUENTAS_NUMCUENTA + " INTEGER, " +
                COL_CUENTAS_NUMITEM + " INTEGER, " +
                COL_CUENTAS_CODPLU + " INTEGER, " +
                COL_CUENTAS_CANTIDAD + " INTEGER, " +
                COL_CUENTAS_PVP + " INTEGER, " +
                COL_CUENTAS_IMPUESTO + " INTEGER, " +
                COL_CUENTAS_IMPORTE + " INTEGER, " +
                COL_CUENTAS_ESTADO1 + " INTEGER, " +
                COL_CUENTAS_ESTADO2 + " INTEGER, " +
                COL_CUENTAS_CODMODIFICADOR + " INTEGER, " +
                COL_CUENTAS_CODPCPOSREBAJA + " INTEGER, " +
                COL_CUENTAS_ATRIBUTOSPLU + " INTEGER, " +
                COL_CUENTAS_BARCODE + " INTEGER, " +
                COL_CUENTAS_TARA + " INTEGER, " +
                COL_CUENTAS_VALORDELATARA + " INTEGER, " +
                COL_CUENTAS_IMPORTESINTARA + " INTEGER, " +
                COL_CUENTAS_CODAREAIMPCOCINA + " INTEGER, " +
                COL_CUENTAS_CANTIMPRESIONESCOCINA + " INTEGER, " +
                COL_CUENTAS_SECUENCIAL + " INTEGER);"
        );

        String CREATE_TBL_OPERADORES_PERFILES = ("CREATE TABLE " + TABLE_PERFILES_OPERADORES + " (" +
                COL_PERFILES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_PERFILES_DESCRIPCION + " TEXT, " +
                COL_PERFILES_PERMISOS + " INTEGER, " +
                COL_PERFILES_ESTADO + " INTEGER, " +
                COL_OPERADORES_HAYQUEBORRARLO + " INTEGER);"
        );

        String CREATE_TBL_OPERADORES = ("CREATE TABLE " + TABLE_OPERADORES + " (" +
                COL_OPERADORES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_OPERADORES_DESCRIPCION + " TEXT, " +
                COL_OPERADORES_NEMO + " TEXT, " +
                COL_OPERADORES_CONTRASENHA + " TEXT, " +
                COL_OPERADORES_ESTADO + " INTEGER, " +
                COL_OPERADORES_CODPERFIL + " INTEGER, " +
                COL_OPERADORES_HAYQUEBORRARLO + " INTEGER);"
        );

        db.execSQL(CREATE_TBL_OPERADORES);
        db.execSQL(CREATE_TBL_OPERADORES_PERFILES);
        db.execSQL(CREATE_TBL_CUENTAS_ITEMS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Clear table data
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OPERADORES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERFILES_OPERADORES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUENTAS_ITEMS);

        //Recreate table
        onCreate(db);
    }

    public boolean validarContrasenhaOperador(Operador operador){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select "
                + COL_OPERADORES_CONTRASENHA + " from "
                + TABLE_OPERADORES + " where "
                + COL_OPERADORES_CONTRASENHA + " = "
                + operador.getContrasenha(),
                null
        );
        if(res.getCount() <= 0)
            return false;
        else
            return true;
    }

    public boolean insertCuentasItems(CuentasItems cuentasitems){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_CUENTAS_IDX, cuentasitems.getIdx());
        contentvalues.put(COL_CUENTAS_NUMCUENTA, cuentasitems.getNumCuenta());
        contentvalues.put(COL_CUENTAS_NUMITEM, cuentasitems.getNumItem());
        contentvalues.put(COL_CUENTAS_CODPLU, cuentasitems.getCodPLU());
        contentvalues.put(COL_CUENTAS_CANTIDAD, cuentasitems.getCantidad());
        contentvalues.put(COL_CUENTAS_PVP, cuentasitems.getPVP());
        contentvalues.put(COL_CUENTAS_IMPUESTO, cuentasitems.getImpuesto());
        contentvalues.put(COL_CUENTAS_IMPORTE, cuentasitems.getImporte());
        contentvalues.put(COL_CUENTAS_ESTADO1, cuentasitems.getEstado1());
        contentvalues.put(COL_CUENTAS_ESTADO2, cuentasitems.getEstado2());
        contentvalues.put(COL_CUENTAS_CODMODIFICADOR, cuentasitems.getCodModificador());
        contentvalues.put(COL_CUENTAS_CODPCPOSREBAJA, cuentasitems.getCodPCPOSRebaja());
        contentvalues.put(COL_CUENTAS_ATRIBUTOSPLU, cuentasitems.getAtributosPLU());
        contentvalues.put(COL_CUENTAS_BARCODE, cuentasitems.getBarCode());
        contentvalues.put(COL_CUENTAS_TARA, cuentasitems.getTara());
        contentvalues.put(COL_CUENTAS_VALORDELATARA, cuentasitems.getValorDeLaTara());
        contentvalues.put(COL_CUENTAS_IMPORTESINTARA, cuentasitems.getImporteSinTara());
        contentvalues.put(COL_CUENTAS_CODAREAIMPCOCINA, cuentasitems.getCodAreaImpCocina());
        contentvalues.put(COL_CUENTAS_CANTIMPRESIONESCOCINA, cuentasitems.getCantImpresionesEnCocina());
        contentvalues.put(COL_CUENTAS_SECUENCIAL, cuentasitems.getSecuencial());
        long row_id_or_failed_to_insert = db.insert(TABLE_CUENTAS_ITEMS, null, contentvalues);

        if(row_id_or_failed_to_insert == -1)
            return false;
        else
            return true;
    }

    public boolean insertOperator(Operador operador){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_OPERADORES_DESCRIPCION, operador.getDescripcion());
        contentvalues.put(COL_OPERADORES_NEMO, operador.getNemo());
        contentvalues.put(COL_OPERADORES_CONTRASENHA, operador.getContrasenha());
        contentvalues.put(COL_OPERADORES_ESTADO, operador.getEstado());
        contentvalues.put(COL_OPERADORES_CODPERFIL, operador.getCodPerfil());
        contentvalues.put(COL_OPERADORES_HAYQUEBORRARLO, operador.getHayQueBorrarlo());
        long row_id_or_failed_to_insert = db.insert(TABLE_OPERADORES, null, contentvalues);

        if(row_id_or_failed_to_insert == -1)
            return false;
        else
            return true;
    }

    public boolean insertOperadorPerfil(OperadoresPerfiles operperfil){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_PERFILES_DESCRIPCION, operperfil.getDescripcion());
        contentvalues.put(COL_PERFILES_PERMISOS, operperfil.getPermisos());
        contentvalues.put(COL_PERFILES_ESTADO, operperfil.getEstado());
        contentvalues.put(COL_PERFILES_HAYQUEBORRARLO, operperfil.getHayQueBorrarlo());
        long row_id_or_failed_to_insert = db.insert(TABLE_PERFILES_OPERADORES, null, contentvalues);

        if(row_id_or_failed_to_insert == -1)
            return false;
        else
            return true;
    }

    //Obtener listado de perfiles por ahora, luego pasar operador como parametro
    public Cursor getOperatorProfile(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_PERFILES_OPERADORES, null);
        return res;
    }

    /*
    public Cursor getAllOperators(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_OPERADORES, null);
        return res;
    }

    */
    public Cursor getItemsFromCuenta(CuentasItems cuentasitems){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "
                + TABLE_CUENTAS_ITEMS + " where "
                + COL_CUENTAS_IDX + " = "
                + cuentasitems.getIdx(), null);
        return res;
    }

    //Tratar de recoger función como argumento (String[] args)
    // para múltiples nombres
    public Cursor getNameOfOperator(Operador operador){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select "
                + COL_OPERADORES_NEMO + " from "
                + TABLE_OPERADORES + " where "
                + COL_OPERADORES_CONTRASENHA + " = "
                + operador.getContrasenha(),
                null
        );
        return res;
    }

    public Cursor getPerfilDeOperador(String codperfil){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor perfilres = db.rawQuery("select "
                        + COL_PERFILES_DESCRIPCION + ", "
                        + COL_PERFILES_ESTADO + ", "
                        + COL_PERFILES_HAYQUEBORRARLO + " from "
                        + TABLE_PERFILES_OPERADORES + " where "
                        + COL_PERFILES_ID + " = "
                        + codperfil,
                        null
        );
        return perfilres;
    }


    //Pasar Codigo Operador como parámetro
    public Cursor getCuentas(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cuentas = db.rawQuery("select * from " + TABLE_CUENTAS_ITEMS, null);
        return cuentas;
    }

    /*
    public boolean updateData(Operador operador){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_OPERADORES_DESCRIPCION, operador.getDescripcion());
        contentvalues.put(COL_OPERADORES_NEMO, operador.getNemo());
        contentvalues.put(COL_OPERADORES_CONTRASENHA, operador.getContrasenha());
        contentvalues.put(COL_OPERADORES_ESTADO, operador.getEstado());
        contentvalues.put(COL_OPERADORES_CODPERFIL, operador.getCodperfil());
        contentvalues.put(COL_OPERADORES_HAYQUEBORRARLO, operador.getHayqueborrarlo());

        db.update(TABLE_OPERADORES, contentvalues, "CodOperador = ?",
                new String[] {operador.getID()});
        return true;
    }

    public Integer deleteOperator(Operador operador){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_OPERADORES, "CodOperador = ?", new String[] {operador.getID()});
    }

   */
}




