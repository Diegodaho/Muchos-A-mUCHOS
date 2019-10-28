/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.IVistatotalFacade;
import com.mycompany.entity.Vistatotal;
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
public class VistatotalFacade extends AbstractFacade<Vistatotal> implements IVistatotalFacade {
    @PersistenceContext(unitName = "recursoUN")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistatotalFacade() {
        super(Vistatotal.class);
    }
    
    @Override
    public List<Vistatotal> obtenerVista() {
        TypedQuery<Vistatotal> consulta = em.createNamedQuery("consultaV", Vistatotal.class);        
        List<Vistatotal> listaEnt = (List<Vistatotal>) consulta.getResultList();        
        return listaEnt;
    }

    
    
}
