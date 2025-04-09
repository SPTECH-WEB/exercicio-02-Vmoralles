package com.example.atividade.atividade.service;

import com.example.atividade.atividade.adapter.APITransportadoraExterna;
import org.springframework.stereotype.Component;

@Component("terceirizada")
public class TransportadoraFrete implements FreteStrategy {
    private APITransportadoraExterna api = new APITransportadoraExterna();

    public double calcularFrete(double peso) {
        return api.calcularPreco(peso);
    }
}