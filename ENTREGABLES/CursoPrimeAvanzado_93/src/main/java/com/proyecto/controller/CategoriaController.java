package com.proyecto.controller;
import com.proyecto.ejb.CategoriaFacadeLocal;
import com.proyecto.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author isaac
 */
@Named
@ViewScoped
public class CategoriaController implements Serializable{
 
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    @Inject
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    @PostConstruct
    public void init(){
        //categoria = new Categoria(); //@Inject
    }
    
    public void registrar(){
        try {
            categoriaEJB.create(categoria);
        } catch (Exception e) { //mensaje
        }
    }
}