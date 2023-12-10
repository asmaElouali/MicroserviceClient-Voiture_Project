package com.example.voiture.service;

import com.example.voiture.entities.Voiture;
import com.example.voiture.repositorises.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService{

   @Autowired
   VoitureRepository voitureRepository;

   public Voiture enregistrerVoiture(Voiture voiture){
       return voitureRepository.save(voiture);
   }

}
