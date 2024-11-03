package com.clases;
import java.util.ArrayList;  

public class TiendaElectronica {  
    
    private ArrayList<ProductoElectrodomestico> listaDeProductos; // Almacena los productos del inventario  
    
    public TiendaElectronica() {  
        listaDeProductos = new ArrayList<>(); // Inicializa el ArrayList  
    }  

    
    public void agregarProducto(ProductoElectrodomestico producto) {  
        listaDeProductos.add(producto);  
    }  

     
    public void mostrarProductos() {  
        if (listaDeProductos.isEmpty()) {  
            System.out.println("No hay productos en el inventario.");  
        } else {  
            for (ProductoElectrodomestico producto : listaDeProductos) {  
                producto.mostrarInformacion(""); 
            }  
        }  
    }  

   
    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {  
        for (ProductoElectrodomestico producto : listaDeProductos) {  
            if (producto.getNombreProducto().equalsIgnoreCase(nombre)) {  
                return producto; 
            }  
        }  
        return null;  
    }  
    
    
    public void realizarVenta(String nombreProducto) {  
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);  
        
        if (producto != null) {  
            if (producto.getCantidadProducto() > 0) {  
                producto.setCantidadProducto(producto.getCantidadProducto() - 1); 
                System.out.println("Venta realizada: " + producto.getNombreProducto() + ". Cantidad restante: " + producto.getCantidadProducto());  
            } else {  
                System.out.println("Producto agotado: " + producto.getNombreProducto());  
            }  
    }  

}
}