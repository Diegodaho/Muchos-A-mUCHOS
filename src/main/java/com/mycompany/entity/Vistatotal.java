/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DaveHell
 */
@Table
@Entity
@NamedQueries({
    @NamedQuery(name = "consultaV", query = "SELECT v FROM Vistatotal v")
})
public class Vistatotal implements Serializable{
    
    @Column
    @Id
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String evento;
    @Column
    private String lugar;

    public Vistatotal() {
    }

    public Vistatotal(String nombre, String apellido, String evento, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.evento = evento;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
}
