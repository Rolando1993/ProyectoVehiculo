/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import com.prueba.dao.RepresentantelegalFacadeLocal;
import com.prueba.entidades.Representantelegal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "representanteMB")
@RequestScoped
public class RepresentanteMB {

    @EJB
    private RepresentantelegalFacadeLocal representantelegalFacade;
    private Representantelegal representante;
    private List<Representantelegal> listaRepresentante;
    
    public RepresentanteMB() {
        this.representante = new Representantelegal();
    }

    public Representantelegal getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representantelegal representante) {
        this.representante = representante;
    }

    public List<Representantelegal> getListaRepresentante() {
        listaRepresentante = representantelegalFacade.findAll();
        return listaRepresentante;
    }

    public void setListaRepresentante(List<Representantelegal> listaRepresentante) {
        this.listaRepresentante = listaRepresentante;
    }
    
     @PostConstruct
    public void unit(){
        getListaRepresentante();
    }
    
     public void prepararNuevoRepresentante(){
        this.representante = new Representantelegal();
    }
    
    public void registrar(){
        try {
            representantelegalFacade.create(representante);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void actualizar(){
        try {
            representantelegalFacade.edit(representante);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void eliminar(){
        try {
            representantelegalFacade.remove(representante);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    
}
