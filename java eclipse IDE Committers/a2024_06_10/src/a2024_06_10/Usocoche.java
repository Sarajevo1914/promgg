package a2024_06_10;

public class Usocoche {

	public static void main(String[] args) {
		Coche Renault = new Coche();
		// Instanciando la clase
		
		System.out.println(Renault.Dime_largo());

		Renault.Establece_color("Amarillo");
		
		System.out.println(Renault.Dime_color());
		
		Renault.Configura_asientos("si");
		System.out.println(Renault.Dime_asientos());
		
		Renault.Configura_AC(false);
		System.out.println(Renault.Dime_AC());
		
		Renault.Configura_puertas(5);
		System.out.println(Renault.Dime_puertas());
		
		Renault.Configura_plazas(4);
		System.out.println(Renault.Dime_plazas());
	}

}
