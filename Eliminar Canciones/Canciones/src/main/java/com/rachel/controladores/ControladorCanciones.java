package com.rachel.controladores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rachel.modelos.Cancion;
import com.rachel.repositorios.ManejoDeFechas;
import com.rachel.servicios.ServicioCanciones;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones implements ManejoDeFechas {

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
    public String procesarAgregarCancion(@ModelAttribute("cancion") Cancion cancion, 
                                          @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") String fechaCreacion) {
        LocalDate fecha = LocalDate.parse(fechaCreacion, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        cancion.setFechaCreacion(fecha);
        
     
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
        return "redirect:/canciones"; 
    }
    
    @PostMapping("/canciones/eliminar/{idCancion}")
    public String procesarEliminarCancion(@PathVariable Long idCancion) {
        servicio.eliminaCancion(idCancion);
        return "redirect:/canciones"; // Redirige a la lista de canciones
    }

    
}


    
