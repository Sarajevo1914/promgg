package a2024_06_10;
import javax.swing.*;
public class GUI_cli_but_this_time_in_GUI_ver {

	public static void main(String[] args) {
		final double IVA = 0.21;
		
		String texto_num = JOptionPane.showInputDialog("introduce el precio del precio del producto");
		
		double precio = Double.parseDouble(texto_num);
		JOptionPane.showMessageDialog(null, "el producto tiene un precio de " + precio + " y su precio final con iva es de: " + (precio+(precio*IVA)));

	}

}
