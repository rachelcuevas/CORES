package com.clases;

public class ComputadoraPortatil  extends ProductoElectrodomestico{
	
	private String marca;
	private int memoriaRAM;
	private int numSerie;
	
	public ComputadoraPortatil(String nombreProducto, Double precioProducto, int cantidadProducto, String marca,
			int memoriaRAM, int numSerie) {
		super(nombreProducto, precioProducto, cantidadProducto);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	@Override
	public void mostrarInformacion(String string) {
		// TODO Auto-generated method stub
		super.mostrarInformacion(string);
	}
	
	
	
	

}
