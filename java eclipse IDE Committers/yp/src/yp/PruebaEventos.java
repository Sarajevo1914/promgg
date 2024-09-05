package yp;
import javax.swing.*;
import java.awt.*;

class MarcoBotones extends JFrame{
	public MarcoBotones() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}

class LaminaBotones extends JPanel{
	
}

public class PruebaEventos {
	
	public static void main(String[] args) {

		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


