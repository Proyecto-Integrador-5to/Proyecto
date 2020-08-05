package com.proyecto.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "nota")
public class Nota implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @ManyToOne
    @JoinColumn(name="codigo_persona", nullable = false)//FK DE PERSONA
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="codigo_categoria", nullable = false)//FK DE CATEGORIA
    private Categoria categoria;
    
    @Column(name = "encabezado")
    private String encabezado;
    
    @Column(name = "cuerpo")
    private String cuerpo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", insertable = false)
    private Date fecha;
    
    @Column(name = "comentarioadmin")
    private String comentarioadmin;
    
    @Column(name = "valorizacion")
    private String valorizacion;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getEncabezado() {
        return encabezado;
    }
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getComentarioadmin() {
        return comentarioadmin;
    }
    public void setComentarioadmin(String comentarioadmin) {
        this.comentarioadmin = comentarioadmin;
    }
    public String getValorizacion() {
        return valorizacion;
    }
    public void setValorizacion(String valorizacion) {
        this.valorizacion = valorizacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
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
        final Nota other = (Nota) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nota{" + "codigo=" + codigo + '}';
    }
}