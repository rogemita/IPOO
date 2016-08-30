package ej1;

public class Punto {
	private int x;
	private int y;
	
	public Punto(){};
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sumar(int x){
		this.x += x;
		this.y += x;
	}
		
	public void sumar(Punto unPunto){
		this.x += unPunto.getX();
		this.y += unPunto.getY();
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	public int distancia(Punto unPunto){
		return (int) Math.sqrt(Math.pow(this.x - unPunto.getX(), 2) + Math.pow(this.y - unPunto.getY(), 2));
	}
}
