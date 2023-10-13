package com.biblioteca.api.services;

import com.biblioteca.api.model.RevistaModel;
import com.biblioteca.api.repository.RevistaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RevistaService {

     @Autowired
    RevistaRepository revistaRepository;

     @Transactional
     public RevistaModel save(RevistaModel revistaModel){
         return revistaRepository.save(revistaModel);
     }
     public List<RevistaModel> listar(){
         return revistaRepository.findAll();
     }

     public Optional<RevistaModel> ListOne(UUID id){
         return revistaRepository.findById(id);
     }

     public void delete(RevistaModel revistaModel){
         revistaRepository.delete(revistaModel);
     }
}
