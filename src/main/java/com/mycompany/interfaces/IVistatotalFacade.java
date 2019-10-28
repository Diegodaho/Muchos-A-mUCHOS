/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Vistatotal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DaveHell
 */
@Local
public interface IVistatotalFacade {

    void create(Vistatotal vistatotal);

    void edit(Vistatotal vistatotal);

    void remove(Vistatotal vistatotal);

    Vistatotal find(Object id);

    List<Vistatotal> findAll();

    List<Vistatotal> findRange(int[] range);

    int count();
    
    /**
     *
     * @return
     */
    List<Vistatotal> obtenerVista();
    
}
