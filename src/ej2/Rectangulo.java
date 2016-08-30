package ej2;

import ej1.Punto;

public class Rectangulo extends FiguraGeometrica {
	private int base;
	private int altura;
	
	public Rectangulo () {}
	
	public Rectangulo (int base, int altura, Punto origen) {
		super.setOrigen(origen);
		this.base = base;
		this.altura = altura;
	}
	
	public int superficie() {
		return this.base*this.altura;
	}
	
	public void ampliar(int valor) {
		this.base *= valor;
		this.altura *= valor;
	}
}
