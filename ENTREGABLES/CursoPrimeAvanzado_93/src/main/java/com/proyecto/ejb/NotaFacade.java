package com.proyecto.ejb;

import com.proyecto.model.*;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author isaac
 */
@Stateless
public class NotaFacade extends AbstractFacade<Nota> implements NotaFacadeLocal{
    
    @PersistenceContext(unitName = "primePU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
    public NotaFacade(){
        super(Nota.class);
    }
}