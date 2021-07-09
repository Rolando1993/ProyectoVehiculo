/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c"),
    @NamedQuery(name = "Conductor.findByIdconductor", query = "SELECT c FROM Conductor c WHERE c.idconductor = :idconductor"),
    @NamedQuery(name = "Conductor.findByTipo", query = "SELECT c FROM Conductor c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Conductor.findByNumeroidentificacion", query = "SELECT c FROM Conductor c WHERE c.numeroidentificacion = :numeroidentificacion"),
    @NamedQuery(name = "Conductor.findByNombre", query = "SELECT c FROM Conductor c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Conductor.findByDireccion", query = "SELECT c FROM Conductor c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Conductor.findByCiudad", query = "SELECT c FROM Conductor c WHERE c.ciudad = :ciudad"),
    @NamedQuery(name = "Conductor.findByDepartamento", query = "SELECT c FROM Conductor c WHERE c.departamento = :departamento"),
    @NamedQuery(name = "Conductor.findByPais", query = "SELECT c FROM Conductor c WHERE c.pais = :pais"),
    @NamedQuery(name = "Conductor.findByTelefono", query = "SELECT c FROM Conductor c WHERE c.telefono = :telefono")})
public class Conductor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconductor")
    private Integer idconductor;
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
    @OneToMany(mappedBy = "idconductor", fetch = FetchType.LAZY)
    private List<Vehiculo> vehiculoList;

    public Conductor() {
    }

    public Conductor(Integer idconductor) {
        this.idconductor = idconductor;
    }

    public Integer getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(Integer idconductor) {
        this.idconductor = idconductor;
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
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconductor != null ? idconductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.idconductor == null && other.idconductor != null) || (this.idconductor != null && !this.idconductor.equals(other.idconductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.entidades.Conductor[ idconductor=" + idconductor + " ]";
    }
    
}
