package a2024_06_10;

public class Cuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, resultado;		
		a = 100;
		b = 2;
		/* block comment */
		resultado = a + b;
		System.out.println("El resultado de a + b es: " + resultado);
		resultado = a - b;
		System.out.println("El resultado de a - b es: " + resultado);
		
		resultado = a * b;
		System.out.println("El resultado de a * b es: " + resultado);
		
		double div;
		
		div = a / b;
		System.out.println("El resultado de a / b es: " + div);
		
		System.out.println("El resultado de sqrt a es: " + Math.sqrt(a));
		// output of sqrt(a)
			
		System.out.println("El resultado de a / b redondeado es: " + Math.round(div));
		
		
		System.out.println("El resultado de a^b es: " + Math.pow(a, b));
		
	}

}
