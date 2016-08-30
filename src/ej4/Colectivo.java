package ej4;

public class Colectivo {
	
	private Chofer chofer;
	private String linea;
	private int capacidad;
	private int kms = 0;
	
	public Colectivo(){}
	
	public Colectivo(String linea, int capacidad) {
		this.linea = linea;
		this.capacidad = capacidad;
	}
	
	public Chofer realizarViaje(int cantPas, int cantKm) {
		Chofer chofer = null;
		if (cantPas <= this.capacidad) {
			this.kms = this.kms + cantKm;
			chofer = this.chofer;
		}
		return chofer;
	}

	public void agregarChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public boolean mayorKilometro(int max) {
		return this.kms >= max;
	}

	public int getKms() {
		return this.kms;
	}

	public String getLinea() {
		return this.linea;
	}

	public String getNombreChofer() {
		return this.chofer.getNombre();
	}
}
