package yp;
import java.awt.Frame;
import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame{
	public miMarco() {
		setSize(500, 300);
		setLocation(500, 300);
		
		// setBound(500, 300, 250, 250);
		
		setResizable(false);
		
		// setExtemdedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
	}
}