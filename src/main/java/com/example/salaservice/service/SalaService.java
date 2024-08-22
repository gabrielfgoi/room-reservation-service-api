package com.example.salaservice.service;

import com.example.salaservice.model.Sala;
import com.example.salaservice.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> listarSalas() {
        return salaRepository.findAll();
    }

    public Optional<Sala> encontrarSalaPorId(Long id) {
        return salaRepository.findById(id);
    }

    public Sala salvarSala(Sala sala) {
        return salaRepository.save(sala);
    }

    public Sala atualizarSala(Long id, Sala sala) {
        if (salaRepository.existsById(id)) {
            sala.setId(id);
            return salaRepository.save(sala);
        }
        return sala;
    }
    public void deletarSala(Long id) {
        salaRepository.deleteById(id);
    }
}
