/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeEquipos;

/**
 *
 * @author Rogelio
 */
@Stateless
public class CeEquiposFacade extends AbstractFacade<CeEquipos> {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CeEquiposFacade() {
        super(CeEquipos.class);
    }
    
}
