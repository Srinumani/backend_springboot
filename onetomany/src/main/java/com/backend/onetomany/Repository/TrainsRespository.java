package com.backend.onetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import com.backend.onetomany.Models.Passenger;
import com.backend.onetomany.Models.Trains;
// import java.util.List;


@Repository
public interface TrainsRespository  extends JpaRepository<Trains,Long>{


    // save saveall update dete updateid 

    // List<Passenger> findById_trainsID(Long id);
    
}
