/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "represetanteporempresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Represetanteporempresa.findAll", query = "SELECT r FROM Represetanteporempresa r"),
    @NamedQuery(name = "Represetanteporempresa.findByIdrepresentanteempresa", query = "SELECT r FROM Represetanteporempresa r WHERE r.idrepresentanteempresa = :idrepresentanteempresa"),
    @NamedQuery(name = "Represetanteporempresa.findByDescripcion", query = "SELECT r FROM Represetanteporempresa r WHERE r.descripcion = :descripcion")})
public class Represetanteporempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrepresentanteempresa")
    private Integer idrepresentanteempresa;
    @Size(max = 40)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresa idempresa;
    @JoinColumn(name = "idrepresentante", referencedColumnName = "idrepresentante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Representantelegal idrepresentante;

    public Represetanteporempresa() {
    }

    public Represetanteporempresa(Integer idrepresentanteempresa) {
        this.idrepresentanteempresa = idrepresentanteempresa;
    }

    public Integer getIdrepresentanteempresa() {
        return idrepresentanteempresa;
    }

    public void setIdrepresentanteempresa(Integer idrepresentanteempresa) {
        this.idrepresentanteempresa = idrepresentanteempresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Empresa idempresa) {
        this.idempresa = idempresa;
    }

    public Representantelegal getIdrepresentante() {
        return idrepresentante;
    }

    public void setIdrepresentante(Representantelegal idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrepresentanteempresa != null ? idrepresentanteempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Represetanteporempresa)) {
            return false;
        }
        Represetanteporempresa other = (Represetanteporempresa) object;
        if ((this.idrepresentanteempresa == null && other.idrepresentanteempresa != null) || (this.idrepresentanteempresa != null && !this.idrepresentanteempresa.equals(other.idrepresentanteempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.entidades.Represetanteporempresa[ idrepresentanteempresa=" + idrepresentanteempresa + " ]";
    }
    
}
