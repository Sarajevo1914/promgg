package electro;

public class Productos {

	public static void main(String[] args) {
		
		Inkjet chorrotinta1 = new Inkjet("SCF160", "ST81", 4, 32);
		Inkjet chorrotinta2 = new Inkjet("CX5600", "90", 4, 20);
		
		
		// load impresoras data de chorro de tinta que vendo
		
		Laser L1 = new Laser("P0104", "P04104", 50);
		Laser L2 = new Laser("S1115", "3108", 15);
		
		System.out.println(chorrotinta1.DatosImpresora());
		System.out.println(chorrotinta1.DatosInkjet());
		System.out.println(" ");
		System.out.println(chorrotinta2.DatosImpresora());
		System.out.println(chorrotinta2.DatosInkjet());
		
		System.out.println(" ");
		
		System.out.println(L1.DatosImpresora());
		System.out.println(L1.DatosLaser());
		System.out.println(" ");
		System.out.println(L2.DatosImpresora());
		System.out.println(L2.DatosLaser());
	}
}
