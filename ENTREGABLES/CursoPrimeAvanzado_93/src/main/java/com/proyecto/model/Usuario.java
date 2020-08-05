package com.proyecto.model;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="codigo", nullable = false)
    private Persona codigo;
    
    @Column(name = "usuario") //FK DE PERSONA
    private String usuario;
    
    @Column(name = "clave")
    private String clave;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "estado")
    private boolean estado = true;

    public Persona getCodigo() {
        return codigo;
    }
    public void setCodigo(Persona codigo) {
        this.codigo = codigo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + '}';
    }
}