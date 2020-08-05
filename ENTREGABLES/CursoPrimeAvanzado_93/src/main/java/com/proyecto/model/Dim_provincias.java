package com.proyecto.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author isaac
 */
@Entity
@Table(name = "dim_provincias")
public class Dim_provincias implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sk_codigo_ine;
    
    @Column(name="pk_codigo_ine")
    private int pk_codigo_ine;
    
    @Column(name="provincias")
    private String provinciass;
    
    @Column(name="posicion")
    private String posicion;
    
    @Column(name="valido_hasta")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date valido_hasta;
    
    @Column(name="valido_desde")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date valido_desde;
    
    @Column(name="version")
    private int version ;

    public int getSk_codigo_ine() {
        return sk_codigo_ine;
    }
    public void setSk_codigo_ine(int sk_codigo_ine) {
        this.sk_codigo_ine = sk_codigo_ine;
    }
    public int getPk_codigo_ine() {
        return pk_codigo_ine;
    }
    public void setPk_codigo_ine(int pk_codigo_ine) {
        this.pk_codigo_ine = pk_codigo_ine;
    }
    public String getProvincias() {
        return provinciass;
    }
    public void setProvincias(String provincias) {
        this.provinciass = provincias;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Date getValido_hasta() {
        return valido_hasta;
    }
    public void setValido_hasta(Date valido_hasta) {
        this.valido_hasta = valido_hasta;
    }
    public Date getValido_desde() {
        return valido_desde;
    }
    public void setValido_desde(Date valido_desde) {
        this.valido_desde = valido_desde;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.sk_codigo_ine;
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
        final Dim_provincias other = (Dim_provincias) obj;
        if (this.sk_codigo_ine != other.sk_codigo_ine) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dim_provincias{" + "sk_codigo_ine=" + sk_codigo_ine + '}';
    }
}
