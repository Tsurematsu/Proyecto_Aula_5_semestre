package com.example.backendlestguide.Services;

import com.example.backendlestguide.Entidades.Cliente;
import com.example.backendlestguide.Entidades.Plan;
import com.example.backendlestguide.Repositorios.ClienteRepository;
import com.example.backendlestguide.Repositorios.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class ClienteServices {

    private final ClienteRepository clienteRepository;
    private final PlanRepository planRepository;

    @Autowired
    public ClienteServices(ClienteRepository clienteRepository, PlanRepository planRepository) {
        this.clienteRepository = clienteRepository;
        this.planRepository = planRepository;
    }

    public Cliente crearCliente(Cliente cliente) {
        try {
            return clienteRepository.save(cliente);
        } catch (DataAccessException ex) {
            throw new RuntimeException("No se pudo crear el cliente: " + ex.getMessage(), ex);
        }
    }

    public Cliente actualizar(int id, Cliente cliente) {
        try {
            cliente.setNumero_identidad_cliente(cliente.getNumero_identidad_cliente());
            return clienteRepository.save(cliente);
        } catch (DataAccessException ex) {
            throw new RuntimeException("No se pudo actualizar el cliente: " + ex.getMessage(), ex);
        }
    }

    public Plan armarPlan(Plan plan) {
        try {
            Plan nuevoPlan = planRepository.save(plan);
            Cliente cliente = new Cliente();
            return nuevoPlan;
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo armar el plan: " + ex.getMessage());
        }
    }

}

