package a2024_06_10;
import java.util.Scanner;
public class yo_switch {

	public static void main(String[] args) {
		int nota;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Ingrese su calificacion del 1 al 10");
		nota = entr.nextInt();
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}

}
