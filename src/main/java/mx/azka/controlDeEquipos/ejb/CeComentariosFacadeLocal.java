
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CeComentarios;


@Local
public interface CeComentariosFacadeLocal {

    void create(CeComentarios ceComentarios);

    void edit(CeComentarios ceComentarios);

    void remove(CeComentarios ceComentarios);

    CeComentarios find(Object id);

    List<CeComentarios> findAll();

    List<CeComentarios> findRange(int[] range);

    int count();
    
}
