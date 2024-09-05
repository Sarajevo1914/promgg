package electro;

public class Impresora {
	private int fuente, carro;
	
	private String puerto;
	
	public Impresora() {
		fuente = 220;
		carro = 21;
		puerto = "usb";
	}

	// getter
	public String DatosImpresora() {
		return "Contiene fuente " + fuente + " voltios " + "con un carro de " + carro + " con un puerto " + puerto;
	}
	
}
