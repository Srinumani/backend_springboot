package com.backend.onetomany.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 

@Entity
public class Passenger {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Data
    // @NoArgsConstructor
    // @AllArgsConstructor
    private Long id;
    private String name;
    private String adresss;

    
    @ManyToOne 
    @JoinColumn(name="trains_id",nullable = false)
    private Trains trains;


    public Passenger() {
    }


    public Passenger(Long id, String name, String adresss, Trains trains) {
        this.id = id;
        this.name = name;
        this.adresss = adresss;
        this.trains = trains;
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



    public String getAdresss() {
        return adresss;
    }


    public void setAdresss(String adresss) {
        this.adresss = adresss;
    }


    public Trains getTrains() {
        return trains;
    }


    

    public void setTrains(Trains trains) {
        this.trains = trains;
    }

    

// getteers and setters




    
}
