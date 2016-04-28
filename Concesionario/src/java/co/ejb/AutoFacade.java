/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ejb;

import co.modelo.Auto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SoledadGarcia
 */
@Stateless
public class AutoFacade extends AbstractFacade<Auto> {

    @PersistenceContext(unitName = "ConcesionarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutoFacade() {
        super(Auto.class);
    }
    
}
