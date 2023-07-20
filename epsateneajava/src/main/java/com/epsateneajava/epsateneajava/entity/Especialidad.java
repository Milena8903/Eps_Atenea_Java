package com.epsateneajava.epsateneajava.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;
    private String nombre;
    
    
    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medico;


    public Especialidad() {
    }


    public Especialidad(Long idEspecialidad, String nombre, List<Medico> medico) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.medico = medico;
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


    public List<Medico> getMedico() {
        return medico;
    }


    public void setMedico(List<Medico> medico) {
        this.medico = medico;
    }
 
    

}