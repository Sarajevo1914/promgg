package a2024_06_10;
import java.util.Scanner;
public class Remiseria2 {

	public static void main(String[] args) {
		int choferCant, i, j=0, continuar = 0;
		String chofer[] = new String[3];
		int nrochofer[] = new int[100];
		double importe[] = new double[100];
		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("ingrese el numero de choferes del turno de hoy: ");
		choferCant = entr.nextInt();
		
		for(i = 0; i < choferCant; i++) {
			System.out.println("ingrese el nombre del chofer num " + (i +1));
			chofer[i] = entr.next(); 
		}
		
		i = 0;
		continuar = 1;
			while(continuar == 1) {
				j = j + 1;
				
				for(i = 0; i < choferCant; i++) {
					System.out.println("ingrese el " + (i+1)  + chofer[i] );
				}
					nrochofer[j] = entr.nextInt();
					
					System.out.println("ingrese el importe del viaje: ");
					importe[j] = entr.nextDouble();
					
					System.out.println("ingrese 1 para continuar o cualquier otro numero para terminar");
					continuar = entr.nextInt();
				}
			}
	}
