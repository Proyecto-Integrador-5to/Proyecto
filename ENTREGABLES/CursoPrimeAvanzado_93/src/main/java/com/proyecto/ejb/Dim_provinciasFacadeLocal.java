/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import com.proyecto.model.Dim_provincias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author isaac
 */
@Local
public interface Dim_provinciasFacadeLocal {

    void create(Dim_provincias dim_provincias);

    void edit(Dim_provincias dim_provincias);

    void remove(Dim_provincias dim_provincias);

    Dim_provincias find(Object id);

    List<Dim_provincias> findAll();

    List<Dim_provincias> findRange(int[] range);

    int count();
    
}
