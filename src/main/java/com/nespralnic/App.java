package com.nespralnic;

import com.nespralnic.service.NotasService;

public class App {

    public static void main(String[] args) {
        
        NotasService notasService = new NotasService();
        notasService.showNotas();
    
    }
}
