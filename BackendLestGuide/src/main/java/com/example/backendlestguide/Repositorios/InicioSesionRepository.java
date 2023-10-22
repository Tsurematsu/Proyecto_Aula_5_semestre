package com.example.backendlestguide.Repositorios;

import com.example.backendlestguide.Entidades.Administrador;
import org.springframework.stereotype.Repository;

@Repository
public interface InicioSesionRepository extends GenericRepository<Administrador, Integer> {
}
