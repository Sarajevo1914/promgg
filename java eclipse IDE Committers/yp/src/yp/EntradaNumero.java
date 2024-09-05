package yp;

import javax.swing.JOptionPane;

public class EntradaNumero {

	public static void main(String[] args) {

		final double IVA = 0.21;
		
		String texto_num = JOptionPane.showInputDialog("ingrese precio del producto");
		double precio = Double.parseDouble(texto_num);
		JOptionPane.showMessageDialog(null, "el producto tiene un precio de " + precio + " y su precio final con IVA es de: " + (precio + (precio * IVA)));
	}

}
