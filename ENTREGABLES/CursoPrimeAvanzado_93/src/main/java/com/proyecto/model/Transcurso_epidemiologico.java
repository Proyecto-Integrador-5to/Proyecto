package com.proyecto.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author isaac
 */
@Entity
@Table(name = "transcurso_epidemiologico")
public class Transcurso_epidemiologico implements Serializable{
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="sk_codigo_ine", nullable = false)
    private Dim_provincias sk_codigo_ine;
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="sk_fecha", nullable = false)
    private Dim_fecha sk_fecha;
    
    @Column(name = "casos_confirmados")
    private int casos_confirmados;
    
    @Column(name = "nuevos_posibles_casos")
    private int nuevos_posibles_casos;
    
    @Column(name = "altas")
    private int altas;
    
    @Column(name = "fallecimientos")
    private int fallecimientos;

   
    public int getCasos_confirmados() {
        return casos_confirmados;
    }

    public void setCasos_confirmados(int casos_confirmados) {
        this.casos_confirmados = casos_confirmados;
    }

    public int getNuevos_posibles_casos() {
        return nuevos_posibles_casos;
    }

    public void setNuevos_posibles_casos(int nuevos_posibles_casos) {
        this.nuevos_posibles_casos = nuevos_posibles_casos;
    }

    public int getAltas() {
        return altas;
    }

    public void setAltas(int altas) {
        this.altas = altas;
    }

    public int getFallecimientos() {
        return fallecimientos;
    }

    public void setFallecimientos(int fallecimientos) {
        this.fallecimientos = fallecimientos;
    }

    public Dim_provincias getSk_codigo_ine() {
        return sk_codigo_ine;
    }

    public void setSk_codigo_ine(Dim_provincias sk_codigo_ine) {
        this.sk_codigo_ine = sk_codigo_ine;
    }

    public Dim_fecha getSk_fecha() {
        return sk_fecha;
    }

    public void setSk_fecha(Dim_fecha sk_fecha) {
        this.sk_fecha = sk_fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.sk_codigo_ine);
        hash = 73 * hash + Objects.hashCode(this.sk_fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transcurso_epidemiologico other = (Transcurso_epidemiologico) obj;
        if (!Objects.equals(this.sk_codigo_ine, other.sk_codigo_ine)) {
            return false;
        }
        if (!Objects.equals(this.sk_fecha, other.sk_fecha)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Trancurso_epidemiologico{" + "sk_codigo_ine=" + sk_codigo_ine + ", sk_fecha=" + sk_fecha + '}';
    }
}