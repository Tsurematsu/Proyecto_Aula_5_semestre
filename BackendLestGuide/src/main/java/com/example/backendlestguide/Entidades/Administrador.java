package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_administrador;

    @Email(message = "El correo del administrador debe ser un correo válido")
    @NotBlank(message = "El correo del administrador no puede estar en blanco")
    private String correo_admi;

    @Size(min = 8, message = "La contraseña del administrador debe tener al menos 8 caracteres")
    private String contrasenha_admi;

    // Constructor sin argumentos
    public Administrador() {
    }

    public String getCorreo_admi() {
        return correo_admi;
    }

    public void setCorreo_admi(String correo_admi) {
        this.correo_admi = correo_admi;
    }

    public String getContrasenha_admi() {
        return contrasenha_admi;
    }

    public void setContrasenha_admi(String contrasenha_admi) {
        this.contrasenha_admi = contrasenha_admi;
    }
}