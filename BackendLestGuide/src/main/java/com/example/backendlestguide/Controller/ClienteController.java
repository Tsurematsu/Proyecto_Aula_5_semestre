package com.example.backendlestguide.Controller;

import com.example.backendlestguide.Entidades.Cliente;
import com.example.backendlestguide.Entidades.Plan;
import com.example.backendlestguide.Services.ClienteServices;
import com.example.backendlestguide.Services.PlanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteServices clienteServices;
    private final PlanServices planServices;

    @Autowired
    public ClienteController(ClienteServices clienteServices, PlanServices planServices) {
        this.clienteServices = clienteServices;
        this.planServices = planServices;
    }

    @PostMapping("/register")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente) {
        try {
            Cliente newCliente = clienteServices.crearCliente(cliente);
            return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear el cliente: " + ex.getMessage());
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable int id, @RequestBody Cliente cliente) {
        try {
            Cliente updatedCliente = clienteServices.actualizar(id, cliente);
            return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo actualizar el cliente: " + ex.getMessage());
        }
    }

    @PostMapping("/crearPlan")
    public ResponseEntity<Plan> armarPlan(@RequestBody Plan plan) {
        try {
            Plan newPlan = planServices.armarPlan(plan);
            return new ResponseEntity<>(newPlan, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear el plan: " + ex.getMessage());
        }
    }

}

