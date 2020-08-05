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
public class consultarController implements Serializable {
    
    @EJB
    private PersonaFacadeLocal personaEJB;
    @EJB
    private TelefonoFacadeLocal telefonoEJB;
    @EJB
    private Dim_provinciasFacadeLocal provinciaEJB;
    @EJB
    private Transcurso_epidemiologicoFacadeLocal transcursoEJB;

    private List<Persona> personas;
    private List<Telefono> telefonos;
    private List<Dim_provincias> provincias;
    private List<Transcurso_epidemiologico> transcursos;
    private int codigoPersona;
    private int codigoProvincia;

    public List<Transcurso_epidemiologico> getTranscurso() {
        return transcursos;
    }

    public void setTranscurso(List<Transcurso_epidemiologico> transcurso) {
        this.transcursos = transcurso;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Dim_provincias> getProvincias() {
        return provincias;
    }
    public void setProvincias(List<Dim_provincias> provincias) {
        this.provincias = provincias;
    }
    

    public List<Telefono> getTelefonos() {
        return telefonos;
    }
    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }   
    
    public int getCodigoPersona() {
        return codigoPersona;
    }
    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    @PostConstruct
    public void init() {
        personas = personaEJB.findAll();
        provincias = provinciaEJB.findAll();
    }

    public void buscarTelefonos() throws Exception {
        try {
            telefonos = telefonoEJB.buscarTelefono(codigoPersona);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarTranscursos() throws Exception{
        try {
            transcursos = transcursoEJB.buscarTranscurso(codigoProvincia);
        } catch (Exception e) {
            throw e;
        }
    }
}