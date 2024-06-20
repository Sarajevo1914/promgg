package a2024_06_10;
import java.util.Scanner;
public class Entradas {

	public static void main(String[] args) {
		
		int dato = 3;
		System.out.println(dato);
		Scanner intro = new Scanner(System.in);	// object named intro is the input by using keyboard
		
		System.out.println("ingrese un numero cualquiera");
		
		int ingreso = intro.nextInt();	// input using intro.* the * is the name of the place where in goint to be stored
		System.out.println(ingreso);
		
		System.out.println("Ingrese el precio");
		double precio = intro.nextDouble();
		
		System.out.println(precio);

		System.out.println("ingrese nombre");
		String nombre = intro.next();
		System.out.println(nombre);
	}

}
