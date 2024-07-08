package a2024_06_10;
import java.util.Scanner;
public class Cajero {

	public static void main(String[] args) {
		
		double precio, cant, importe, ivaf, totalf = 0, importef;
		int continuar;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Para comenzar la facturacion presione 1");
		continuar = entr.nextInt();
		
		while(continuar == 1) {
			System.out.println("Ingrese precio");
			precio = entr.nextDouble();
			
			System.out.println("ingrese cantidad");
			cant = entr.nextDouble();
			
			importe = precio * cant;
			ivaf = importe * 0.21;
			importef = importe + ivaf;
			
			totalf = totalf + importef;
			
			System.out.println("Para continuar ingrese 1");
			continuar = entr.nextInt();
		}
		
		System.out.println("La facturacion final del dia es: " + totalf);
	}

}
