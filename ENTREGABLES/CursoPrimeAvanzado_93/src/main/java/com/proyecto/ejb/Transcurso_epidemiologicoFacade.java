package com.proyecto.ejb;

import com.proyecto.model.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author isaac
 */
@Stateless
public class Transcurso_epidemiologicoFacade extends AbstractFacade<Transcurso_epidemiologico> implements Transcurso_epidemiologicoFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Transcurso_epidemiologicoFacade() {
        super(Transcurso_epidemiologico.class);
    }
    
    @Override
    public List<Transcurso_epidemiologico> buscarTranscurso(int codigoProvincia) {
        List<Transcurso_epidemiologico> lista = null;
        String consulta;
        
        try {
            consulta = "FROM transcurso_epidemiologico t WHERE t.sk_codigo_ine.sk_codigo_ine = ?1";
            Query query = em.createQuery(consulta);
            query.setParameter(1, codigoProvincia);            

            lista = query.getResultList();            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
}