/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.*;
import ec.edu.ups.modelo.Hipoteca;
import javax.persistence.Query;

/**
 *
 * @author Dutan2000
 */
public class ControladorHipoteca extends ControladorGenerico<Hipoteca> {

    //@Override
    public boolean validarActualizacion(Hipoteca objeto) throws ExcepcionActualizar {
        String queryString = "Select * from hipoteca h "
                + "where h.id like ?";
        Query query = getEm().createNativeQuery(queryString, Hipoteca.class);
        Hipoteca hipoteca = (Hipoteca) query.setParameter(1, objeto.getId()).getSingleResult();
        if (hipoteca != null) {
            return true;
        }

        throw new ExcepcionActualizar();
    }

    //@Override
    public boolean validarExistente(Object id) throws ExcepcionBuscar  {

        String queryString = "Select * from hipoteca h "
                + "where h.id like ?";
        Query query = getEm().createNativeQuery(queryString, Hipoteca.class);
        Hipoteca hipoteca = (Hipoteca) query.setParameter(1, id).getSingleResult();
        if (hipoteca != null) {
            return true;
        }

        throw new ExcepcionBuscar();
    }
}
