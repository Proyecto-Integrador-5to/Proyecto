package com.proyecto.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author isaac
 */
@Entity
@Table(name = "tb_auditoria")
public class Auditoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tabla_aud;
    @Column(name="operacion_aud")
    private String operacion_aud;
    @Column(name="valoranterior_aud")
    private String valoranterior_aud;
    @Column(name="valornuevo_aud")
    private String valornuevo_aud;
    @Column(name="fecha_aud")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_aud;
    @Column(name="usuario_aud")
    private String usuario_aud;
    @Column(name="esquema_aud")
    private String esquema_aud;
    @Column(name="activar_aud")
    private boolean activar_aud;

    public String getTabla_aud() {
        return tabla_aud;
    }

    public void setTabla_aud(String tabla_aud) {
        this.tabla_aud = tabla_aud;
    }

    public String getOperacion_aud() {
        return operacion_aud;
    }

    public void setOperacion_aud(String operacion_aud) {
        this.operacion_aud = operacion_aud;
    }

    public String getValoranterior_aud() {
        return valoranterior_aud;
    }

    public void setValoranterior_aud(String valoranterior_aud) {
        this.valoranterior_aud = valoranterior_aud;
    }

    public String getValornuevo_aud() {
        return valornuevo_aud;
    }

    public void setValornuevo_aud(String valornuevo_aud) {
        this.valornuevo_aud = valornuevo_aud;
    }

    public Date getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(Date fecha_aud) {
        this.fecha_aud = fecha_aud;
    }

    public String getUsuario_aud() {
        return usuario_aud;
    }

    public void setUsuario_aud(String usuario_aud) {
        this.usuario_aud = usuario_aud;
    }

    public String getEsquema_aud() {
        return esquema_aud;
    }

    public void setEsquema_aud(String esquema_aud) {
        this.esquema_aud = esquema_aud;
    }

    public boolean isActivar_aud() {
        return activar_aud;
    }

    public void setActivar_aud(boolean activar_aud) {
        this.activar_aud = activar_aud;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.tabla_aud);
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
        final Auditoria other = (Auditoria) obj;
        if (!Objects.equals(this.tabla_aud, other.tabla_aud)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "tabla_aud=" + tabla_aud + '}';
    }
    
    
}