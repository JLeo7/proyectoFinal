package com.softwareCelestial.cl;

import java.time.LocalDate;
import java.time.LocalTime;

public class Instalacion {

    private String id;
    private LocalDate fecha;
    private LocalTime hora;
    private String estado;
    private Tarea tareas;


    public Instalacion(){

    }

    public Instalacion(String id, LocalDate fecha, LocalTime hora, String estado, Tarea tareas) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.tareas = tareas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Tarea getTareas() {
        return tareas;
    }

    public void setTareas(Tarea tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Instalacion{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", estado='" + estado + '\'' +
                ", tareas=" + tareas +
                '}';
    }
}
