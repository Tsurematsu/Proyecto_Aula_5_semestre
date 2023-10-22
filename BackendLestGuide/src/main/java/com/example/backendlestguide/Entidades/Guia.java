package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "guia")
public class Guia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_guia;

    @NotNull
    @Size(min = 1, max = 255)
    private String numero_identidad;

    @NotNull
    @Size(min = 1, max = 255)
    private String nombre_guia;

    @NotNull
    @Size(min = 1, max = 255)
    private String localidad;

    @NotNull
    private int edad;

    @NotNull
    @Size(min = 1, max = 255)
    private String cuenta_bancaria_guia;

    @NotNull
    @Email
    @Size(min = 1, max = 255)
    private String correo_guia;

    @NotNull
    @Size(min = 1, max = 255)
    private String contrasenha_guia;


    public Guia() {
    }
    public String getNumero_identidad() {
        return numero_identidad;
    }

    public void setNumero_identidad(String numero_identidad) {
        this.numero_identidad = numero_identidad;
    }

    public String getNombre_guia() {
        return nombre_guia;
    }

    public void setNombre_guia(String nombre_guia) {
        this.nombre_guia = nombre_guia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCuenta_bancaria_guia() {
        return cuenta_bancaria_guia;
    }

    public void setCuenta_bancaria_guia(String cuenta_bancaria_guia) {
        this.cuenta_bancaria_guia = cuenta_bancaria_guia;
    }

    public String getCorreo_guia() {
        return correo_guia;
    }

    public void setCorreo_guia(String correo_guia) {
        this.correo_guia = correo_guia;
    }

    public String getContrasenha_guia() {
        return contrasenha_guia;
    }

    public void setContrasenha_guia(String contrasenha_guia) {
        this.contrasenha_guia = contrasenha_guia;
    }
}
