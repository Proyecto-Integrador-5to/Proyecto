package com.proyecto.controller;

import com.proyecto.ejb.UsuarioFacadeLocal;
import com.proyecto.model.Persona;
import com.proyecto.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuarioController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    
    @Inject
    private Usuario usuario;
    @Inject
    private Persona persona;
    
    @PostConstruct
    public void init(){
        //usuario = new Usuario();
        //persona = new Persona();
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public Persona getPersona() {
        return persona;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void registrar()
    {
        try {
            this.usuario.setCodigo(persona);  
            usuarioEJB.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso:", "Registro Exitoso!"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error:", "No Persistio"));
        }
    }
}
