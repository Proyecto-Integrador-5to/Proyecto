package com.proyecto.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author isaac
 */
@Entity
@Table(name = "dim_fecha")
public class Dim_fecha implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sk_fecha;
    
    @Column(name="anio")
    private int anio;
    
    @Column(name="mes")
    private int mes;
    
    @Column(name="nombre_mes")
    private String nombre_mes;
    
    @Column(name="dia")
    private int dia;
    
    @Column(name="fecha")
    private Date fecha;

    public int getSk_fecha() {
        return sk_fecha;
    }
    public void setSk_fecha(int sk_fecha) {
        this.sk_fecha = sk_fecha;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public String getNombre_mes() {
        return nombre_mes;
    }
    public void setNombre_mes(String nombre_mes) {
        this.nombre_mes = nombre_mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.sk_fecha;
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
        final Dim_fecha other = (Dim_fecha) obj;
        if (this.sk_fecha != other.sk_fecha) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dim_fecha{" + "sk_fecha=" + sk_fecha + '}';
    }
}
