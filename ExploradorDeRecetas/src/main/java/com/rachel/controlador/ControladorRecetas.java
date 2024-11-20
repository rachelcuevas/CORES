package com.rachel.controlador;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;  

@Controller  
public class ControladorRecetas {  
    
    private static String[] listaRecetas = new String[] {"Pizza", "Espagueti", "Lasaña"};  
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<String, String[]>();  

   
    public ControladorRecetas() {  
        String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};  
        recetasConIngredientes.put("Pizza", pizza);  
        
        String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};  
        recetasConIngredientes.put("Espagueti", espagueti);  
        
        String[] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};  
        recetasConIngredientes.put("Lasaña", lasaña);  
    }  

    @GetMapping("/recetas")  
    public String obtenerTodasLasRecetas(Model model) {  
        List<String> recetasList = new ArrayList<>();  
        for (String recetaString : listaRecetas) {  
            recetasList.add(recetaString);  // 
        }  
        
        model.addAttribute("listaRecetas", recetasList);   
        return "recetas.jsp";  
    }  
    
    @GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable String nombre, Model model) {
    	if (recetasConIngredientes.containsKey(nombre)) {
    		String[]ingredientes = recetasConIngredientes.get(nombre);
    		
    		model.addAttribute("nombreReceta", nombre);
    		model.addAttribute("ingredientes", ingredientes);
    		
    		return "detalleReceta.jsp";
    		
    	}else {
				model.addAttribute("mensaje", "La receta no se encuentra en nuestra lista.");
				return "detalleReceta.jsp";
			}
    		
    		
    	}
    }


