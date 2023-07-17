
package com.epsateneajava.epsateneajava.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medico {
    
    @Id
    private long tarjetaProfesional;
    private String nombre;
    private String apellido;
    private Number consultorio;
    private String email;

    @OneToMany(mappedBy = "medico")
    private List<Especialidad> especialidad;

    @ManyToOne
    @JoinColumn(name="cita_id")
    private Cita cita;

    public Medico(Cita cita) {
        this.cita = cita;
    }
    

    public Cita getCita() {
        return cita;
    }


    public void setCita(Cita cita) {
        this.cita = cita;
    }


    public Medico(long tarjetaProfesional, String nombre, String apellido, Number consultorio, String email,
            List<Especialidad> especialidad) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.email = email;
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public long getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(long tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
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

    public Number getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Number consultorio) {
        this.consultorio = consultorio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    
}

