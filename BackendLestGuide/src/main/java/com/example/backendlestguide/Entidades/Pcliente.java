package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "p_cliente")
public class Pcliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pcliente;
    String t_persona;
    int id_cliente;

    public Pcliente() {
    }

    public String getT_persona() {
        return t_persona;
    }

    public void setT_persona(String t_persona) {
        this.t_persona = t_persona;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
