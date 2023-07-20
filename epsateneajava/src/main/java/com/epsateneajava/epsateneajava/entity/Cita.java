
package com.epsateneajava.epsateneajava.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

    

    public Cita() {
    }



    public Cita(Long idCita, LocalDate fecha, Medico medico, Paciente paciente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
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



    public Medico getMedico() {
        return medico;
    }



    public void setMedico(Medico medico) {
        this.medico = medico;
    }



    public Paciente getPaciente() {
        return paciente;
    }



    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
}

