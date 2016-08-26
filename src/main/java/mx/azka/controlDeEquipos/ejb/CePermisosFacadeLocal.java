
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CePermisos;


@Local
public interface CePermisosFacadeLocal {

    void create(CePermisos cePermisos);

    void edit(CePermisos cePermisos);

    void remove(CePermisos cePermisos);

    CePermisos find(Object id);

    List<CePermisos> findAll();

    List<CePermisos> findRange(int[] range);

    int count();
    
}
