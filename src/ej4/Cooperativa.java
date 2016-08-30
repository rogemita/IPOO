package ej4;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {

	List<Colectivo> colectivos = new ArrayList<Colectivo>();
	
	
	public void agregarColectivo(Colectivo c) {
		this.colectivos.add(c);
	}

	public Chofer realizarViaje(int cantPas, int cantKm) {
		Chofer chofer = null;
		for(Colectivo c: this.colectivos) {
			chofer = c.realizarViaje(cantPas, cantKm);
			if (chofer != null) {
				break;
			}
		}
		return chofer;
	}
	
	public Colectivo mayorKilometro() {
		Colectivo colectivo = null;
		int max = 0;
		for(Colectivo c: this.colectivos) {
			if (c.mayorKilometro(max)) {
				colectivo = c;
				max = c.getKms();
			}
		}
		return colectivo;
	}

}
