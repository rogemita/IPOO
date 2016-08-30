package ej1;

public class Programa {
	public static void main(String[] args){
		Punto p1 = new Punto(1, 3);
		System.out.println("La coordenada del punto p1 es: " + p1.getX() + "," + p1.getY());
		Punto p2 = new Punto(6, 10);
		System.out.println("La coordenada del punto p1 es: " + p1.getX() + "," + p1.getY());
		System.out.println("La distancia entre p1 y p2 es: " + p1.distancia(p2));
	}
}
