package com.proyecto.controller;

import com.proyecto.model.*;
import com.proyecto.ejb.*;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author isaac
 */
@Named
@ViewScoped
public class ComentarController implements Serializable{
    
    @EJB
    private NotaFacadeLocal notaEJB;
    @EJB
    private PersonaFacadeLocal personaEJB;
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    @EJB
    private Dim_provinciasFacadeLocal dimprovinciasEJB;
    @EJB
    private Dim_fechaFacadeLocal fechaEJB;
    @EJB
    private Transcurso_epidemiologicoFacadeLocal transcursoEJB;
    @EJB
    private AuditoriaFacadeLocal auditoriaEJB;
    
    private List<Nota> notas;
    private List<Persona> persona;
    private List<Usuario> Usuario;
    private List<Dim_provincias> dimprovincias;
    private List<Dim_fecha> fecha;
    private List<Transcurso_epidemiologico> transcurso;
    private List<Auditoria> auditoria;

    public List<Auditoria> getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(List<Auditoria> auditoria) {
        this.auditoria = auditoria;
    }
    public List<Transcurso_epidemiologico> getTranscurso() {
        return transcurso;
    }
    public void setTranscurso(List<Transcurso_epidemiologico> transcurso) {
        this.transcurso = transcurso;
    }
    public List<Dim_fecha> getFecha() {
        return fecha;
    }
    public void setFecha(List<Dim_fecha> fecha) {
        this.fecha = fecha;
    }
    public List<Dim_provincias> getDimprovincias() {
        return dimprovincias;
    }

    public void setDimprovincias(List<Dim_provincias> dimprovincias) {
        this.dimprovincias = dimprovincias;
    }
    
    public List<Nota> getNotas() {
        return notas;
    }
    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public List<Persona> getPersona() {
        return persona;
    }
    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    public List<Usuario> getUsuario() {
        return Usuario;
    }
    public void setUsuario(List<Usuario> Usuario) {
        this.Usuario = Usuario;
    }
    

    @PostConstruct
    public void init() {
        notas = notaEJB.findAll();
        persona = personaEJB.findAll();
        Usuario = usuarioEJB.findAll();
        dimprovincias = dimprovinciasEJB.findAll();
        fecha = fechaEJB.findAll();
        transcurso = transcursoEJB.findAll();
        auditoria = auditoriaEJB.findAll();
    }
}