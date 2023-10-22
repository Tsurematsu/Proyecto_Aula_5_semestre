package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @NotBlank(message = "El nombre del cliente no puede estar en blanco")
    private String nombre_cliente;

    @NotBlank(message = "El número de identidad del cliente no puede estar en blanco")
    private String numero_identidad_cliente;

    @NotBlank(message = "El número de teléfono no puede estar en blanco")
    private String telefono;

    @Pattern(regexp = "^[0-9]+$", message = "La edad del cliente debe contener solo números")
    private String edad_cliente;

    @NotBlank(message = "La cuenta bancaria del cliente no puede estar en blanco")
    private String cuenta_bancaria_cliente;

    @NotBlank(message = "El correo del cliente no puede estar en blanco")
    @Email(message = "El correo del cliente debe ser una dirección de correo válida")
    private String correo_cliente;

    @Size(min = 8, message = "La contraseña del cliente debe tener al menos 8 caracteres")
    private String contrasenha_cliente;

    public Cliente() {

    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNumero_identidad_cliente() {
        return numero_identidad_cliente;
    }

    public void setNumero_identidad_cliente(String numero_identidad_cliente) {
        this.numero_identidad_cliente = numero_identidad_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad_cliente() {
        return edad_cliente;
    }

    public void setEdad_cliente(String edad_cliente) {
        this.edad_cliente = edad_cliente;
    }

    public String getCuenta_bancaria_cliente() {
        return cuenta_bancaria_cliente;
    }

    public void setCuenta_bancaria_cliente(String cuenta_bancaria_cliente) {
        this.cuenta_bancaria_cliente = cuenta_bancaria_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getContrasenha_cliente() {
        return contrasenha_cliente;
    }

    public void setContrasenha_cliente(String contrasenha_cliente) {
        this.contrasenha_cliente = contrasenha_cliente;
    }
}
