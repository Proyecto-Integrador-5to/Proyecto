/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import com.proyecto.model.Dim_fecha;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author isaac
 */
@Local
public interface Dim_fechaFacadeLocal {

    void create(Dim_fecha dim_fecha);

    void edit(Dim_fecha dim_fecha);

    void remove(Dim_fecha dim_fecha);

    Dim_fecha find(Object id);

    List<Dim_fecha> findAll();

    List<Dim_fecha> findRange(int[] range);

    int count();
    
}
