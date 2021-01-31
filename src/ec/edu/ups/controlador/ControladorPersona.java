/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.*;
import ec.edu.ups.modelo.Persona;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Dutan2000
 */
public class ControladorPersona extends ControladorGenerico<Persona> {

    Persona persona = new Persona();

    //@Override
    public boolean validarActualizacion(Persona objeto) throws ExcepcionActualizar {
        String queryString = "Select * from persona as p "
                + "where p.cedula like ?";
        Query query = getEm().createNativeQuery(queryString, Persona.class);
        List<Persona> persona = query.setParameter(1, objeto.getCedula()).getResultList();
        if (persona.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    public boolean validarExistente(Object id) throws ExcepcionBuscar {
        String queryString = "Select * from persona as p "
                + "where p.cedula like ?";
        Query query = getEm().createNativeQuery(queryString, Persona.class);
        List<Persona> persona = query.setParameter(1, id).getResultList();
        if (persona.size() == 1) {
            return true;
        }else{
            return false;
        }
    }

}
