package com.backend.onetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.onetomany.Models.Passenger;


@Repository
public interface PassengerRespository extends JpaRepository<Passenger,Long> {
    
}
