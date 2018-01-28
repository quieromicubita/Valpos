package com.example.ale.valpos;

/**
 * Created by Ale on 27/01/2018.
 */

public class Operador {
    String CodOperador;
    String Descripcion;
    String Nemo;
    String Contrasenha;
    String Estado;
    String CodPerfil;
    String HayQueBorrarlo;

    public Operador() {
    }

    public Operador(String codOperador) {
        CodOperador = codOperador;
    }

    public Operador(String codOperador, String descripcion, String nemo, String contrasenha,
                      String estado, String codPerfil, String hayQueBorrarlo) {
        CodOperador = codOperador;
        Descripcion = descripcion;
        Nemo = nemo;
        Contrasenha = contrasenha;
        Estado = estado;
        CodPerfil = codPerfil;
        HayQueBorrarlo = hayQueBorrarlo;
    }

    public String getCodOperador() {
        return CodOperador;
    }

    public void setCodOperador(String codOperador) {
        CodOperador = codOperador;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNemo() {
        return Nemo;
    }

    public void setNemo(String nemo) {
        Nemo = nemo;
    }

    public String getContrasenha() {
        return Contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        Contrasenha = contrasenha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCodPerfil() {
        return CodPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        CodPerfil = codPerfil;
    }

    public String getHayQueBorrarlo() {
        return HayQueBorrarlo;
    }

    public void setHayQueBorrarlo(String hayQueBorrarlo) {
        HayQueBorrarlo = hayQueBorrarlo;
    }
}
