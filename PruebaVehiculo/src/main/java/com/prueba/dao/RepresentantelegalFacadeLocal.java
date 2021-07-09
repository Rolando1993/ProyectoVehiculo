/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.entidades.Representantelegal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface RepresentantelegalFacadeLocal {

    void create(Representantelegal representantelegal);

    void edit(Representantelegal representantelegal);

    void remove(Representantelegal representantelegal);

    Representantelegal find(Object id);

    List<Representantelegal> findAll();

    List<Representantelegal> findRange(int[] range);

    int count();
    
}
