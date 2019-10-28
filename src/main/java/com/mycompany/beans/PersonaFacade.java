/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.IPersonaFacade;
import com.mycompany.entity.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author DaveHell
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements IPersonaFacade {
    @PersistenceContext(unitName = "recursoUN")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    @Override
    public List<Persona> descartar(int id_evento) {
        List<Persona> listaCompleta = findAll();
        TypedQuery<Persona> consulta = em.createNamedQuery("consulta", Persona.class);
        consulta.setParameter("id_evento", id_evento);
        List<Persona> listaPorEventos = consulta.getResultList();
        List<Persona> lisTemporal = new ArrayList();
        if (listaCompleta.size() > listaPorEventos.size()) {
            for (Persona general : listaCompleta) {
                if (!listaPorEventos.contains(general)) {
                    lisTemporal.add(general);
                }
            }
        } else {
            for (Persona xEventos : listaPorEventos) {
                if (!listaCompleta.contains(xEventos)) {
                    lisTemporal.add(xEventos);
                }
            }
        }
        return lisTemporal;
    }
    
}
