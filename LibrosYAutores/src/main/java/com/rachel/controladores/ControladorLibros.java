package com.rachel.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLibros {
	private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}

@GetMapping("/libros")
public String obtenerTodosLosLibros(Model model) {  
    List<String> librosList = new ArrayList<>();
    
    for (String libro : listaLibros.keySet()) { 
        librosList.add(libro);  // Solo agrega el título del libro
    }  
    
    model.addAttribute("listaLibros", librosList);   
    return "libros.jsp";  
}

@GetMapping("/libros/{nombre}")  
public String obtenerInformacionDelLibro(@PathVariable String nombre, Model model) {  
    if (listaLibros.containsKey(nombre)) {  
        String autor = listaLibros.get(nombre);   

        model.addAttribute("titulo", nombre);  
        model.addAttribute("autor", autor);  
        
        return "detalleLibro.jsp";  
    } else {  
        model.addAttribute("mensaje", "El libro no se encuentra en nuestra lista.");  
        return "detalleLibro.jsp";  
    }  
} 

@GetMapping("/libros/formulario")
public String formularioLibro(Model model) {
	return "formularioLibros.jsp";
}

@PostMapping("/procesa/libro")
public String guardarLibro(@RequestParam String titulo, @RequestParam String autor, Model model){
	listaLibros.put(titulo, autor);
	return "redirect:/libros";

}

}
