package com.example.atividade.atividade.service;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificador implements ObservadorEntrega {
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}