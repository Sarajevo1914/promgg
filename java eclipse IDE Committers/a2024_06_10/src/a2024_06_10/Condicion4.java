package a2024_06_10;
import java.util.Scanner;

public class Condicion4 {

	public static void main(String[] args) {
		double sueldoBase, sueldo = 0, antiguedad;
		
		Scanner entr = new Scanner(System.in);

		System.out.println("ingrese su sueldo base: ");
		sueldoBase = entr.nextDouble();
		
		System.out.println("ingrese su antiguedad en anos enteros: ");
		antiguedad = entr.nextDouble();
		
		if(antiguedad == 1) {
			sueldo = sueldoBase;
		} else if (antiguedad >1 && antiguedad <=10) {
			sueldo = sueldoBase * 1.30;
		} else if (antiguedad >10) {
			sueldo = sueldoBase * 1.60;
		}
		
		System.out.println("El sueldo que le corresponde por " + antiguedad + " es de: " + sueldo);

	}

}
