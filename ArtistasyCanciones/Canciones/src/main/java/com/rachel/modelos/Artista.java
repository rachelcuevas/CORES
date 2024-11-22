package com.rachel.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
	import java.util.List;

	@Entity
	@Table(name = "artistas")
	public class Artista {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombre;
	    private String apellido;
	    private String biografia;

	    @Column(name = "fecha_creacion", updatable = false)
	    private LocalDate fechaCreacion;

	    @Column(name = "fecha_actualizacion")
	    private LocalDate fechaActualizacion;

	    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
	    private List<Cancion> canciones;

	    public Artista() {
	        this.fechaCreacion = LocalDate.now();
	        this.fechaActualizacion = LocalDate.now();
	    }

	 
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	        this.fechaActualizacion = LocalDate.now();
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	        this.fechaActualizacion = LocalDate.now(); 
	    }

	    public String getBiografia() {
	        return biografia;
	    }

	    public void setBiografia(String biografia) {
	        this.biografia = biografia;
	        this.fechaActualizacion = LocalDate.now(); 
	    }

	    public LocalDate getFechaCreacion() {
	        return fechaCreacion;
	    }

	    public LocalDate getFechaActualizacion() {
	        return fechaActualizacion;
	    }

	    public void setFechaActualizacion(LocalDate fechaActualizacion) {
	        this.fechaActualizacion = fechaActualizacion;
	    }

	    public List<Cancion> getCanciones() {
	        return canciones;
	    }

	    public void setCanciones(List<Cancion> canciones) {
	        this.canciones = canciones;
	    }
	}


