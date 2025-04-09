package com.example.atividade.atividade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FreteService {

    @Autowired
    private Map<String, FreteStrategy> estrategias;

    @Autowired
    private List<ObservadorEntrega> notificadores;

    public double calcularFrete(double peso, String modalidade) {
        FreteStrategy estrategia = estrategias.get(modalidade.toLowerCase());
        if (estrategia == null) throw new IllegalArgumentException("Modalidade invalida");
        double valor = estrategia.calcularFrete(peso);
        notificadores.forEach(obs -> obs.notificar("Entrega feita com frete R$ " + valor));
        return valor;
    }
}