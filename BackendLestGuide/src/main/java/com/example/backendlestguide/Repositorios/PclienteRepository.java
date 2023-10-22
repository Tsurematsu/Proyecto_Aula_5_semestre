package com.example.backendlestguide.Repositorios;

import com.example.backendlestguide.Entidades.Pcliente;
import org.springframework.stereotype.Repository;

@Repository
public interface PclienteRepository extends GenericRepository <Pcliente, Integer> {

    }
