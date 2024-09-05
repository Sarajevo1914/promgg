package electro;

public class Inkjet extends Impresora {
	
	private String cartucho, modelo; //ppm: paginas por minuto
	private int cantidad, ppm; // de cartuchos
	
	public Inkjet(String mod, String cart, int cant, int velocidad) {
		
		super();
		
		modelo = mod;
		cartucho = cart;
		ppm = velocidad;
		cantidad = cant;
		
		
	}
	
	// getter
	public String DatosInkjet() {
		return "contiene modelo " + modelo + " numero de cartuchos " + cantidad + " modelo cartucho" + cartucho + " velocidad " + ppm + " paginas por minuto";
	}
}
