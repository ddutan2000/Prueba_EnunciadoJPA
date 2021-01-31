/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author Dutan2000
 */
public class ExcepcionActualizar extends Exception{

    public ExcepcionActualizar() {
        super("LA PERSONA QUE QUISO ACTUALIZAR NO EXISTE");
    }
    
    
}
