package lol;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class MarcoconImagen {

	public static void main(String[] args) {

		VentanaImagen mimarco = new VentanaImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class VentanaImagen extends JFrame {
	public VentanaImagen() {
		setTitle("prueba con img");
		setSize(600, 400);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel {
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawRect(5, 5, 50, 50);
	File miImagen = new File("src/lol/coche.png");

	try {
		imagen = ImageIO.read(miImagen);
	}
	catch (IOException e) {
		System.out.println("img not found");
	}
	
	g.drawImage(imagen, 10, 10, null);
	
	}
	
	private Image imagen;
}