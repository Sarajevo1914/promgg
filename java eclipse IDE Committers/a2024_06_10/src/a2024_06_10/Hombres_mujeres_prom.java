package a2024_06_10;
import java.util.Scanner;

/* vars hombres, mujeres, de un total de N
 * mostrar % de cada uno
 * 
 * tambien mujeres mayores de edad en %
 * tambien hombre menores en %
 * 
 */

public class Hombres_mujeres_prom {

	public static void main(String[] args) {
		int machos=0, hembras=0, machosMenores=0, hembrasMayores=0, i=0, N=0, edad=0;
		String sex;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Ingrese x personas");
		N = entr.nextInt();
		
		for(i = 1 ; i <= N ; i++) {
			System.out.println("Ingrese sexo: h para hombre o m para mujer");
			sex = entr.next();
			
			switch(sex) {
			case "h":
				machos++;
				break;
			case "m":
				hembras++;
				break;
			}
			
			System.out.println("ingrese edad");
			if (sex.equalsIgnoreCase("h")) {
				edad = entr.nextInt();
				if(edad <= 18) {
					machosMenores++;
				}
			} if (sex.equalsIgnoreCase("m")){
				edad = entr.nextInt();
				if (edad >= 18) {
					hembrasMayores++;
				}
			}
			
			
			
			
			
		}
		
	}

}