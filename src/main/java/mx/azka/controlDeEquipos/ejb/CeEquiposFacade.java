
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeEquipos;


@Stateless
public class CeEquiposFacade extends AbstractFacade<CeEquipos> implements CeEquiposFacadeLocal {
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
