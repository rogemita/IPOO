package ej2;

import ej1.Punto;

public class FiguraGeometrica {
	private String color;
	private Punto origen;
	
	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void desplazar(Punto unPunto){
		this.origen = unPunto;
	}
}
