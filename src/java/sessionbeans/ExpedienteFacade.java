/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Expediente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author EstelaChayoMonse
 */
@Stateless
public class ExpedienteFacade extends AbstractFacade<Expediente> implements ExpedienteFacadeLocal {

    @PersistenceContext(unitName = "WServiceEscuelaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExpedienteFacade() {
        super(Expediente.class);
    }
    
}
