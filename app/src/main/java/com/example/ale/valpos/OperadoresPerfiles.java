package com.example.ale.valpos;

/**
 * Created by Alejandro on 13/01/2018.
 */

public class OperadoresPerfiles {

    String CodPerfil;
    String Descripcion;
    String Permisos;
    String Estado;
    String HayQueBorrarlo;

    public OperadoresPerfiles() {
    }

    public OperadoresPerfiles(String codPerfil) {
        CodPerfil = codPerfil;
    }

    public OperadoresPerfiles(String descripcion, String permisos, String estado,
                              String hayQueBorrarlo) {
        Descripcion = descripcion;
        Permisos = permisos;
        Estado = estado;
        HayQueBorrarlo = hayQueBorrarlo;
    }

    public String getCodPerfil() {
        return CodPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        CodPerfil = codPerfil;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPermisos() {
        return Permisos;
    }

    public void setPermisos(String permisos) {
        Permisos = permisos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getHayQueBorrarlo() {
        return HayQueBorrarlo;
    }

    public void setHayQueBorrarlo(String hayQueBorrarlo) {
        HayQueBorrarlo = hayQueBorrarlo;
    }
}
