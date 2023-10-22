package com.example.backendlestguide.Controller;

import com.example.backendlestguide.Entidades.Guia;
import com.example.backendlestguide.Services.GuiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guia")
public class GuiaController {

    private final GuiaServices guiaServices;

    @Autowired
    public GuiaController(GuiaServices guiaServices) {
        this.guiaServices = guiaServices;
    }

    @PostMapping("/crear")
    public ResponseEntity<Guia> crearGuia(@RequestBody Guia guia) {
        try {
            Guia newGuia = guiaServices.crearGuia(guia);
            return new ResponseEntity<>(newGuia, HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo crear la guía: " + ex.getMessage());
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Guia> actualizarGuia(@PathVariable int id, @RequestBody Guia guia) {
        try {
            Guia updateGuia = guiaServices.actualizar(id, guia);
            return new ResponseEntity<>(updateGuia, HttpStatus.OK);
        } catch (Exception ex) {
            throw new RuntimeException("No se pudo actualizar la guía: " + ex.getMessage());
        }
    }

}
