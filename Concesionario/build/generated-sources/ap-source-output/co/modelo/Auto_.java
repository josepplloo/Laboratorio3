package co.modelo;

import co.modelo.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T15:05:35")
@StaticMetamodel(Auto.class)
public class Auto_ { 

    public static volatile SingularAttribute<Auto, Date> fechaIngreso;
    public static volatile SingularAttribute<Auto, Integer> potencia;
    public static volatile SingularAttribute<Auto, Integer> cilindraje;
    public static volatile SingularAttribute<Auto, Venta> venta;
    public static volatile SingularAttribute<Auto, Integer> Modelo;
    public static volatile SingularAttribute<Auto, String> transmision;
    public static volatile SingularAttribute<Auto, String> matricula;
    public static volatile SingularAttribute<Auto, String> fabricante;

}