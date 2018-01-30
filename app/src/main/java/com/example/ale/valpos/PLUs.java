package com.example.ale.valpos;

/**
 * Created by Ale on 30/01/2018.
 */

public class PLUs {
    String CodPLU;
    String Descripcion;
    String PVP;
    String BarCode;
    String CodDpto;
    String EsVariableSuPVP;
    String HayQueBorrarlo;
    String EsDePesaje;
    String CodDptoDeMenu;
    String CodARebaja;
    String Existencia;
    String EsFraccionable;
    String EsDeRebaja;
    String EsLotto;

    public PLUs() {
    }

    public PLUs(String codPLU, String descripcion, String PVP, String barCode, String codDpto,
                String esVariableSuPVP, String hayQueBorrarlo, String esDePesaje, String codDptoDeMenu,
                String codARebaja, String existencia, String esFraccionable, String esDeRebaja, String esLotto) {
        CodPLU = codPLU;
        Descripcion = descripcion;
        this.PVP = PVP;
        BarCode = barCode;
        CodDpto = codDpto;
        EsVariableSuPVP = esVariableSuPVP;
        HayQueBorrarlo = hayQueBorrarlo;
        EsDePesaje = esDePesaje;
        CodDptoDeMenu = codDptoDeMenu;
        CodARebaja = codARebaja;
        Existencia = existencia;
        EsFraccionable = esFraccionable;
        EsDeRebaja = esDeRebaja;
        EsLotto = esLotto;
    }

    public String getCodPLU() {
        return CodPLU;
    }

    public void setCodPLU(String codPLU) {
        CodPLU = codPLU;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPVP() {
        return PVP;
    }

    public void setPVP(String PVP) {
        this.PVP = PVP;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getCodDpto() {
        return CodDpto;
    }

    public void setCodDpto(String codDpto) {
        CodDpto = codDpto;
    }

    public String getEsVariableSuPVP() {
        return EsVariableSuPVP;
    }

    public void setEsVariableSuPVP(String esVariableSuPVP) {
        EsVariableSuPVP = esVariableSuPVP;
    }

    public String getHayQueBorrarlo() {
        return HayQueBorrarlo;
    }

    public void setHayQueBorrarlo(String hayQueBorrarlo) {
        HayQueBorrarlo = hayQueBorrarlo;
    }

    public String getEsDePesaje() {
        return EsDePesaje;
    }

    public void setEsDePesaje(String esDePesaje) {
        EsDePesaje = esDePesaje;
    }

    public String getCodDptoDeMenu() {
        return CodDptoDeMenu;
    }

    public void setCodDptoDeMenu(String codDptoDeMenu) {
        CodDptoDeMenu = codDptoDeMenu;
    }

    public String getCodARebaja() {
        return CodARebaja;
    }

    public void setCodARebaja(String codARebaja) {
        CodARebaja = codARebaja;
    }

    public String getExistencia() {
        return Existencia;
    }

    public void setExistencia(String existencia) {
        Existencia = existencia;
    }

    public String getEsFraccionable() {
        return EsFraccionable;
    }

    public void setEsFraccionable(String esFraccionable) {
        EsFraccionable = esFraccionable;
    }

    public String getEsDeRebaja() {
        return EsDeRebaja;
    }

    public void setEsDeRebaja(String esDeRebaja) {
        EsDeRebaja = esDeRebaja;
    }

    public String getEsLotto() {
        return EsLotto;
    }

    public void setEsLotto(String esLotto) {
        EsLotto = esLotto;
    }
}
