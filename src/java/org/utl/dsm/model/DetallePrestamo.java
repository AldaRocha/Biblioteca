
package org.utl.dsm.model;

/**
 *
 * @author rocha
 */
public class DetallePrestamo {
    private String observaciones;
    private int entregado;
    private Prestamo prestamo;
    private Ejemplar ejemplar;

    public DetallePrestamo(String observaciones, int entregado, Prestamo prestamo, Ejemplar ejemplar) {
        this.observaciones = observaciones;
        this.entregado = entregado;
        this.prestamo = prestamo;
        this.ejemplar = ejemplar;
    }

    public DetallePrestamo() {
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEntregado() {
        return entregado;
    }

    public void setEntregado(int entregado) {
        this.entregado = entregado;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
    
    
}
