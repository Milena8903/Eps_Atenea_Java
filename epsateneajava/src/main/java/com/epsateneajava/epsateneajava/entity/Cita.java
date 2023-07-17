
package com.epsateneajava.epsateneajava.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cita {
    
    @Id
    private Long idCita;
    private LocalDate fecha;

  //  @OneToMany(mappedBy = "paciente")
 //   private List<Paciente> paciente;

 //   @OneToMany(mappedBy = "cita")
 //   private List<Medico> medico;

    public Cita(Long idCita, LocalDate fecha) {
        this.idCita = idCita;
        this.fecha = fecha;
    //    this.paciente = paciente;
    //    this.medico = medico;
    //List<Paciente> paciente, List<Medico> medico
    }

    public Cita() {
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
/* 
    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    public List<Medico> getMedico() {
        return medico;
    }

    public void setMedico(List<Medico> medico) {
        this.medico = medico;
    }

   */ 
}

