/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.*;
import ec.edu.ups.modelo.Hipoteca;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Dutan2000
 */
public class ControladorHipoteca extends ControladorGenerico<Hipoteca> {

    
    

    //@Override
    public boolean validarActualizacion(Hipoteca objeto) throws ExcepcionActualizar {
        String queryString = "Select * from hipoteca as h "
                + " where h.id like ?";
        Query query = getEm().createNativeQuery(queryString, Hipoteca.class);
        List<Hipoteca>hipoteca = query.setParameter(1, objeto.getId()).getResultList();
        if (hipoteca.size()==1) {
            return true;
        }else{
            return false;
        }
    }

    //@Override
    public boolean validarExistente(Object id) throws ExcepcionBuscar  {

        String queryString = "Select * from hipoteca as h "
                + "where h.id like ?";
        Query query = getEm().createNativeQuery(queryString, Hipoteca.class);
        List<Hipoteca> hipoteca = query.setParameter(1, id).getResultList();
        if (hipoteca.size() == 1) {
            return true;
        }else{
            return false;
        }

    }
}
