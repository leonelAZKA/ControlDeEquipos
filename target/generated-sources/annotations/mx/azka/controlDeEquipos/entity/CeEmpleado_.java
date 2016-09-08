package mx.azka.controlDeEquipos.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.azka.controlDeEquipos.entity.CeComentarios;
import mx.azka.controlDeEquipos.entity.CeEquipos;
import mx.azka.controlDeEquipos.entity.CeProyecto;
import mx.azka.controlDeEquipos.entity.Ceusuario;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-08T08:51:47")
@StaticMetamodel(CeEmpleado.class)
public class CeEmpleado_ { 

    public static volatile CollectionAttribute<CeEmpleado, CeComentarios> ceComentariosCollection;
    public static volatile SingularAttribute<CeEmpleado, String> empappMaterno;
    public static volatile CollectionAttribute<CeEmpleado, CeEquipos> ceEquiposCollection;
    public static volatile SingularAttribute<CeEmpleado, BigDecimal> empidempleado;
    public static volatile SingularAttribute<CeEmpleado, CeProyecto> empidproyecto;
    public static volatile CollectionAttribute<CeEmpleado, Ceusuario> ceusuarioCollection;
    public static volatile SingularAttribute<CeEmpleado, String> empappPaterno;
    public static volatile SingularAttribute<CeEmpleado, String> empnombre;

}