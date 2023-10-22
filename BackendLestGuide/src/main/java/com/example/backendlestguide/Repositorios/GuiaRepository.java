package com.example.backendlestguide.Repositorios;

import com.example.backendlestguide.Entidades.Guia;
import org.springframework.stereotype.Repository;

@Repository
public interface GuiaRepository extends GenericRepository<Guia, Integer> {
}
