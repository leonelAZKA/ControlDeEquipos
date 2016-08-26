
package mx.azka.controlDeEquipos.ejb;

import java.util.List;
import javax.ejb.Local;
import mx.azka.controlDeEquipos.entity.CeUsuario;


@Local
public interface CeUsuarioFacadeLocal {

    void create(CeUsuario ceUsuario);

    void edit(CeUsuario ceUsuario);

    void remove(CeUsuario ceUsuario);

    CeUsuario find(Object id);

    List<CeUsuario> findAll();

    List<CeUsuario> findRange(int[] range);

    int count();
    
}
