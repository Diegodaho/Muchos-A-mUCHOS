/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    @NamedQuery(name = "consulta", query = "SELECT p FROM Persona p JOIN p.listaEvento c WHERE c.id_evento = :id_evento")
})
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_persona;
    @Column
    private String nombre_persona;
    @Column
    private String apellido_persona;
    @Column
    private int edad;
    
    @ManyToMany(mappedBy = "listaPersona")
    private List<Evento> listaEvento;

    public Persona() {
    }

    public Persona(String nombre_persona, String apellido_persona, int edad) {
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.edad = edad;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Evento> getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(List<Evento> listaEvento) {
        this.listaEvento = listaEvento;
    }
    
    
    
    
    
}
