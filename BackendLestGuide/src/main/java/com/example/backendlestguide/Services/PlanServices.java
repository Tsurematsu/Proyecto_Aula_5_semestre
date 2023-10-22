package com.example.backendlestguide.Services;

import com.example.backendlestguide.Entidades.Plan;
import com.example.backendlestguide.Repositorios.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PlanServices {

    private final PlanRepository planRepository;

    @Autowired
    public PlanServices(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public Plan armarPlan(Plan plan) {
        return planRepository.save(plan);
    }

}
