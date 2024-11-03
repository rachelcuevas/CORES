package com.clases;

public class Televisor extends ProductoElectrodomestico{
	private int tamañoPantalla;
	private int resolucionPantalla;
	
	public Televisor(String nombreProducto, Double precioProducto, int cantidadProducto, int tamañoPantalla,
			int resolucionPantalla) {
		super(nombreProducto, precioProducto, cantidadProducto);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucionPantalla = resolucionPantalla;
	}

	@Override
	public void mostrarInformacion(String string) {
		// TODO Auto-generated method stub
		super.mostrarInformacion(string);
	}

	public int getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public int getResolucionPantalla() {
		return resolucionPantalla;
	}

	public void setResolucionPantalla(int resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}
	
	
	
	
	
}
