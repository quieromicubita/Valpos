package com.example.ale.valpos;

/**
 * Created by Alejandro on 18/01/2018.
 */

public class CuentasItems {

    String idx;
    String NumCuenta;
    String NumItem;
    String CodPLU;
    String Cantidad;
    String PVP;
    String Impuesto;
    String Importe;
    String Estado1;
    String Estado2;
    String CodModificador;
    String CodPCPOSRebaja;
    String AtributosPLU;
    String BarCode;
    String Tara;
    String ValorDeLaTara;
    String ImporteSinTara;
    String CodAreaImpCocina;
    String CantImpresionesEnCocina;
    String Secuencial;

    public CuentasItems() {
    }

    public CuentasItems(String idx) {
        this.idx = idx;
    }

    public CuentasItems(String idx, String numCuenta, String numItem, String codPLU, String cantidad,
                        String PVP, String impuesto, String importe, String estado1, String estado2,
                        String codModificador, String codPCPOSRebaja, String atributosPLU,
                        String barCode, String tara, String valorDeLaTara, String importeSinTara,
                        String codAreaImpCocina, String cantImpresionesEnCocina, String secuencial) {
        this.idx = idx;
        NumCuenta = numCuenta;
        NumItem = numItem;
        CodPLU = codPLU;
        Cantidad = cantidad;
        this.PVP = PVP;
        Impuesto = impuesto;
        Importe = importe;
        Estado1 = estado1;
        Estado2 = estado2;
        CodModificador = codModificador;
        CodPCPOSRebaja = codPCPOSRebaja;
        AtributosPLU = atributosPLU;
        BarCode = barCode;
        Tara = tara;
        ValorDeLaTara = valorDeLaTara;
        ImporteSinTara = importeSinTara;
        CodAreaImpCocina = codAreaImpCocina;
        CantImpresionesEnCocina = cantImpresionesEnCocina;
        Secuencial = secuencial;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        NumCuenta = numCuenta;
    }

    public String getNumItem() {
        return NumItem;
    }

    public void setNumItem(String numItem) {
        NumItem = numItem;
    }

    public String getCodPLU() {
        return CodPLU;
    }

    public void setCodPLU(String codPLU) {
        CodPLU = codPLU;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getPVP() {
        return PVP;
    }

    public void setPVP(String PVP) {
        this.PVP = PVP;
    }

    public String getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(String impuesto) {
        Impuesto = impuesto;
    }

    public String getImporte() {
        return Importe;
    }

    public void setImporte(String importe) {
        Importe = importe;
    }

    public String getEstado1() {
        return Estado1;
    }

    public void setEstado1(String estado1) {
        Estado1 = estado1;
    }

    public String getEstado2() {
        return Estado2;
    }

    public void setEstado2(String estado2) {
        Estado2 = estado2;
    }

    public String getCodModificador() {
        return CodModificador;
    }

    public void setCodModificador(String codModificador) {
        CodModificador = codModificador;
    }

    public String getCodPCPOSRebaja() {
        return CodPCPOSRebaja;
    }

    public void setCodPCPOSRebaja(String codPCPOSRebaja) {
        CodPCPOSRebaja = codPCPOSRebaja;
    }

    public String getAtributosPLU() {
        return AtributosPLU;
    }

    public void setAtributosPLU(String atributosPLU) {
        AtributosPLU = atributosPLU;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getTara() {
        return Tara;
    }

    public void setTara(String tara) {
        Tara = tara;
    }

    public String getValorDeLaTara() {
        return ValorDeLaTara;
    }

    public void setValorDeLaTara(String valorDeLaTara) {
        ValorDeLaTara = valorDeLaTara;
    }

    public String getImporteSinTara() {
        return ImporteSinTara;
    }

    public void setImporteSinTara(String importeSinTara) {
        ImporteSinTara = importeSinTara;
    }

    public String getCodAreaImpCocina() {
        return CodAreaImpCocina;
    }

    public void setCodAreaImpCocina(String codAreaImpCocina) {
        CodAreaImpCocina = codAreaImpCocina;
    }

    public String getCantImpresionesEnCocina() {
        return CantImpresionesEnCocina;
    }

    public void setCantImpresionesEnCocina(String cantImpresionesEnCocina) {
        CantImpresionesEnCocina = cantImpresionesEnCocina;
    }

    public String getSecuencial() {
        return Secuencial;
    }

    public void setSecuencial(String secuencial) {
        Secuencial = secuencial;
    }
}
