package a2024_06_10;
import java.util.Scanner;

/* empresa turismo
 * ofrece paquetes
 * precio depende de destinos y alojamiento
 * playa 1200
 * ciudades coloniales 1000
 * zonas arqueologicas 900
 * 
 * precios son por dia y por individuo
 * 
 * paquetes
 * standar recargo del 0%
 * superior 10%
 * super 30%
 * 
 * si la estadia es >10 8% off
 */

public class Turismo {

	public static void main(String[] args) {
		int tipoD, nivelP, numeroD;
		double importe = 0;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Ingrese el destino: \n"
				+ "1 playa 1200 \n"
				+ "2 ciudades coloniales 1000 \n"
				+ "3 zonas arqueologicas 900");
		tipoD = entr.nextInt();
		
		System.out.println("ingrese el alojamiento: \n"
				+ "1 standar (incluido en el precio) \n"
				+ "2 superior (10% del destino) \n"
				+ "3 super (30% del destino)");
		nivelP = entr.nextInt();
		
		System.out.println("ingrese la duracion de la estadia: ");
		numeroD = entr.nextInt();
		
		switch(tipoD) {
		case 1:
			importe = importe + 1200;
			break;
		case 2:
			importe = importe + 1000;
			break;
		case 3:
			importe = importe + 900;
			break;
		}

		switch(nivelP) {
		case 1:
			importe = importe + 0;
			break;
		case 2:
			importe = importe * 1.10;
			break;
		case 3:
			importe = importe * 1.30;
			break;
		}
		
		importe = importe * numeroD;
		
		if(numeroD > 10) {
			importe = importe * 0.92;
		}
		
		System.out.println("El importe final: " + importe);
		

	}

}
