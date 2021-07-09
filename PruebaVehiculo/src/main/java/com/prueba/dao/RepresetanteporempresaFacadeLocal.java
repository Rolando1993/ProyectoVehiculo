/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.entidades.Represetanteporempresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface RepresetanteporempresaFacadeLocal {

    void create(Represetanteporempresa represetanteporempresa);

    void edit(Represetanteporempresa represetanteporempresa);

    void remove(Represetanteporempresa represetanteporempresa);

    Represetanteporempresa find(Object id);

    List<Represetanteporempresa> findAll();

    List<Represetanteporempresa> findRange(int[] range);

    int count();
    
}
