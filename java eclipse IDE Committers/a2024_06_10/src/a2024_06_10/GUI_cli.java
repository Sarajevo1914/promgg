package a2024_06_10;
import javax.swing.*;
public class GUI_cli {

	public static void main(String[] args) {
		int precioProducto = 300;
		
		final double IVA = 0.21;
		
		System.out.println("informe del producto");
		
		System.out.println("el precio del producto es " + precioProducto);
		
		System.out.println("el precio del producto + iva es: " + (precioProducto+(precioProducto * IVA)));
		
		
	}

}
