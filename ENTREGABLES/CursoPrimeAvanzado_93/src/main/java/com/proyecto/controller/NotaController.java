package com.proyecto.controller;

import com.proyecto.ejb.CategoriaFacade;
import com.proyecto.ejb.CategoriaFacadeLocal;
import com.proyecto.model.*;
import com.proyecto.ejb.NotaFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author isaac
 */
@Named
@ViewScoped
public class NotaController implements Serializable{
    
    @EJB
    private NotaFacadeLocal EJBNota;
    @EJB
    private CategoriaFacadeLocal EJBCategoria;
    
    @Inject
    private Nota nota;
    @Inject
    private Categoria categoria;
    
    private List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        return categorias;
    }
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @PostConstruct
    public void init(){
        categorias = EJBCategoria.findAll();
    }
    
    public void registrar(){
        try {
            Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            nota.setCategoria(categoria);
            nota.setPersona(us.getCodigo());
            EJBNota.create(nota);
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se registró"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
        }
    }

}