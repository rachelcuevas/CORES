package com.rachel.modelos;

public class Libros {
	private String  titulo;
	private String autor;
	
	public Libros(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
}
