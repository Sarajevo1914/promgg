package a2024_06_10;
import java.util.Scanner;
public class Do_while {
// dafaq!?
	public static void main(String[] args) {
		int num;
		Scanner entr = new Scanner(System.in);
		
		System.out.println("introduce un numero entre 10 y 0");
		
		do {
			String texto = entr.next("introduce un numero entre 10 y 0");
			num = Integer.parseInt(texto);
		} while (num >=10 || num <0);
		System.out.println("El numero introducido es: " + num);

	}

}
