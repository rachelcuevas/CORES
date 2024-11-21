package com.rachel.repositorios;  

import com.rachel.modelos.Cancion;  
import org.springframework.stereotype.Repository;  
import org.springframework.data.jpa.repository.JpaRepository;  

@Repository  
public interface RepositorioCanciones extends JpaRepository<Cancion, Long> {  
   
}