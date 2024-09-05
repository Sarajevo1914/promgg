package yp;
import javax.swing.*;
public class Switch_calificaciones {

	public static void main(String[] args) {

		int nota;
		String snota = JOptionPane.showInputDialog("ingrese su nota");
		nota = Integer.parseInt(snota);
		
		if(nota >= 0 && nota < 5)JOptionPane.showMessageDialog(null, "INSUFICIENTE");
		else if(nota == 6) {
			JOptionPane.showMessageDialog(null, "SUFICIENTE");
		} else if(nota == 7 || nota == 8) {
			JOptionPane.showMessageDialog(null, "NOTABLE");
		} else if(nota == 9 || nota == 10) {
			JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
		}

	}

}
