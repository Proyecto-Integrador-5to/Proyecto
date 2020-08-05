package com.proyecto.controller;

import com.proyecto.model.Usuario;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author isaac
 */
@Named
@ViewScoped
public class plantillaController implements Serializable{
    public void verificarSesion(){
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            
            if(us == null){
                context.getExternalContext().redirect("./../permisos.xhtml");
            }
        } catch (Exception e) {
            //logg para guardar registrod e un error de la sesion 
        }
    }
}