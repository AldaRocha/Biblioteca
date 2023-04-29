
package org.utl.dsm.rest;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.utl.dsm.core.ControllerEjemplar;
import org.utl.dsm.model.Ejemplar;

/**
 *
 * @author rocha
 */
@Path("ejemplar")
public class RESTEjemplar {
    @Path("insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public Response insertar(@FormParam("datos") @DefaultValue("") String datos){
        String out="";
        Gson gson=new Gson();
        Ejemplar e=new Ejemplar();
        ControllerEjemplar ce=new ControllerEjemplar();
        
        try{
            e=gson.fromJson(datos, Ejemplar.class);
            ce.insertarEjemplar(e);
            out=gson.toJson(e);
        } catch(JsonParseException jpe){
            jpe.printStackTrace();
            out="""
                {"exception":"Formato JSON de Datos Incorrectos."}
                """;
        }
        
        return Response.status(Response.Status.OK).entity(out).build();
    }
}
