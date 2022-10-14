/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Fran
 */
@Entity
@Table(name = "Clientes")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClienteid", query = "SELECT c FROM Cliente c WHERE c.clienteid = :clienteid"),
    @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cliente.findByApellido", query = "SELECT c FROM Cliente c WHERE c.apellido = :apellido")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "clienteid")
    private Integer clienteid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "apellido")
    private String apellido;

    public Cliente() {
    }

    public Cliente(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public Cliente(Integer clienteid, String nombre, String apellido) {
        this.clienteid = clienteid;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteid != null ? clienteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clienteid == null && other.clienteid != null) || (this.clienteid != null && !this.clienteid.equals(other.clienteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "root.entities.Cliente[ clienteid=" + clienteid + " ]";
    }
    
}
