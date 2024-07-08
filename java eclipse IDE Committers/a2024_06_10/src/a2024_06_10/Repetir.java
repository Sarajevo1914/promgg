package a2024_06_10;
import java.util.Scanner;
public class Repetir {

	public static void main(String[] args) {
		int num, total=0, cant=0, i=0;
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de numeros");
		cant = entr.nextInt();
		
		for(i = 1; i <= cant ; i++) {
			System.out.println("Ingrese el numero");
			
			num = entr.nextInt();
			total = total + num;
		}
		
		System.out.println("El total acumulado: " + total);

	}

}
