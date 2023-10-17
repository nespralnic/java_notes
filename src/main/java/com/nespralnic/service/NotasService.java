package com.nespralnic.service;

import java.util.List;

import com.nespralnic.entity.Nota;
import com.nespralnic.repository.NotasRepository;

public class NotasService {
    
    NotasRepository notasRepository = new NotasRepository();

    public void showNotas(){
        List<Nota> notas = notasRepository.getNotas();
        
        notas.forEach(n -> {
            System.out.println(n.getTitle());
            System.out.println(n.getBody());
        });
        
    }
}
