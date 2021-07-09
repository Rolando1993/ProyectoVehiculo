/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao.impl;

import com.prueba.dao.AbstractFacade;
import com.prueba.dao.ConductorFacadeLocal;
import com.prueba.entidades.Conductor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class ConductorFacade extends AbstractFacade<Conductor> implements ConductorFacadeLocal {

    @PersistenceContext(unitName = "PruebaVehiculoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConductorFacade() {
        super(Conductor.class);
    }
    
}
