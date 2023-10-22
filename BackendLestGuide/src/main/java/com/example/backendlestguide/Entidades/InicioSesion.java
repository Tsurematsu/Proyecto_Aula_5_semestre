package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "inicio_sesion")
public class InicioSesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sesion;
    String correo;
    String contrasenha;
    String tipo_persona;

    public InicioSesion() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }
}
