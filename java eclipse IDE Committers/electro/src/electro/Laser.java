package electro;

public class Laser extends Impresora{

	private String modeloLaser, tonner;
	private int velpagina; // ppm for laser
	
	public Laser(String ml, String ton, int vp){
		
		super();
		
		modeloLaser = ml;
		tonner = ton;
		velpagina = vp;
		}
	
	// getter
	
	public String DatosLaser() {
		return "modelo " + modeloLaser + " modelo de tonner " + tonner + " velocidad " + velpagina + " paginas por minuto";
	}
	
}
