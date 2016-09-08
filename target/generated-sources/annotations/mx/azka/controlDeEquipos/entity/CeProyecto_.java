package mx.azka.controlDeEquipos.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.azka.controlDeEquipos.entity.CeEmpleado;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-08T08:51:47")
@StaticMetamodel(CeProyecto.class)
public class CeProyecto_ { 

    public static volatile SingularAttribute<CeProyecto, String> prodescripcion;
    public static volatile SingularAttribute<CeProyecto, BigDecimal> proidproyecto;
    public static volatile CollectionAttribute<CeProyecto, CeEmpleado> ceEmpleadoCollection;

}