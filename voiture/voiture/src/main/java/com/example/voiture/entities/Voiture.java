package com.example.voiture.entities;

import com.example.voiture.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    @Column(name = "id_client")
    private Long idClient;
    @Transient
    @ManyToOne
    private Client client;

    public Voiture(Long id, String marque, String matricule, String model, Client client) {
        this.id = id;
        this.marque = marque;
        this.matricule = matricule;
        this.model = model;
        this.client = client;
    }

}
