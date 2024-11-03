package com.clases;  

public class ProductoElectrodomestico {  

    public String nombreProducto;  
    public Double precioProducto;  
    public int cantidadProducto;  
 
    public ProductoElectrodomestico(String nombreProducto, Double precioProducto, int cantidadProducto) {  
        this.nombreProducto = nombreProducto;  
        this.precioProducto = precioProducto;   
        this.cantidadProducto = cantidadProducto;     
    }  
  
    public ProductoElectrodomestico(String nombreProducto, Double precioProducto) {  
        this.nombreProducto = nombreProducto;  
        this.precioProducto = precioProducto;   
        this.cantidadProducto = 0;  //  
    }  

    public String getNombreProducto() {  
        return nombreProducto;  
    }  

    public void setNombreProducto(String nombreProducto) {  
        this.nombreProducto = nombreProducto;  
    }  

    public Double getPrecioProducto() {  
        return precioProducto;  
    }  

    public void setPrecioProducto(Double precioProducto) {  
        this.precioProducto = precioProducto;  
    }  

    public int getCantidadProducto() {  
        return cantidadProducto;  
    }  

    public void setCantidadProducto(int cantidadProducto) {  
        this.cantidadProducto = cantidadProducto;  
    }
    
    public void mostrarInformacion(String string) {
    	System.out.println("El producto: " + nombreProducto + " , tiene un valor de :" + precioProducto + " y registra stock de " + cantidadProducto + " existencias");
    }
}