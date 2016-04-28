//
// This file was generated by the JPA Modeler
//
package co.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Cliente implements Serializable {

    @Column(name = "Nombre", nullable = false)
    @Basic
    private String Nombre;

    @Column(name = "Edad", nullable = false)
    @Basic
    private int Edad;

    @OneToMany(targetEntity = Venta.class, mappedBy = "cliente")
    private List<Venta> venta;

    @Column(name = "Telefono", nullable = false)
    @Basic
    private String Telefono;

    @Column(name = "Apellido", nullable = false)
    @Basic
    private String Apellido;

    @Column(name = "Direccion", nullable = false)
    @Basic
    private String Direccion;

    @Column(name = "id", unique = true, nullable = false)
    @Id
    private Long id;

    public Cliente() {

    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return this.Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public List<Venta> getVenta() {
        return this.venta;
    }

    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", id=" + id + '}';
    }

  
    
    
}