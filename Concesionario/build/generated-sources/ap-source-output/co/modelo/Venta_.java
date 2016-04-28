package co.modelo;

import co.modelo.Auto;
import co.modelo.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T15:05:35")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, Auto> auto;
    public static volatile SingularAttribute<Venta, Long> id;

}