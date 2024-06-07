Algoritmo vendedor_sueldo_if_chain
	
	definir tv, sueldo, comicion Como Real;
	
	Escribir "ingrese el sueldo base";
	leer sueldo;
	
	Escribir "ingrese total de ventas en moneda";
	Leer tv;
	
	// calculo de comiciones
	
	si tv < 4000000 Entonces
		comicion = 0;
	SiNo 
		si tv < 10000000 entonces
			comicion = tv * 3/100;
		SiNo
			comicion = tv * 7/100;
		Fin Si
	Fin Si

	Escribir "el total a cobrar es: ", sueldo + comicion;

	
	
FinAlgoritmo
