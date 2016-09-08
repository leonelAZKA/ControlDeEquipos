
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CeEmpleado;


@Local
public interface CeEmpleadoFacadeLocal {

    void create(CeEmpleado ceEmpleado);

    void edit(CeEmpleado ceEmpleado);

    void remove(CeEmpleado ceEmpleado);

    CeEmpleado find(Object id);

    List<CeEmpleado> findAll();

    List<CeEmpleado> findRange(int[] range);

    int count();
    
}
