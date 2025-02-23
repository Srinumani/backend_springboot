package com.backend.onetomany.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.onetomany.Models.Trains;
import com.backend.onetomany.Services.TrainsService;
import com.backend.onetomany.Services.namenotFoundException;

@RestController

 
public class TrainsController {

    @Autowired
    private TrainsService ts;

   //localhost:8080/api/trains
    @PostMapping("/trains")
    public ResponseEntity<Trains> saveTraindata(@RequestBody Trains trains){
            return new ResponseEntity<>(ts.create(trains),HttpStatus.CREATED);

    }

    @GetMapping("/trains")
    public ResponseEntity<List<Trains>>  gettAllTrains(){
        return new ResponseEntity<>(ts.readAll(),HttpStatus.OK);

    }

    //localhost:8080/api/trains/1
    @GetMapping("/trains/{id}")
    public ResponseEntity <Trains> getAllTrainsById(@PathVariable Long id){

        Optional<Trains> trainid=ts.readbyid(id);

        if(trainid.isPresent()){

            return new ResponseEntity<>(trainid.get(),HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


//update
//localhost:8080/api/trains/1
   @PutMapping("/trains/{id}")
    public ResponseEntity<Trains> updateById(@PathVariable Long id,@RequestBody Trains trains) throws namenotFoundException{
        return new ResponseEntity<>(ts.updatebyId(id, trains),HttpStatus.OK);
    }

    
    @DeleteMapping("/trains/{id}")
    public ResponseEntity <Trains> deleteById(@PathVariable Long id){

        ts.delteByid(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }
    
}
