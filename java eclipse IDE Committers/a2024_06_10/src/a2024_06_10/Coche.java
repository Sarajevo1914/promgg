package a2024_06_10;

public class Coche {

	private int ruedas, largo, ancho, motor, peso;
	// crear metodo constructor para las propiedades comunes de los coches
	// este debe siempre llevar el nombre de la clase a la que pertenece

	String color;
	int peso_total, puertas, plazas;
	boolean asiento_cuero, AC;
	
	// those three are not private

	public Coche() {
		ruedas = 4;
		largo = 4000;
		ancho = 1500;
		motor = 1600;
		peso = 1600;
		}
	
	// metodo getter
	public String Dime_largo() {
		return "el largo del auto es de " + largo + "mm";
	}
	
	// metodo setter
	public void Establece_color(String Color_coche) {
		// el argumento Color_coche del tipo string permite cambiar color del auto utilizada por la clase Usocoche
		color = Color_coche;
	}
	
	// metodo getter
	public String Dime_color() {
		return "el color del autor es de " + color;
	}
	
	// setter
	public void Configura_asientos(String asiento_cuero) {
		
		//this.asiento_cuero = asiento_cuero;
		
		// the `this.` prefix in asiento_cuero (the var in this class) need to
		// have that prefix to disting between the asiento_cuero(arg from another
		// file). ex. arg from Usocoche
		
		// if the arg is a String do this
		
		 if(asiento_cuero == "si"){
			this.asiento_cuero = true;
			} else {
				this.asiento_cuero = false;
			}

		// you can not use this if statement if you use directly a boolean as a
		// entry insted of a String
		// in Configura_asientos() change String to boolean
		// and the value need to be `false` or `true` without quote marks
	}
	
	// getter
	public String Dime_asientos() {
		if(asiento_cuero == true) {
			return "el auto tiene asientos de cuero";
		} else {
			return "el auto no tiene asientos de cuero";
		}
	}
	
	// setter
	public void Configura_AC(boolean AC) {
		this.AC = AC;
		
	}
	
	// getter
	public String Dime_AC() {
		if(AC == true) {
			return "el auto tiene AC";
		} else {
			return "el auto no tiene AC";
		}
	}
	
	// setter
	public void Configura_puertas(int puertas) {
		this.puertas =	puertas;
		}
	
	// getter
	public String Dime_puertas() {
		return "el auto tiene " + puertas + " puertas";
	}
	

	//setter
	public void Configura_plazas(int plazas) {
		this.plazas =	plazas;
		}
	
	// getter
	public String Dime_plazas() {
		return "el auto tiene " + plazas + " plazas";
	}
	
	

}