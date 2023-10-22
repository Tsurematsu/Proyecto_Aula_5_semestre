package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "p_guia")
public class Pguia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pguia;
    String t_persona;
    int id_guia;


    public Pguia() {
    }

    public String getT_persona() {
        return t_persona;
    }

    public void setT_persona(String t_persona) {
        this.t_persona = t_persona;
    }

    public int getId_guia() {
        return id_guia;
    }

    public void setId_guia(int id_guia) {
        this.id_guia = id_guia;
    }
}
