package com.rachel.servicios;

import com.rachel.modelos.Cancion;  
import com.rachel.repositorios.RepositorioCanciones;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  

import java.util.List;  

@Service  
public class ServicioCanciones {  

    @Autowired  
    private RepositorioCanciones repositorio;  


    public List<Cancion> obtenerTodasLasCanciones() {  
        return repositorio.findAll();  
    }  


    public Cancion obtenerCancionPorId(Long id) {  
        return repositorio.findById(id).orElse(null);  
    }  

   
    public Cancion agregarCancion(Cancion cancion) {
        return repositorio.save(cancion);
    }

  
    public Cancion actualizarCancion(Cancion cancion) {
        return repositorio.save(cancion);
    }
}