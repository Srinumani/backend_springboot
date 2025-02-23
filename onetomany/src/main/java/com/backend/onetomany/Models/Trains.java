package com.backend.onetomany.Models;

 
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trains {

     @Id // primary key
     @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Long id;
    private String name;
    private String root;

    @OneToMany(mappedBy = "trains",cascade = CascadeType.ALL)

    private List<Passenger> passengers;

    public Trains(String name, String root) {
        
        this.name = name;
        this.root = root;
    }

    public Trains() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }


    
}
