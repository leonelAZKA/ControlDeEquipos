/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeProyecto;

/**
 *
 * @author Rogelio
 */
@Stateless
public class CeProyectoFacade extends AbstractFacade<CeProyecto> {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CeProyectoFacade() {
        super(CeProyecto.class);
    }
    
}
