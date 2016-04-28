package co.modelo;

import co.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T15:05:35")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> Nombre;
    public static volatile SingularAttribute<Cliente, Integer> Edad;
    public static volatile ListAttribute<Cliente, Venta> venta;
    public static volatile SingularAttribute<Cliente, String> Telefono;
    public static volatile SingularAttribute<Cliente, String> Apellido;
    public static volatile SingularAttribute<Cliente, String> Direccion;
    public static volatile SingularAttribute<Cliente, Long> id;

}