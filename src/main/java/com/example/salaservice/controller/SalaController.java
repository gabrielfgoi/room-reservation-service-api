package com.example.salaservice.controller;

import com.example.salaservice.model.Sala;
import com.example.salaservice.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> listarSalas() {
        return salaService.listarSalas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sala> encontrarSalaPorId(@PathVariable Long id) {
        Optional<Sala> sala = salaService.encontrarSalaPorId(id);
        return sala.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Sala> salvarSala(@RequestBody Sala sala) {
        Sala novaSala = salaService.salvarSala(sala);
        return new ResponseEntity<>(novaSala, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizarSala(@PathVariable Long id, @RequestBody Sala sala) {
        Sala salaAtualizada = salaService.atualizarSala(id, sala);
        return new ResponseEntity<>(salaAtualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSala(@PathVariable Long id) {
        salaService.deletarSala(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
