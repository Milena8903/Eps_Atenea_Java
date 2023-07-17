
package com.epsateneajava.epsateneajava.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Paciente {
    @Id
    private Long cedula; 
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Number telefono;
    
    @ManyToOne
    @JoinColumn(name="cita_id")
    private Cita cita;

    public Paciente(Cita cita) {
        this.cita = cita;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Paciente(Long cedula, String nombre, String apellido, LocalDate fechaNacimiento, Number telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Paciente() {
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Number getTelefono() {
        return telefono;
    }

    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }

    
    
}

