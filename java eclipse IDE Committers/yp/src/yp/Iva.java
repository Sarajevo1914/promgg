package yp;
import javax.swing.*;

class ivaFunc(String tf, double fl) {
	double imp, fl;
	if(tf == "c") {
		imp = fl * 1.21;
	} else {
		imp = fl * 1.105;
	}
	JOptionPane.showMessageDialog(null, "Final con IVA es " + imp);
}

class descuento(int p1) {
	
}

public class Iva {

	public static void main(String[] args) {

	int precio;
	double d, Final, imp, fl;
	String tf, tipf;

	tipf = JOptionPane.showInputDialog("Ingrese tipo de factura A, B o C");
	
	String i = JOptionPane.showInputDialog("Ingrese el importe");
	
	int j = Integer.parseInt(i);
	
	
	
	}

}
