/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.utils.Utils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public abstract class ControladorGenerico<T> {

    //private List<T> lista;
    private Class<T> clase;
    private EntityManager em;

    public ControladorGenerico() {
        //lista = new ArrayList<>();
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        this.em = Utils.getEntityManager();
    }

    public ControladorGenerico(EntityManager em) {
        //lista = new ArrayList<>();
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        this.em = em;
    }

    public void create(T objeto) throws Exception {
        if (validarActualizacion(objeto) == true) {
            JOptionPane.showMessageDialog(null, "OBJETO YA EXISTE DENTRO DEL SISTEMA");
        } else {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        }

    }

    public void update(T objeto) throws Exception {
        if (validarActualizacion(objeto) == true) {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } else {
            JOptionPane.showMessageDialog(null, objeto + " \nNO SE ENCUENTRA REGISTRADO EN EL SISTEMA");
        }

    }

    public void delete(T objeto) throws Exception {
        if (validarActualizacion(objeto) == true) {
            em.getTransaction().begin();
            em.remove(em.merge(objeto));
            em.getTransaction().commit();
        } else {
            JOptionPane.showMessageDialog(null, objeto + " \nNO SE ENCUENTRA REGISTRADO EN EL SISTEMA");
        }

    }

    public T read(Object id) throws Exception {
        if (validarExistente(id) == true) {
            return (T) em.find(clase, id);
        } else {
            return null;
        }
    }

    public List<T> findAll() throws Exception {
        return em.createQuery("Select t from " + clase.getSimpleName() + " t").getResultList();
    }

    public abstract boolean validarActualizacion(T objeto) throws Exception;

    public abstract boolean validarExistente(Object id) throws Exception;

    /*public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }*/

    public Class<T> getClase() {
        return clase;
    }

    public void setClase(Class<T> clase) {
        this.clase = clase;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
