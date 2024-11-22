package com.rachel.controladores;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.rachel.modelos.Cancion;
import com.rachel.modelos.Artista;
import com.rachel.servicios.ServicioCanciones;
import com.rachel.servicios.ServicioArtistas;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {

    @Autowired
    private ServicioCanciones servicioCanciones;

    @Autowired
    private ServicioArtistas servicioArtistas;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        List<Cancion> canciones = servicioCanciones.obtenerTodasLasCanciones();
        model.addAttribute("canciones", canciones);
        return "canciones.jsp"; 
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
        Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", cancion);
        return "detalleCancion.jsp"; 
    }

    @GetMapping("/canciones/formulario/agregar")
    public String mostrarFormularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion());
        cargarArtistasEnModelo(model); 
        return "agregarCancion.jsp"; 
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, 
                                          @RequestParam Long artistaId, 
                                          @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") String fechaCreacion, 
                                          BindingResult result, Model model) {
      
        if (result.hasErrors()) {
            cargarArtistasEnModelo(model);
            return "agregarCancion.jsp"; 
        }

        
        Artista artista = servicioArtistas.obtenerArtistaPorId(artistaId);
        if (artista == null) {
            result.rejectValue("artista", "error.cancion", "Artista no encontrado");
            cargarArtistasEnModelo(model);
            return "agregarCancion.jsp";
        }
        
        cancion.setArtista(artista);
        cancion.setFechaCreacion(LocalDateTime.now()); 
        
        servicioCanciones.agregarCancion(cancion);
        return "redirect:/canciones"; 
    }

    @GetMapping("/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable Long idCancion, Model model) {
        Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", cancion);
        cargarArtistasEnModelo(model); 
        return "editarCancion.jsp";  
    }
    
    @PostMapping("/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@PathVariable Long idCancion, @Valid @ModelAttribute("cancion") Cancion cancion, BindingResult result, Model model) {
        if (result.hasErrors()) {
            cargarArtistasEnModelo(model);
            return "editarCancion.jsp"; 
        }
        
        cancion.setId(idCancion);
        servicioCanciones.actualizarCancion(cancion);
        return "redirect:/canciones"; 
    }
    
    @PostMapping("/eliminar/{idCancion}")
    public String procesarEliminarCancion(@PathVariable Long idCancion) {
        servicioCanciones.eliminaCancion(idCancion);
        return "redirect:/canciones"; 
    }

    
    private void cargarArtistasEnModelo(Model model) {
        List<Artista> artistas = servicioArtistas.obtenerTodosLosArtistas();
        model.addAttribute("artistas", artistas);
    }
}