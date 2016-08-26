
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CeEquipos;


@Local
public interface CeEquiposFacadeLocal {

    void create(CeEquipos ceEquipos);

    void edit(CeEquipos ceEquipos);

    void remove(CeEquipos ceEquipos);

    CeEquipos find(Object id);

    List<CeEquipos> findAll();

    List<CeEquipos> findRange(int[] range);

    int count();
    
}
