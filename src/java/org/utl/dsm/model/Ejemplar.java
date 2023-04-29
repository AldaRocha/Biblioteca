
package org.utl.dsm.model;

/**
 *
 * @author rocha
 */
public class Ejemplar {
    private int idEjemplar;
    private String codigo;
    private int estatus;
    private String observaciones;
    private Libro libro;

    public Ejemplar(int idEjemplar, String codigo, int estatus, String observaciones, Libro libro) {
        this.idEjemplar = idEjemplar;
        this.codigo = codigo;
        this.estatus = estatus;
        this.observaciones = observaciones;
        this.libro = libro;
    }

    public Ejemplar() {
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
}
