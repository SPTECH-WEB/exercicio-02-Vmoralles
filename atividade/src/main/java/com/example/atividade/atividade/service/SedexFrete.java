package com.example.atividade.atividade.service;

import org.springframework.stereotype.Component;

@Component("expressa")
public class SedexFrete implements FreteStrategy {
    public double calcularFrete(double peso) {
        return peso * 10.0;
    }
}