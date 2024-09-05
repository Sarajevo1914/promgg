package a2024_06_10;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		String day[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		String plato[] = {"milas lunes", "milas martes", "milas miercoles", "milas jueves", "milas viernes", "milas sabado", "milas domingo"};
		int d;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("ingrese el dia de hoy, 1: lunes, 2: martes, 3: miercoles, 4: jueves, 5: viernes, 6: sabado, 7: domingo");
		d = (entr.nextInt() -1);
		
		System.out.println("el menu del dia es: " + plato[d]);
		
		
//		 all bellow this are shit, is redundant and stupid
//		switch(d) {
//		case 0:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 1:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 2:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 3:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 4:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 5:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//		case 6:
//			System.out.println("el menu del dia es: " + plato[d]);
//			break;
//			default:
//				System.out.println("error");
//				break;
//		}

	}

}
