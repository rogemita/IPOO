package ej4;

public class Programa {
	public static void main(String[] args){
		Chofer ch1 = new Chofer("Carlos");
		Chofer ch2 = new Chofer("Roger");
		
		Colectivo co1 = new Colectivo("A", 20);
		co1.agregarChofer(ch1);
		Colectivo co2 = new Colectivo("D", 4);
		co2.agregarChofer(ch2);
		
		Cooperativa cooperativa = new Cooperativa();
		cooperativa.agregarColectivo(co1);
		cooperativa.agregarColectivo(co2);
		Chofer chofer = cooperativa.realizarViaje(15, 10);
		
		if (chofer == null) {
			System.out.println("Ningun chofer realizo este viaje");
		} else {
			System.out.println("El chofer: " + chofer.getNombre() + " realizo el viaje");
		}
		
		System.out.println(co1.getLinea() + "[chofer:" + co1.getNombreChofer() + "]-> " + co1.getKms() + " kms.");
		System.out.println(co2.getLinea() + "[chofer:" + co2.getNombreChofer() + "]-> " + co2.getKms() + " kms.");
		Colectivo colectivo = cooperativa.mayorKilometro();
		System.out.println("El colectivo con mas kms recorridos es: " + colectivo.getLinea());
	}
}
