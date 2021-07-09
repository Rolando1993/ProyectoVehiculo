/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import com.prueba.dao.VehiculoFacadeLocal;
import com.prueba.entidades.Vehiculo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "vehiculoMB")
@RequestScoped
public class VehiculoMB {

    @EJB
    private VehiculoFacadeLocal vehiculoFacade;
    private Vehiculo vehiculo;
    private List<Vehiculo> listaVehiculo;
    
    public VehiculoMB() {
        this.vehiculo = new Vehiculo();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Vehiculo> getListaVehiculo() {
        listaVehiculo = vehiculoFacade.findAll();
        return listaVehiculo;
    }

    public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }
    
    @PostConstruct
    public void unit(){
        getListaVehiculo();
    }
    
     public void prepararNuevoVehiculo(){
        this.vehiculo = new Vehiculo();
    }
    
    public void registrar(){
        try {
            vehiculoFacade.create(vehiculo);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void actualizar(){
        try {
            vehiculoFacade.edit(vehiculo);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void eliminar(){
        try {
            vehiculoFacade.remove(vehiculo);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
