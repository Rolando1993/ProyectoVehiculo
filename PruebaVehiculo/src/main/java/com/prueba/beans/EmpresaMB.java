/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import com.prueba.dao.EmpresaFacadeLocal;
import com.prueba.entidades.Empresa;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "empresaMB")
@RequestScoped
public class EmpresaMB {

    @EJB
    private EmpresaFacadeLocal empresaFacade;
    private Empresa empresa;
    private List<Empresa> listaEmpresas;
    
    public EmpresaMB() {
        this.empresa = new Empresa();
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Empresa> getListaEmpresas() {
        listaEmpresas = empresaFacade.findAll();
        return listaEmpresas;
    }

    public void setListaEmpresas(List<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    
    @PostConstruct
    public void unit(){
        getListaEmpresas();
    }
    
     public void prepararNuevaEmpresa(){
        this.empresa = new Empresa();
    }
    
    public void registrar(){
        try {
            empresaFacade.create(empresa);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void actualizar(){
        try {
            empresaFacade.edit(empresa);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void eliminar(){
        try {
            empresaFacade.remove(empresa);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
