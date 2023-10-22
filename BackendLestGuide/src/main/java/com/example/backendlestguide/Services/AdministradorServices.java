package com.example.backendlestguide.Services;

import com.example.backendlestguide.Entidades.Cliente;
import com.example.backendlestguide.Entidades.Guia;
import com.example.backendlestguide.Entidades.Plan;
import com.example.backendlestguide.Entidades.Rutas;
import com.example.backendlestguide.Repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class AdministradorServices {

    private final AdministradorRepository administradorRepository;
    private final RutasRepository rutasServices;
    private final GuiaRepository guiaServices;
    private final PlanRepository planServices;
    private final ClienteRepository clienteServices;


    @Autowired
    public AdministradorServices(AdministradorRepository administradorRepository, RutasRepository rutasServices, GuiaRepository guiaServices, PlanRepository planServices, ClienteRepository clienteServices) {
        this.administradorRepository = administradorRepository;
        this.rutasServices = rutasServices;
        this.guiaServices = guiaServices;
        this.planServices = planServices;
        this.clienteServices = clienteServices;
    }


    //SESION ADMINISTRADOR - RUTAS
    public Rutas crearRuta() {
        try {
            Rutas nuevaRuta = new Rutas();
            return rutasServices.save(nuevaRuta);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear la ruta: " + ex.getMessage());
        }
    }


    public void eliminarRuta(int id) {
        try {
            rutasServices.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo eliminar la ruta: " + e.getMessage());
        }
    }


    public Rutas obtenerRutaPorId(int id) {
        return rutasServices.findById(id).orElseThrow(() -> new RuntimeException("No se pudo obtener la ruta"));
    }

    public List<Rutas> obtenerTodasLasRutas() {
        List<Rutas> rutasList = rutasServices.findAll();
        if (rutasList.isEmpty()) {
            throw new RuntimeException("No se pudo obtener el listado de rutas");
        }
        return rutasList;
    }

    public Rutas actualizarRuta(Rutas rutas) {
        try {
            return rutasServices.save(rutas);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo actualizar la ruta: " + e.getMessage());
        }
    }

    //SESION ADMINISTRADOR - GUIAS
    public Guia crearGuia(Guia guia) {
        try {
            return guiaServices.save(new Guia());
        } catch (Exception e) {
            throw new RuntimeException("No se pudo crear la guía: " + e.getMessage());
        }
    }

    public Guia obtenerGuiaPorId(int id) {
        return guiaServices.findById(id).orElseThrow(() -> new RuntimeException("No se pudo obtener la guía"));
    }

    public void eliminarGuia(int id) {
        try {
            guiaServices.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new RuntimeException("No se pudo encontrar la guía con ID: " + id);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error al eliminar la guía: " + e.getMessage());
        }
    }

    public List<Guia> obtenerTodasLasGuias() {
        List<Guia> guiasList = guiaServices.findAll();
        if (guiasList.isEmpty()) {
            throw new RuntimeException("No se pudo obtener el listado de las guías");
        }
        return guiasList;
    }

    public Guia actualizarGuia(Guia guia) {
        try {
            return guiaServices.save(guia);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo actualizar la guía: " + e.getMessage());
        }
    }

    //SESION ADMINISTRADOR - PLANES

    public Plan obtenerPlanPorId(int id) {
        return planServices.findById(id).orElseThrow(() -> new RuntimeException("No se pudo obtener el plan"));
    }

    public List<Plan> obtenerTodosLosPlanes() {
        List<Plan> planesList = planServices.findAll();
        if (planesList.isEmpty()) {
            throw new RuntimeException("No se pudo obtener el listado de los planes");
        }
        return planesList;
    }

    //SESION ADMINISTRADOR - CLIENTES
    public Cliente obtenerClientePorId(int id) {
        return clienteServices.findById(id).orElseThrow(() -> new RuntimeException("No se pudo obtener el cliente"));
    }

    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientesList = clienteServices.findAll();

        if (clientesList.isEmpty()) {
            throw new RuntimeException("No se pudo obtener el listado de los clientes");
        }
        return clientesList;
    }

}
