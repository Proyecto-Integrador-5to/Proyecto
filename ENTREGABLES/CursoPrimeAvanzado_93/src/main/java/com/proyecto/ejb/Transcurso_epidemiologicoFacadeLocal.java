package com.proyecto.ejb;

import com.proyecto.model.Transcurso_epidemiologico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author isaac
 */
@Local
public interface Transcurso_epidemiologicoFacadeLocal {

    void create(Transcurso_epidemiologico trancurso_epidemiologico);

    void edit(Transcurso_epidemiologico trancurso_epidemiologico);

    void remove(Transcurso_epidemiologico trancurso_epidemiologico);

    Transcurso_epidemiologico find(Object id);

    List<Transcurso_epidemiologico> findAll();

    List<Transcurso_epidemiologico> findRange(int[] range);

    int count();
    
    List<Transcurso_epidemiologico> buscarTranscurso(int codigoProvincia) throws Exception;
}
