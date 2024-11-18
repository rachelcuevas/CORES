package com.Rachel.Controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorPeliculas {
	
private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();
	
	public ControladorPeliculas() {
		listaPeliculas.put("Winnie the Pooh", "Don Hall");	
		listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
		listaPeliculas.put("Tarzán", "Kevin Lima");		
		listaPeliculas.put("Mulán", "Barry Cook");
		listaPeliculas.put("Oliver", "Kevin Lima");	
		listaPeliculas.put("Big Hero 6", "Don Hall");	
	}
	
	@GetMapping("/pelicula")  
	public String obtenerTodasLasPeliculas() {  
	    StringBuilder str = new StringBuilder(); 
	    for (String pelicula : listaPeliculas.keySet()) {  
	        str.append(pelicula).append(" - ")  
	           .append(listaPeliculas.get(pelicula))
	           .append("\n"); 
	    }  
	    return str.toString();  
	}
	
	@GetMapping("/peliculas/{nombre}")
	public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
		String director = listaPeliculas.get(nombre); 
		if(listaPeliculas.containsKey(nombre)) {
			return "La pelicula " + nombre + " -" + director + " esta disponible.";
		} else {
			return "La película no se encuentra en nuestra lista.";
		}
	}
	
	@GetMapping("/peliculas/director/{nombre}")  
	public String obtenerPeliculasPorDirector(@PathVariable String nombre) {  
	    StringBuilder peliculas = new StringBuilder();  
	    boolean hayPeliculas = false;  
	    
	    for (String pelicula : listaPeliculas.keySet()) {  
	        if (listaPeliculas.get(pelicula).equalsIgnoreCase(nombre)) {  
	            peliculas.append(pelicula).append("\n"); 
	            hayPeliculas = true; //  
	        }  
	    }  

	    if (hayPeliculas) {  
	        return "El director " + nombre + " tiene las siguientes películas:\n" + peliculas.toString();  
	    } else {  
	        return "No contamos con películas con ese director en nuestra lista.";  
	    }  
	}  
	
}
