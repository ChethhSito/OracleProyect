package com.stech.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "DIRECCIONES")
public class directions {
    
    @Id
    @Column(name = "direccion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private clients clienteId;
    @Column(name="direccion")
    private String direccion;
    @Column(name="ciudad")
    private String ciudad;
    @Column(name="departamento")
    private String departamento;
    @Column(name="codigo_postal")
    private String codigoPostal;
    @Column(name="tipo")
    private String tipo;


    public Long getId(){ return id;}
    public void setId(Long id){this.id = id; }

    public clients getClienteId(){ return clienteId; }
    public void setClienteId(clients clienteId){ this.clienteId = clienteId; }

    public String getDireccion(){ return direccion; }
    public void setDireccion(String direccion){ this.direccion = direccion; }

    public String getCiudad(){ return ciudad; }
    public void setCiudad(String ciudad){ this.ciudad = ciudad; }

    public String getDepartamento(){ return departamento; }
    public void setDepartamento(String departamento){ this.departamento = departamento; }

    public String getCodigoPostal(){ return codigoPostal; }
    public void setCodigoPostal(String codigoPostal){ this.codigoPostal = codigoPostal; }

    public String getTipo(){ return tipo; }
    public void setTipo(String tipo){ this.tipo = tipo;}


}
