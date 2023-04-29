
package org.utl.dsm.core;

import org.utl.dsm.model.Ejemplar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rocha
 */
public class ControllerEjemplar{
    public boolean insertarEjemplar(Ejemplar e){
        ConexionMySQL connMySQL=new ConexionMySQL();
        
        Connection conn=connMySQL.open();
        
        Statement stmt =null;
        ResultSet rs= null;
        boolean r=false;
        
        try{
            conn.setAutoCommit(false);
            String query1="INSERT INTO autor (nombre) VALUES('"+e.getLibro().getAutor().getNombre()+"')";
            stmt = conn.createStatement();
            stmt.execute(query1);
            
            String query2 = "SELECT LAST_INSERT_ID()";
            rs = stmt.executeQuery(query2);
            if(rs.next()){
                e.getLibro().getAutor().setIdAutor(rs.getInt(1));
            }
            
            String query3="INSERT INTO editorial (nombre) VALUES('"+e.getLibro().getEditorial().getNombre()+"')";
            stmt = conn.createStatement();
            stmt.execute(query3);
            
            String query4="SELECT LAST_INSERT_ID()";
            rs = stmt.executeQuery(query4);
            if(rs.next()){
                e.getLibro().getEditorial().setIdEditorial(rs.getInt(1));
            }
            
            String query5="INSERT INTO genero (nombre) VALUES('"+e.getLibro().getGenero().getNombre()+"');";
            stmt = conn.createStatement();
            stmt.execute(query5);
            
            String query6="SELECT LAST_INSERT_ID()";
            rs = stmt.executeQuery(query6);
            if(rs.next()){
                e.getLibro().getGenero().setIdGenero(rs.getInt(1));
            }
            
            String query7="INSERT INTO libro(idLibro, titulo, idAutor, idEditorial, idGenero, isbn) "
                                    + "VALUES("+e.getLibro().getIdLibro()+", '"
                                               +e.getLibro().getTitulo()+"',"
                                               +e.getLibro().getAutor().getIdAutor()+","
                                               +e.getLibro().getEditorial().getIdEditorial()+","
                                               +e.getLibro().getGenero().getIdGenero()+", '"
                                               +e.getLibro().getIsbn()+"')";
            stmt = conn.createStatement();
            stmt.execute(query7);
            
            String query8="INSERT INTO ejemplar (idLIbro, codigo, estatus, observaciones) "
                                        + "VALUES("+e.getLibro().getIdLibro()+", '"
                                                   +e.getCodigo()+"',"
                                                   +e.getEstatus()+", '"
                                                   +e.getObservaciones()+"');";
            stmt = conn.createStatement();
            stmt.execute(query8);
            
            String query9="SELECT LAST_INSERT_ID()";
            rs = stmt.executeQuery(query9);
            if(rs.next()){
                e.setIdEjemplar(rs.getInt(1));
            }
            
            conn.commit();
            conn.setAutoCommit(true);
            rs.close();
            stmt.close();
            conn.close();
            connMySQL.close();
            r=true;
            
        } catch(SQLException ex) {
            Logger.getLogger(ControllerEjemplar.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
                conn.setAutoCommit(true);
                rs.close();
                stmt.close();
                conn.close();
                connMySQL.close();
                r=false;
            } catch (SQLException ex1) {
                Logger.getLogger(ControllerEjemplar.class.getName()).log(Level.SEVERE, null, ex1);
                r=false;
            }
        }
        
        return r;
    }
}
