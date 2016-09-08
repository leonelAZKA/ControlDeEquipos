package mx.azka.controlDeEquipos.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.azka.controlDeEquipos.entity.CeComentarios;
import mx.azka.controlDeEquipos.entity.CeEmpleado;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-08T08:51:47")
@StaticMetamodel(Ceusuario.class)
public class Ceusuario_ { 

    public static volatile CollectionAttribute<Ceusuario, CeComentarios> ceComentariosCollection;
    public static volatile SingularAttribute<Ceusuario, BigDecimal> idusuarios;
    public static volatile SingularAttribute<Ceusuario, String> usudepartamento;
    public static volatile SingularAttribute<Ceusuario, String> usuusername;
    public static volatile SingularAttribute<Ceusuario, CeEmpleado> ceempleadoEmpidempleado;
    public static volatile SingularAttribute<Ceusuario, String> usupassword;

}