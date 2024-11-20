package Modelos;


public class Receta {  
    private String nombre;  
    private String[] ingredientes;  

    // Constructor  
    public Receta(String nombre, String[] ingredientes) {  
        this.nombre = nombre;  
        this.ingredientes = ingredientes;  
    }  

    // Getters y Setters  
    public String getNombre() {  
        return nombre;  
    }  

    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    public String[] getIngredientes() {  
        return ingredientes;  
    }  

    public void setIngredientes(String[] ingredientes) {  
        this.ingredientes = ingredientes;  
    }  

    @Override  
    public String toString() {  
        return "Receta: " + nombre + ", Ingredientes: " + String.join(", ", ingredientes);  
    }  
}