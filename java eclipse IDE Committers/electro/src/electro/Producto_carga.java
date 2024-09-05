package electro;
import java.util.Scanner;
public class Producto_carga {

	public static void main(String[] args) {

		Inkjet[] ctinta = new Inkjet[2];
		Laser[] LS = new Laser[2];
		
		// for ctinta
		String mode, mc;
		int ncart, velp;
		
		// for LS
		String ml, ton;
		int vp;
		
		int i = 0;
		
		Scanner entr = new Scanner(System.in);
		
		for(i = 0; i < ctinta.length; i++) {
			System.out.println("Ingrese el modelo de la impresora");
			mode = entr.next();
			
			System.out.println("Ingrese el modelo del cartucho");
			mc = entr.next();
			
			System.out.println("Ingrese cantidad de cartuchos");
			ncart = entr.nextInt();
			
			System.out.println("Ingrese velocidad de impresion");
			velp = entr.nextInt();
			
			ctinta[i] = new Inkjet(mode, mc, ncart, velp);
		}
	
		System.out.println(" ");
		System.out.println("Finalizo la carga de datos para la impresora de tinta");
		System.out.println(" ");
		System.out.println("A continuacion la carga de la impresora Laser");
		System.out.println(" ");
		
		for(i = 0; i < LS.length; i++) {
			System.out.println("Ingrese el modelo de la impresora");
			ml = entr.next();
			
			System.out.println("Ingrese el modelo del tonner");
			ton = entr.next();
			
			System.out.println("Ingrese velocidad de impresion");
			vp = entr.nextInt();

			LS[i] = new Laser(ml, ton, vp);
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Finalizo la carga de los datos de la impresora laser");
		System.out.println(" ");
		System.out.println("A continuacion se mostrara los datos cargados de la impresora de tinta");
		System.out.println(" ");
		System.out.println("-------------------------------------------");
		
		for(i = 0; i < ctinta.length; i++) {
			System.out.println(ctinta[i].DatosInkjet());
		}

		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Now the next output is for laser printer");
		
		for(i = 0; i < LS.length; i++) {
			System.out.println(LS[i].DatosLaser());
		}

		
	}

}
