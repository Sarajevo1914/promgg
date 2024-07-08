package a2024_06_10;
import java.util.Scanner;
public class yo_if {

	public static void main(String[] args) {
		int nota;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Ingrese su calificacion del 1 al 10");
		nota = entr.nextInt();
		
		if(nota >=0 && nota <=5) {
			System.out.println("INSUFICIENTE");
		} else if(nota == 6) {
			System.out.println("SUFICIENTE");
		} else if(nota == 7 || nota == 8) {
			System.out.println("NOTABLE");
		} else if(nota == 9 || nota == 10) {
			System.out.println("SOBRESALIENTE");
		}

	}

}
