package a2024_06_10;
import javax.swing.*;
import java.util.Scanner;

public class Yo_switch_GUI {

	public static void main(String[] args) {
		int nota;
		String entr = JOptionPane.showInputDialog("ingrese nota de examen");
		nota = Integer.parseInt(entr);
		
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			JOptionPane.showMessageDialog(null, "INSUFICIENTE");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "SUFICIENTE");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "BIEN");
			break;
		case 7:
		case 8:
			JOptionPane.showMessageDialog(null, "NOTABLE");
			break;
		case 9:
		case 10:
			JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
			break;
		}
	}

}
