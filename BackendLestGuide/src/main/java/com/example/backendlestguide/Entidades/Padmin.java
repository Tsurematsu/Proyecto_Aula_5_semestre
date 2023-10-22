package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "p_admin")
public class Padmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_padmin;
    String t_persona;
    int id_administrador;

    public Padmin() {
    }


    public String getT_persona() {
        return t_persona;
    }

    public void setT_persona(String t_persona) {
        this.t_persona = t_persona;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }
}
