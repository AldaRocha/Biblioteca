
package org.utl.dsm.model;

import java.util.Date;

/**
 *
 * @author rocha
 */
public class Prestamo {
    private int idPrestamo;
    private Date fechaIni;
    private Date fechaFin;
    private Date fechaReal;
    private String observaciones;
    private Usuario usuario;

    public Prestamo(int idPrestamo, Date fechaIni, Date fechaFin, Date fechaReal, String observaciones, Usuario usuario) {
        this.idPrestamo = idPrestamo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.fechaReal = fechaReal;
        this.observaciones = observaciones;
        this.usuario = usuario;
    }

    public Prestamo() {
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
