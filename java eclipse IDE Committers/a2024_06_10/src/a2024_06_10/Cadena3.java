package a2024_06_10;

public class Cadena3 {

	public static void main(String[] args) {
		String cadena = "El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";
		
		System.out.println(cadena.charAt(0));	// return E
		System.out.println(cadena.charAt(11));	// return u
		
		System.out.println(cadena.endsWith("n"));	// return true
		System.out.println(cadena.startsWith("e"));	// return false, because is case sensitive in this case

		System.out.println(cadena.equals("El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon"));
		
		System.out.println("Codigo ASCII de cada caracter");
		
		System.out.println("");
		
		System.out.println(cadena.indexOf("fue"));	// find the position of "fue"
		
		System.out.println(cadena.length());
		
		System.out.println(cadena.replace('a', 'e'));	// replace 'a' chars to 'e'
		
		System.out.println(cadena.toLowerCase());	// set all char to lowercase
		System.out.println(cadena.toUpperCase());	// set all char to uppercase
		
	}

}
