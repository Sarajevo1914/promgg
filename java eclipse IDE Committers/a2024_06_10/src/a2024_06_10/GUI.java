package a2024_06_10;
import javax.swing.*;
public class GUI {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("introduce su nombre");
		
		JOptionPane.showMessageDialog(null, "Nice, your name is " + nombre);

	}

}
