package com.proyecto.model;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "estado")
    private boolean estado = true;

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isEstado() {
        return estado;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override //EQUALS AND HASHCODE DE CODIGO
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
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
        final Categoria other = (Categoria) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override //TO STRING DE CODIGO
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + '}';
    }
}