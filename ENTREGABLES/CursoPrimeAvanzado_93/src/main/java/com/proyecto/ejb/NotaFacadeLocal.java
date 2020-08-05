package com.proyecto.ejb;

import com.proyecto.model.Nota;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author isaac
 */
@Local
public interface NotaFacadeLocal {
    
    void create(Nota nota);

    void edit(Nota nota);

    void remove(Nota nota);

    Nota find(Object id);

    List<Nota> findAll();

    List<Nota> findRange(int[] range);

    int count();      
    
    //List<Nota> buscar(int codigoPersona, int codigoCategoria, Date fechaConsulta) throws Exception;
}