/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import com.prueba.dao.ConductorFacadeLocal;
import com.prueba.entidades.Conductor;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "conductorMB")
@RequestScoped
public class ConductorMB {

    @EJB
    private ConductorFacadeLocal conductorFacade;
    private Conductor conductor;
    private List<Conductor> listaConductor;
    
    public ConductorMB() {
        this.conductor = new Conductor();
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public List<Conductor> getListaConductor() {
        listaConductor = conductorFacade.findAll();
        return listaConductor;
    }

    public void setListaConductor(List<Conductor> listaConductor) {
        this.listaConductor = listaConductor;
    }
    
    @PostConstruct
    public void unit(){
        getListaConductor();
    }
    
     public void prepararNuevoConductor(){
        this.conductor = new Conductor();
    }
    
    public void registrar(){
        try {
            conductorFacade.create(conductor);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void actualizar(){
        try {
            conductorFacade.edit(conductor);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void eliminar(){
        try {
            conductorFacade.remove(conductor);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
