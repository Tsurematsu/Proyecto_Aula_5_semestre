package com.example.backendlestguide.Controller;

import ch.qos.logback.core.net.server.Client;
import com.example.backendlestguide.Entidades.Cliente;
import com.example.backendlestguide.Entidades.Guia;
import com.example.backendlestguide.Entidades.Plan;
import com.example.backendlestguide.Entidades.Rutas;
import com.example.backendlestguide.Services.AdministradorServices;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    private final AdministradorServices administradorServices;

    @Autowired
    public AdministradorController(AdministradorServices administradorServices) {
        this.administradorServices = administradorServices;
    }

    @PostMapping("/crearRuta")
    public ResponseEntity<Rutas> crearRuta(Rutas rutas) {
        try {
            Rutas newRuta = administradorServices.crearRuta();
            return new ResponseEntity<>(newRuta, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear la ruta: " + ex.getMessage());
        }
    }

    @GetMapping("/obtenerRuta/{id}")
    public ResponseEntity<Rutas> obtenerRutaPorId(int id) {
        try {
            Rutas obtenerRuta = administradorServices.obtenerRutaPorId(id);
            return new ResponseEntity<>(obtenerRuta, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo obtener la ruta: " + ex.getMessage());
        }
    }

    @GetMapping("/obtenerTodasLasRutas")
    public ResponseEntity<List<Rutas>> obtenerTodasLasRutas() {
        try {
            List<Rutas> rutasList = administradorServices.obtenerTodasLasRutas();
            return new ResponseEntity<>(rutasList, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudieron obtener las rutas: " + ex.getMessage());
        }
    }

    @GetMapping("/eliminarRuta/{id}")
    public ResponseEntity<String> eliminarRuta(@PathVariable int id) {
        try {
            administradorServices.eliminarRuta(id);
            return new ResponseEntity<>("Ruta eliminada con éxito", HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo eliminar la ruta: " + ex.getMessage());
        }
    }


    @PutMapping("/actualizarRuta/{id}")
    public ResponseEntity<Rutas> actualizarRuta(@RequestBody Rutas rutas) {
        try {
            Rutas updatedRuta = administradorServices.actualizarRuta(rutas);
            return new ResponseEntity<>(updatedRuta, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo actualizar la ruta: " + ex.getMessage());
        }
    }


    @PostMapping("/crearGuia")
    public ResponseEntity<Guia> crearGuia(@RequestBody Guia guia) {
        try {
            Guia newGuia = administradorServices.crearGuia(guia);
            return new ResponseEntity<>(newGuia, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear la guía: " + ex.getMessage());
        }
    }


    @GetMapping("/obtenerGuia/{id}")
    public ResponseEntity<Guia> obtenerGuia(@PathVariable int id) {
        try {
            Guia obtenerGuia = administradorServices.obtenerGuiaPorId(id);
            return new ResponseEntity<>(obtenerGuia, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo obtener la guía: " + ex.getMessage());
        }
    }


    @GetMapping("/AlltoGuia")
    public ResponseEntity<List<Guia>> obtenerTodasLasGuias() {
        try {
            List<Guia> guiaList = administradorServices.obtenerTodasLasGuias();
            return new ResponseEntity<>(guiaList, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudieron obtener las guías: " + ex.getMessage());
        }
    }

    @GetMapping("/eliminarGuia/{id}")
    public ResponseEntity<String> eliminarGuia(@PathVariable int id) {
        try {
            administradorServices.eliminarGuia(id);
            return new ResponseEntity<>("Guía eliminada con éxito", HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo eliminar la guía: " + ex.getMessage());
        }
    }

    @PutMapping("/actualizarGuia/{id}")
    public ResponseEntity<Guia> actualizarGuia(@RequestBody Guia guia) {
        try {
            Guia updatedGuia = administradorServices.actualizarGuia(guia);
            return new ResponseEntity<>(updatedGuia, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo actualizar la guía: " + ex.getMessage());
        }
    }


    @GetMapping("/obtenerPlan/{id}")
    public ResponseEntity<Plan> obtenerPlan(@PathVariable int id) {
        try {
            Plan obtenerPlan = administradorServices.obtenerPlanPorId(id);
            return new ResponseEntity<>(obtenerPlan, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo obtener el plan: " + ex.getMessage());
        }
    }

    @GetMapping("/alltoPlanes")
    public ResponseEntity<List<Plan>> obtenerAlltoPlan() {
        try {
            List<Plan> planes = administradorServices.obtenerTodosLosPlanes();
            return new ResponseEntity<>(planes, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudieron obtener los planes: " + ex.getMessage());
        }
    }

    @GetMapping("/obtenerCliente{id}")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable int id) {
        try {
            Cliente cliente = administradorServices.obtenerClientePorId(id); // Supongamos que tienes un método para obtener un cliente por su ID
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo obtener el cliente: " + ex.getMessage());
        }
    }


    @GetMapping("/obtenerAllCliente")
    public ResponseEntity<List<Cliente>> obtenerAlltoCliente() {
        try {
            List<Cliente> cliente = administradorServices.obtenerTodosLosClientes();
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo obtener el registro total de Clientes: " + ex.getMessage());
        }
    }

}
