/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao.impl;

import com.prueba.dao.AbstractFacade;
import com.prueba.dao.RepresetanteporempresaFacadeLocal;
import com.prueba.entidades.Represetanteporempresa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class RepresetanteporempresaFacade extends AbstractFacade<Represetanteporempresa> implements RepresetanteporempresaFacadeLocal {

    @PersistenceContext(unitName = "PruebaVehiculoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepresetanteporempresaFacade() {
        super(Represetanteporempresa.class);
    }
    
}
