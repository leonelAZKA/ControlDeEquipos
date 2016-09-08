
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CeProyecto;


@Local
public interface CeProyectoFacadeLocal {

    void create(CeProyecto ceProyecto);

    void edit(CeProyecto ceProyecto);

    void remove(CeProyecto ceProyecto);

    CeProyecto find(Object id);

    List<CeProyecto> findAll();

    List<CeProyecto> findRange(int[] range);

    int count();
    
}
