package com.example.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Float age;

    public Client(long l, String k, float v) {
        this.id=l;
        this.nom=k;
        this.age=v;
    }
}
