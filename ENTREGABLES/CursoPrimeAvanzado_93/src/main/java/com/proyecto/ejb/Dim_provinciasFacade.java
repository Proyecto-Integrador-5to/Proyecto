/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import com.proyecto.model.Dim_provincias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author isaac
 */
@Stateless
public class Dim_provinciasFacade extends AbstractFacade<Dim_provincias> implements Dim_provinciasFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Dim_provinciasFacade() {
        super(Dim_provincias.class);
    }
    
}
