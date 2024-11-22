package com.rachel.controladores;

import com.rachel.modelos.Artista;
import com.rachel.servicios.ServicioArtistas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ControladorArtistas {

    @Autowired
    private ServicioArtistas servicioArtistas;

    
    @GetMapping("/artistas")
    public String desplegarArtistas(Model model) {
        List<Artista> listaArtistas = servicioArtistas.obtenerTodosLosArtistas();
        model.addAttribute("artistas", listaArtistas);
        return "artistas.jsp"; 
    }


    @GetMapping("/artistas/detalle/{idArtista}")
    public String desplegarDetalleArtista(@PathVariable Long idArtista, Model model) {
        Artista artista = servicioArtistas.obtenerArtistaPorId(idArtista);
        model.addAttribute("artista", artista);
        return "detalleArtista.jsp"; 
    }

  
    @GetMapping("/artistas/formulario/agregar")
    public String formularioAgregarArtista(Model model) {
        model.addAttribute("artista", new Artista());
        return "agregarArtista.jsp";
    }

  
    @PostMapping("/artistas/procesa/agregar")
    public String procesarAgregarArtista(@ModelAttribute Artista artista, RedirectAttributes redirectAttributes) {
        try {
            servicioArtistas.agregarArtista(artista);
            return "redirect:/artistas"; 
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al agregar el artista: " + e.getMessage());
            return "redirect:/artistas/formulario/agregar"; 
        }
    }
}