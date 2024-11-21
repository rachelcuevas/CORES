package com.rachel.controladores;  

import com.rachel.modelos.Cancion;  
import com.rachel.servicios.ServicioCanciones;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PathVariable;  

import java.util.List;  

@Controller  
public class ControladorCanciones {  

    @Autowired  
    private ServicioCanciones servicio;  

    @GetMapping("/canciones")  
    public String desplegarCanciones(Model model) {  
        List<Cancion> canciones = servicio.obtenerTodasLasCanciones();  
        model.addAttribute("canciones", canciones);  
        return "canciones.jsp";   
    }  

    @GetMapping("/canciones/detalle/{idCancion}")  
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {  
        Cancion cancion = servicio.obtenerCancionPorId(idCancion);  
        model.addAttribute("cancion", cancion);  
        return "detalleCancion.jsp"; 
    }  

 
    @GetMapping("/canciones/agregar")
    public String mostrarFormularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion()); 
        return "agregarCancion.jsp"; 
    }

    
    @PostMapping("/canciones/agregar")
    public String agregarCancion(@ModelAttribute Cancion cancion) {
        servicio.agregarCancion(cancion);
        return "redirect:/canciones"; 
    }
}
