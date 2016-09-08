package mx.azka.controlDeEquipos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.azka.controlDeEquipos.entity.CeComentarios;
import mx.azka.controlDeEquipos.entity.CeEmpleado;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-08T08:51:47")
@StaticMetamodel(CeEquipos.class)
public class CeEquipos_ { 

    public static volatile SingularAttribute<CeEquipos, String> equadicional;
    public static volatile SingularAttribute<CeEquipos, Date> equfechaCompra;
    public static volatile SingularAttribute<CeEquipos, String> equdiscoDuro;
    public static volatile SingularAttribute<CeEquipos, String> equmemoria;
    public static volatile CollectionAttribute<CeEquipos, CeComentarios> ceComentariosCollection;
    public static volatile SingularAttribute<CeEquipos, String> equnsc;
    public static volatile SingularAttribute<CeEquipos, String> equnse;
    public static volatile SingularAttribute<CeEquipos, Date> equfechaFin;
    public static volatile SingularAttribute<CeEquipos, BigDecimal> equid;
    public static volatile SingularAttribute<CeEquipos, String> equmodelo;
    public static volatile SingularAttribute<CeEquipos, String> equmarcae;
    public static volatile SingularAttribute<CeEquipos, CeEmpleado> ceempleadoEmpidempleado;
    public static volatile SingularAttribute<CeEquipos, String> equmarcac;
    public static volatile SingularAttribute<CeEquipos, Date> equfechaInicio;

}