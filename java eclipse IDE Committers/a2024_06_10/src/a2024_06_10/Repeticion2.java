package a2024_06_10;
import java.util.Scanner;
public class Repeticion2 {

	public static void main(String[] args) {
		
		int num, total=0, i=1;
		
		Scanner entr = new Scanner(System.in);
		
		while(i <= 5) {
			System.out.println("Ingrese el numero a sumar");
			
			num = entr.nextInt();
			total = total + num;
			
			i++;
		}
		
		System.out.println("el total acumulado: " + total);

	}

}
