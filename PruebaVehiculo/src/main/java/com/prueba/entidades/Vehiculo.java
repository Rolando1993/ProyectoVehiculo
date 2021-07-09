/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findByIdvehiculo", query = "SELECT v FROM Vehiculo v WHERE v.idvehiculo = :idvehiculo"),
    @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Vehiculo.findByMotor", query = "SELECT v FROM Vehiculo v WHERE v.motor = :motor"),
    @NamedQuery(name = "Vehiculo.findByChasis", query = "SELECT v FROM Vehiculo v WHERE v.chasis = :chasis"),
    @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Vehiculo.findByFechamatricula", query = "SELECT v FROM Vehiculo v WHERE v.fechamatricula = :fechamatricula"),
    @NamedQuery(name = "Vehiculo.findByNumeropasajerossentados", query = "SELECT v FROM Vehiculo v WHERE v.numeropasajerossentados = :numeropasajerossentados"),
    @NamedQuery(name = "Vehiculo.findByNumeropasajerospies", query = "SELECT v FROM Vehiculo v WHERE v.numeropasajerospies = :numeropasajerospies"),
    @NamedQuery(name = "Vehiculo.findByPesoseco", query = "SELECT v FROM Vehiculo v WHERE v.pesoseco = :pesoseco"),
    @NamedQuery(name = "Vehiculo.findByPesobruto", query = "SELECT v FROM Vehiculo v WHERE v.pesobruto = :pesobruto"),
    @NamedQuery(name = "Vehiculo.findByCantidadpuerta", query = "SELECT v FROM Vehiculo v WHERE v.cantidadpuerta = :cantidadpuerta"),
    @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Vehiculo.findByLinea", query = "SELECT v FROM Vehiculo v WHERE v.linea = :linea")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvehiculo")
    private Integer idvehiculo;
    @Size(max = 40)
    @Column(name = "placa")
    private String placa;
    @Size(max = 40)
    @Column(name = "motor")
    private String motor;
    @Size(max = 40)
    @Column(name = "chasis")
    private String chasis;
    @Size(max = 40)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "fechamatricula")
    @Temporal(TemporalType.DATE)
    private Date fechamatricula;
    @Column(name = "numeropasajerossentados")
    private Integer numeropasajerossentados;
    @Column(name = "numeropasajerospies")
    private Integer numeropasajerospies;
    @Size(max = 40)
    @Column(name = "pesoseco")
    private String pesoseco;
    @Size(max = 40)
    @Column(name = "pesobruto")
    private String pesobruto;
    @Column(name = "cantidadpuerta")
    private Integer cantidadpuerta;
    @Size(max = 40)
    @Column(name = "marca")
    private String marca;
    @Size(max = 40)
    @Column(name = "linea")
    private String linea;
    @JoinColumn(name = "idconductor", referencedColumnName = "idconductor")
    @ManyToOne(fetch = FetchType.LAZY)
    private Conductor idconductor;
    @JoinColumn(name = "idrepresentante", referencedColumnName = "idrepresentante")
    @ManyToOne(fetch = FetchType.LAZY)
    private Representantelegal idrepresentante;

    public Vehiculo() {
    }

    public Vehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Integer getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(Date fechamatricula) {
        this.fechamatricula = fechamatricula;
    }

    public Integer getNumeropasajerossentados() {
        return numeropasajerossentados;
    }

    public void setNumeropasajerossentados(Integer numeropasajerossentados) {
        this.numeropasajerossentados = numeropasajerossentados;
    }

    public Integer getNumeropasajerospies() {
        return numeropasajerospies;
    }

    public void setNumeropasajerospies(Integer numeropasajerospies) {
        this.numeropasajerospies = numeropasajerospies;
    }

    public String getPesoseco() {
        return pesoseco;
    }

    public void setPesoseco(String pesoseco) {
        this.pesoseco = pesoseco;
    }

    public String getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(String pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Integer getCantidadpuerta() {
        return cantidadpuerta;
    }

    public void setCantidadpuerta(Integer cantidadpuerta) {
        this.cantidadpuerta = cantidadpuerta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Conductor getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(Conductor idconductor) {
        this.idconductor = idconductor;
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
        hash += (idvehiculo != null ? idvehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.idvehiculo == null && other.idvehiculo != null) || (this.idvehiculo != null && !this.idvehiculo.equals(other.idvehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.entidades.Vehiculo[ idvehiculo=" + idvehiculo + " ]";
    }
    
}
