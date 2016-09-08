package mx.azka.controlDeEquipos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeEquipos;
import mx.azka.controlDeEquipos.entity.Ceusuario;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-08T08:51:47")
@StaticMetamodel(CeComentarios.class)
public class CeComentarios_ { 

    public static volatile SingularAttribute<CeComentarios, Date> comfecha;
    public static volatile SingularAttribute<CeComentarios, BigDecimal> comid;
    public static volatile SingularAttribute<CeComentarios, CeEquipos> equid;
    public static volatile SingularAttribute<CeComentarios, Ceusuario> idusuarios;
    public static volatile SingularAttribute<CeComentarios, CeEmpleado> empidempleado;
    public static volatile SingularAttribute<CeComentarios, String> comcomentario;

}