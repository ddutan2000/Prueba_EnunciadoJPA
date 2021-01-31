/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario extends ControladorGenerico<Usuario> {

    //@Override
    public boolean validarActualizacion(Usuario objeto) throws Exception {
        String queryString = "Select * from usuario as u "
                + "where u.correo like ? and u.contrasenia like ?";
        Query query = getEm().createNativeQuery(queryString, Usuario.class);
        List<Usuario> usuario = query.setParameter(1, objeto.getCorreo()).setParameter(2, objeto.getContrasenia()).getResultList();
        if (usuario.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    public boolean validarExistente(Object id) throws Exception {
        String queryString = "Select * from usuario as u "
                + "where u.cedula like ?";
        Query query = getEm().createNativeQuery(queryString, Usuario.class);
        List<Usuario> usuario = query.setParameter(1, id).getResultList();
        if (usuario.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validar(String correo, String contrasenia) {
        String queryString = "Select * from usuario as u "
                + "where u.correo like ? and u.contrasenia like ?";
        Query query = getEm().createNativeQuery(queryString, Usuario.class);
        List<Usuario> usuario = query.setParameter(1, correo).setParameter(2, contrasenia).getResultList();
        if (usuario.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

}
