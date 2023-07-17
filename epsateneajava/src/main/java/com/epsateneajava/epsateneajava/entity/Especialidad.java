package com.epsateneajava.epsateneajava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;
    private String nombre;
    
    
    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;
    
    
    
    public Especialidad(Long idEspecialidad, String nombre, Medico medico) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.medico = medico;
    }


    public Especialidad() {
    }


    public Long getIdEspecialidad() {
        return idEspecialidad;
    }


    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/*
    public Medico getMedico() {
        return medico;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    */
}