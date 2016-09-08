
package mx.azka.controlDeEquipos.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.azka.controlDeEquipos.entity.CeUsuario;


@Stateless
public class CeUsuarioFacade extends AbstractFacade<CeUsuario> implements CeUsuarioFacadeLocal {
    @PersistenceContext(unitName = "PU_CE")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CeUsuarioFacade() {
        super(CeUsuario.class);
    }
    
}
