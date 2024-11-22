package com.rachel.controladores;

import com.rachel.modelos.Cancion;
import com.rachel.servicios.ServicioCanciones;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @GetMapping("/canciones/formulario/agregar")
    public String mostrarFormularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion()); 
        return "agregarCancion.jsp"; 
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute Cancion cancion, BindingResult result) {
        if (result.hasErrors()) {
            return "agregarCancion.jsp"; 
        }
        servicio.agregarCancion(cancion); 
        return "redirect:/canciones"; 
    }

    @GetMapping("/canciones/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable Long idCancion, Model model) {
    	Cancion cancion = servicio.obtenerCancionPorId(idCancion);
    	model.addAttribute("cancion", cancion);
    	return "editarCancion.jsp";
    }
    
    @PostMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@PathVariable Long idCancion, @Valid @ModelAttribute("cancion") Cancion cancion, BindingResult result) {
        if (result.hasErrors()) {
            return "editarCancion.jsp"; 
        }
        
        cancion.setId(idCancion);
        servicio.actualizarCancion(cancion);
        return "redirect:/canciones"; // 
    }
}