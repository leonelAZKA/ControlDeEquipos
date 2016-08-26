
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeComentarios;


@Stateless
public class CeComentariosFacade extends AbstractFacade<CeComentarios> implements CeComentariosFacadeLocal {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CeComentariosFacade() {
        super(CeComentarios.class);
    }
    
}
