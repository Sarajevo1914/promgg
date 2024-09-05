package a2024_06_10;

//heredo de la calse ordenador
public class Pcescritorio extends Ordenador2 {
	
	private String gabinete;
	private int fuente;
	private String monitor;
	private String targetagrafica;
	
	public Pcescritorio (String gab, int font, String mon, String tgrafica) {

		super();
			gabinete=gab;
			fuente=font;
			monitor=mon;
			targetagrafica=tgrafica;
		}
	public String DimeDatosPc() {
		return "La PC cuenta con un Gabinete ," +gabinete+
				" con una fuente " +fuente+
				" whatts, con un monitor " +monitor+
				" y una tarjeta grafica " +targetagrafica;
	}
}
