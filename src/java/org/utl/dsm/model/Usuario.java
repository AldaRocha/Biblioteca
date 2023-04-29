
package org.utl.dsm.model;

/**
 *
 * @author rocha
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String telefono;
    private String email;
    private int tipoU;
    private String curp;

    public Usuario(int idUsuario, String nombre, String aPaterno, String aMaterno, String telefono, String email, int tipoU, String curp) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.telefono = telefono;
        this.email = email;
        this.tipoU = tipoU;
        this.curp = curp;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoU() {
        return tipoU;
    }

    public void setTipoU(int tipoU) {
        this.tipoU = tipoU;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
}
