package a2024_06_10;

public class Portatil extends Ordenador2{

	private String bateria;
	private int pantalla;
	
	public Portatil(String bat, int pant) {
		super();
		bateria = bat;
		pantalla = pant;
	}
	
	public String DimeDatosPortatil() {
		return "La portatil cuenta con una bateria de "+ bateria +
				"y una pantalla de " + pantalla + "pulgadas";
	}
}

