package com;

import com.clases.TiendaElectronica;  
import com.clases.Televisor;  
import com.clases.ComputadoraPortatil;  
public class Aplicacion {

	public static void main(String[] args) {

        
        TiendaElectronica tienda = new TiendaElectronica();  
        
        Televisor televisor1 = new Televisor("Samsung", 153.990, 3, 70, 2160);  
        Televisor televisor2 = new Televisor("LG", 150.990, 2, 50, 2160);  
        
        ComputadoraPortatil pc1 = new ComputadoraPortatil("Pc Samsung", 400.990, 5, "Samsung", 16, 123456);  
        ComputadoraPortatil pc2 = new ComputadoraPortatil("Pc HP", 880.990, 1, "HP", 64, 123456);  
        
        tienda.agregarProducto(televisor1);  
        tienda.agregarProducto(pc1);  
        tienda.agregarProducto(pc2);  

        // Cambia este método para que use el nombre del producto  
        tienda.realizarVenta(pc1.getNombreProducto());   
        
        tienda.mostrarProductos();  
        
        tienda.realizarVenta(televisor2.getNombreProducto()); // Cambia para pasar el nombre  
        tienda.mostrarProductos();  
        
    }  
	}

