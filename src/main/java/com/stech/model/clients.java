package com.stech.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "CLIENTES")
public class clients {
    
    @Id
    @Column(name = "cliente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre_completo")
    private String nombreCompleto;
    @Column(name="dni")
    private String dni;
    @Column(name="correo_electronico")
    private String correoElectronico;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fecha_registro")
    private Date fechaRegistro;
    @Column(name="estado")
    private String estado;

    public Long getId() {return id;}
    public void setId(Long id){this.id = id; }

    public String getNombreCompleto(){return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto){ this.nombreCompleto = nombreCompleto;}

    public String getDni(){return dni;}
    public void setDni(String dni){ this.dni=dni;}

    public String getCorreoElectronico(){return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico){ this.correoElectronico=correoElectronico;}

    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){ this.telefono=telefono;}

    public Date getFechaRegistro(){return fechaRegistro;}
    public void setFechaRegistro(Date fechaRegistro){ this.fechaRegistro=fechaRegistro; }

    public String getEstado(){return estado;}
    public void setEstado(String estado){ this.estado=estado;}
}
