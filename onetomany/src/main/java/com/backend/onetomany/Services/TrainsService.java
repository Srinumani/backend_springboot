package com.backend.onetomany.Services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.onetomany.Models.Trains;
import com.backend.onetomany.Repository.TrainsRespository;

 @Service
public class TrainsService {

    @Autowired
    private TrainsRespository  tr;
     
    public Trains create(Trains trains){
       return tr.save(trains);
    }

    public List<Trains> readAll(){

        return tr.findAll();

    }

    public Optional<Trains> readbyid(Long id){
        return tr.findById(id);
    }


    public Trains updatebyId(Long id ,Trains trains) throws namenotFoundException{

         Optional<Trains> trainid=tr.findById(id);

         if(trainid.isPresent()){

            Trains data=trainid.get();

            data.setName(trains.getName());

            data.setRoot(trains.getRoot());

           return tr.save(data);


         }else{
             throw new namenotFoundException("Not Found");
         }
               
      
    

        
       

    }


    public void delteByid(Long id){
         tr.deleteById(id);

    }



    
}
