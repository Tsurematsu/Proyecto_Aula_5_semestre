package com.example.backendlestguide.Services;

import com.example.backendlestguide.Entidades.Guia;
import com.example.backendlestguide.Repositorios.GuiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class GuiaServices {

    private final GuiaRepository guiaRepository;

    @Autowired
    public GuiaServices(GuiaRepository guiaRepository) {
        this.guiaRepository = guiaRepository;
    }

    public Guia crearGuia(Guia guia) {
        return guiaRepository.save(guia);
    }

    public Guia actualizar(int id, Guia guia) {
        guia.setNumero_identidad(guia.getNumero_identidad());
        return guiaRepository.save(guia);
    }

}

