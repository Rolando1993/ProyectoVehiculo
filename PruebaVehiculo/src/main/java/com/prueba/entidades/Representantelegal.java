/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "representantelegal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representantelegal.findAll", query = "SELECT r FROM Representantelegal r"),
    @NamedQuery(name = "Representantelegal.findByIdrepresentante", query = "SELECT r FROM Representantelegal r WHERE r.idrepresentante = :idrepresentante"),
    @NamedQuery(name = "Representantelegal.findByTipo", query = "SELECT r FROM Representantelegal r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Representantelegal.findByNumeroidentificacion", query = "SELECT r FROM Representantelegal r WHERE r.numeroidentificacion = :numeroidentificacion"),
    @NamedQuery(name = "Representantelegal.findByNombre", query = "SELECT r FROM Representantelegal r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Representantelegal.findByDireccion", query = "SELECT r FROM Representantelegal r WHERE r.direccion = :direccion"),
    @NamedQuery(name = "Representantelegal.findByCiudad", query = "SELECT r FROM Representantelegal r WHERE r.ciudad = :ciudad"),
    @NamedQuery(name = "Representantelegal.findByDepartamento", query = "SELECT r FROM Representantelegal r WHERE r.departamento = :departamento"),
    @NamedQuery(name = "Representantelegal.findByPais", query = "SELECT r FROM Representantelegal r WHERE r.pais = :pais"),
    @NamedQuery(name = "Representantelegal.findByTelefono", query = "SELECT r FROM Representantelegal r WHERE r.telefono = :telefono")})
public class Representantelegal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrepresentante")
    private Integer idrepresentante;
    @Size(max = 40)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 40)
    @Column(name = "numeroidentificacion")
    private String numeroidentificacion;
    @Size(max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 40)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 40)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 40)
    @Column(name = "departamento")
    private String departamento;
    @Size(max = 40)
    @Column(name = "pais")
    private String pais;
    @Size(max = 40)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrepresentante", fetch = FetchType.LAZY)
    private List<Represetanteporempresa> represetanteporempresaList;
    @OneToMany(mappedBy = "idrepresentante", fetch = FetchType.LAZY)
    private List<Vehiculo> vehiculoList;

    public Representantelegal() {
    }

    public Representantelegal(Integer idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    public Integer getIdrepresentante() {
        return idrepresentante;
    }

    public void setIdrepresentante(Integer idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public List<Represetanteporempresa> getRepresetanteporempresaList() {
        return represetanteporempresaList;
    }

    public void setRepresetanteporempresaList(List<Represetanteporempresa> represetanteporempresaList) {
        this.represetanteporempresaList = represetanteporempresaList;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrepresentante != null ? idrepresentante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representantelegal)) {
            return false;
        }
        Representantelegal other = (Representantelegal) object;
        if ((this.idrepresentante == null && other.idrepresentante != null) || (this.idrepresentante != null && !this.idrepresentante.equals(other.idrepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.entidades.Representantelegal[ idrepresentante=" + idrepresentante + " ]";
    }
    
}
