/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.*;
import ec.edu.ups.modelo.Casa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Dutan2000
 */
public class ControladorCasa extends ControladorGenerico<Casa> {

    //@Override
    public boolean validarActualizacion(Casa objeto) throws ExcepcionActualizar {

        String queryString = "Select * from casa as c "
                + "where c.codigoCasa like ?";
        Query query = getEm().createNativeQuery(queryString, Casa.class);
        List<Casa> casa = query.setParameter(1, objeto.getCodigoCasa()).getResultList();
        if (casa.size() == 1) {
            return true;
        } else {
            return false;
        }

    }

    //@Override
    public boolean validarExistente(Object id) throws ExcepcionBuscar {
        String queryString = "Select * from casa as c "
                + "where c.codigoCasa like ?";
        Query query = getEm().createNativeQuery(queryString, Casa.class);
        List<Casa> casa = query.setParameter(1, id).getResultList();
        if (casa.size() == 1) {
            return true;
        } else {
            return false;
        }

    }

    public Casa verPorCedula(String cedula) {
        String queryString = "SELECT * FROM casa as c"
                + " where c.fk_persona like ?";
        Query query = getEm().createNativeQuery(queryString, Casa.class);
        Casa casa = (Casa) query.setParameter(1, cedula).getSingleResult();
        
        return casa;
    }

}
