/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import com.proyecto.model.Dim_fecha;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author isaac
 */
@Stateless
public class Dim_fechaFacade extends AbstractFacade<Dim_fecha> implements Dim_fechaFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Dim_fechaFacade() {
        super(Dim_fecha.class);
    }
    
}
