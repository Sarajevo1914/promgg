package a2024_06_10;

public class Computadora {
	
	public static void main(String[] args) {
		
		Pcescritorio mipc1=new Pcescritorio ("GAMER", 700, " 19 ' Lg", " gforce" );
		
		Pcescritorio mipc2=new Pcescritorio ("TRUCHO", 600, " 17 ' Samsung", " nvidia");
		
		System.out.println(mipc1.DimeDatosOrdenador() + " ");
		System.out.println(mipc1.DimeDatosPc()+ " ");
		
		System.out.println(mipc2.DimeDatosOrdenador() + " ");
		System.out.println(mipc2.DimeDatosPc()+ " ");
		
		Portatil miportatil1=new Portatil (" 12000 MhA" , 17);
		Portatil miportatil2=new Portatil (" 8000 MhA" , 15);
		
		System.out.println(miportatil1.DimeDatosOrdenador() + " ");
		System.out.println(miportatil1.DimeDatosPortatil() + " ");
		System.out.println(miportatil2.DimeDatosOrdenador() + " ");
		System.out.println(miportatil2.DimeDatosPortatil() + " ");
	}
}
