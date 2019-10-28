/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author DaveHell
 */
@Entity
@Table
public class Evento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_evento;
    @Column
    private String nombre_evento;
    @Column
    private String lugar;
    
    @JoinTable(name = "persona_evento", 
            joinColumns = @JoinColumn(name = "id_evento", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_persona", nullable = false)
            )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Persona> listaPersona;

    public Evento() {
    }

    public Evento(String nombre_evento, String lugar) {
        this.nombre_evento = nombre_evento;
        this.lugar = lugar;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    
    
}
