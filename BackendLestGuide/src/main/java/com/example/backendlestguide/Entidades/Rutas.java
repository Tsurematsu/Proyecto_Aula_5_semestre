package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "n_rutas")
public class Rutas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rutas;

    @NotNull
    private String Descripcion;

    @Min(value = 1, message = "El ID del cliente no puede ser menor que 1")
    private int id_cliente;

    public Rutas() {
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
