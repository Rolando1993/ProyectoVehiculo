/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao.impl;

import com.prueba.dao.AbstractFacade;
import com.prueba.dao.RepresentantelegalFacadeLocal;
import com.prueba.entidades.Representantelegal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class RepresentantelegalFacade extends AbstractFacade<Representantelegal> implements RepresentantelegalFacadeLocal {

    @PersistenceContext(unitName = "PruebaVehiculoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepresentantelegalFacade() {
        super(Representantelegal.class);
    }
    
}
