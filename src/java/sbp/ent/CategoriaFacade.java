/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbp.ent;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import paqueteDB.Categoria;

/**
 *
 * @author Maye
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> {

    @PersistenceContext(unitName = "Parte_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }
    
}
