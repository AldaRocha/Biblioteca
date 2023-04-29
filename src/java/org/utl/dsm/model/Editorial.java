
package org.utl.dsm.model;

/**
 *
 * @author rocha
 */
public class Editorial {
    private int idEditorial;
    private String nombre;

    public Editorial(int idEditorial, String nombre) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    public Editorial() {
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
