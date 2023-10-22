package com.example.backendlestguide.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_plan;
    @Min(value = 1, message = "El ID del plan no puede ser menor que 1")
    private int id_cliente;


    @Min(value = 1, message = "El ID de las rutas no puede ser menor que 1")
    private int id_rutas;

    @Min(value = 1, message = "La cantidad de clientes no puede ser menor que 1")
    private int cantidad_clientes;


    @NotBlank(message = "El método de pago no puede estar en blanco")
    private String metodo_pago;

    @DecimalMin(value = "0.01", message = "El precio debe ser mayor o igual a 0.01")
    private double precio;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "La fecha debe tener el formato 'yyyy-MM-dd'")
    private String fecha;

    @Pattern(regexp = "^\\d{2}:\\d{2}$", message = "La hora debe tener el formato 'HH:mm'")
    private String hora;


    public Plan() {
    }
    public int getId_rutas() {
        return id_rutas;
    }

    public void setId_rutas(int id_rutas) {
        this.id_rutas = id_rutas;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCantidad_clientes() {
        return cantidad_clientes;
    }

    public void setCantidad_clientes(int cantidad_clientes) {
        this.cantidad_clientes = cantidad_clientes;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
