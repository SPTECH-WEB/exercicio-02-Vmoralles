package com.example.atividade.atividade.controller;

import com.example.atividade.atividade.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private FreteService freteService;

    @GetMapping
    public String processarEntrega(@RequestParam double peso, @RequestParam String modalidade) {
        double valor = freteService.calcularFrete(peso, modalidade);
        return "Entrega concluída. Valor do frete: R$ " + valor;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}