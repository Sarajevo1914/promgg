package a2024_06_10;
import java.util.*;
public class Computadora2 {

	public static void main(String[] args) {
		
		Pcescritorio mipc1 = new Pcescritorio("gamer", 700, "19' LG", "gforce");
		Pcescritorio mipc2 = new Pcescritorio("trucho", 600, "17' samsung", "nvidia");

		Portatil miportatil1 = new Portatil("1200 MhA", 17);
		Portatil miportatil2 = new Portatil("8000 MhA", 15);
		
		Scanner entr = new Scanner(System.in);
		System.out.println("Indica con 1 para ver lista de pc de escritorio o 2 para lista de portatiles");
		
		int tipocompu = entr.nextInt();
		
		if(tipocompu == 1) {
			System.out.println(mipc1.DimeDatosOrdenador() + " ");
			System.out.println(mipc1.DimeDatosPc());
			
			System.out.println(mipc2.DimeDatosOrdenador() + " ");
			System.out.println(mipc2.DimeDatosPc());
		} else {
			System.out.println(miportatil1.DimeDatosOrdenador());
			System.out.println(miportatil1.DimeDatosPortatil());
			
			System.out.println(miportatil2.DimeDatosOrdenador());
			System.out.println(miportatil2.DimeDatosPortatil());
		}
		

	}

}
