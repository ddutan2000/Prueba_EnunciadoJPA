/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dutan2000
 */
@Entity
public class Casa implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @Column
    private int codigoCasa;
    
    @Column
    private String direccionCalle1;
    @Column
    private String direccionCalle2;
    @Column
    private double valorDeCasa;

    @ManyToOne
    @JoinColumn(name="fk_persona")
    private Persona persona;
    
    /*@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casa)) {
            return false;
        }
        Casa other = (Casa) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Casa[ id=" + id + " ]";
    }*/

    public int getCodigoCasa() {
        return codigoCasa;
    }

    public void setCodigoCasa(int codigoCasa) {
        this.codigoCasa = codigoCasa;
    }

    public String getDireccionCalle1() {
        return direccionCalle1;
    }

    public void setDireccionCalle1(String direccionCalle1) {
        this.direccionCalle1 = direccionCalle1;
    }

    public String getDireccionCalle2() {
        return direccionCalle2;
    }

    public void setDireccionCalle2(String direccionCalle2) {
        this.direccionCalle2 = direccionCalle2;
    }

    public double getValorDeCasa() {
        return valorDeCasa;
    }

    public void setValorDeCasa(double valorDeCasa) {
        this.valorDeCasa = valorDeCasa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
