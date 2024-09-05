package yp;
import javax.swing.*;
public class Grafica {

	public static void main(String[] args) {
		int num;
		
		do {
			String j = JOptionPane.showInputDialog("ingroduce un num entre 0 y 10");
			num = Integer.parseInt(j);
		} while (num >= 10 || num <0);
		
//		System.out.println("El numero introducido es " + num);
		JOptionPane.showMessageDialog(null, "El numero introducido es " + num);
		
	}

}
