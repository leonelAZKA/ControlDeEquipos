
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CePermisos;


@Stateless
public class CePermisosFacade extends AbstractFacade<CePermisos> implements CePermisosFacadeLocal {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CePermisosFacade() {
        super(CePermisos.class);
    }
    
}
