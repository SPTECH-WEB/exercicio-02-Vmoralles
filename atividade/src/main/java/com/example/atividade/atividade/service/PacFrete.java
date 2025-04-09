package com.example.atividade.atividade.service;

import org.springframework.stereotype.Component;

@Component("economica")
public class PacFrete implements FreteStrategy {
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
