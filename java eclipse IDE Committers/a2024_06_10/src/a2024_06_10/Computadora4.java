package a2024_06_10;
import java.util.*;
public class Computadora4 {

	public static void main(String[] args) {
		
		Scanner entr = new Scanner (System.in);
		
		int cantidad = 0;
		int tipo;
		
		PcEscritorio[] mipc = new PcEscritorio[100];
		
		System.out.println("ingrese tipo de ordenador a ingresar 1 = PC escritorio, 2 = Portatil");
		tipo = entr.nextInt();
		
		while (tipo != 1 && tipo != 2) {
			System.out.println("El dato ingresado no corresponde a un tipo de ordenador valido");
			System.out.println("ingrese tipo de ordenador a ingresar 1 = PC escritorio, 2 = Portatil");
			tipo = entr.nextInt();
		}
		
		if(tipo == 1) {
			System.out.println("ingrese cantidad de equipos a ingresar");
			cantidad = entr.nextInt();
		}
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println("ingrese gabinete de la pc " + (i + 1));
			String gabi = entr.next();
			System.out.println("ingrese fuente de la pc " + (i + 1));
			String fonte = entr.next();
			System.out.println("ingrese monitor de la pc " + (i + 1));
			String moni = entr.next();
			System.out.println("ingrese grafica de la pc " + (i + 1));
			String targ = entr.next();
			
			mipc[i] = new PcEscritorio(gabi, fonte, moni, targ);
		}
		
		// muchos comentarios lol xd
		
		Portatil miportatil1 = new Portatil("1200 MhA", 17);
		Portatil miportatil2 = new Portatil("8000 MhA", 15);
		
		System.out.println("indica con 1 para ver la lista de PC de escritorio o 2 para lista de portatiles");
		
		int tipocompu = entr.nextInt();
		
		if(tipocompu == 1) {
			System.out.println(mipc[0].DimeDatosOrdenador() + " ");
			System.out.println(mipc[0].DimeDatosPc());
			System.out.println(mipc[1].DimeDatosOrdenador() + " ");
			System.out.println(mipc[1].DimeDatosPc());
		} else {
			System.out.println(miportatil1.DimeDatosOrdenador());
			System.out.println(miportatil1.DimeDatosPortatil());
			System.out.println(miportatil2.DimeDatosOrdenador());
			System.out.println(miportatil2.DimeDatosPortatil());
		}
	}
}
