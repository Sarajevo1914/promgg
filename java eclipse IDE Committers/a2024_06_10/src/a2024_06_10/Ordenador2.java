package a2024_06_10;

public class Ordenador2 {
	
	private String procesador;
	private int ram;
	private String mother;
	private String discotipo;
	private int discocap;
	private String discounidad;
	
	public Ordenador2 () {//inicio los valores de la variable
		
		procesador= "i5";
		ram=8;
		mother="Soyo";
		discotipo="SSD";
		discocap=512;
		discounidad="GB";
	}	
	
	//getter
	public String DimeDatosOrdenador() {
		return "El ordenador posee un procesador "+procesador+
				" ,una mamoria RAM de "+ram+ " GB, Mother " +mother+
				" y un disco " +discotipo+ " de " +discocap+discounidad+ " de capacidad.";
	}

}