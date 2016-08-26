
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeEmpleado;


@Stateless
public class CeEmpleadoFacade extends AbstractFacade<CeEmpleado> implements CeEmpleadoFacadeLocal {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CeEmpleadoFacade() {
        super(CeEmpleado.class);
    }
    
}
