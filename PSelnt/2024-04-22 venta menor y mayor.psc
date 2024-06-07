Algoritmo venta_menor_y_mayor
	Escribir "Ingrese la cantidad de unidades a comprar";
	leer u;
	// valor al menor
	vmi = 4800;
	// valor Mayorista
	vma = 4000;
	total = 0;
	
	si u > 0 Entonces
		si u <= 3 Entonces
			total = vmi * u;
			Escribir "La cantidades son: ", u," y el total es: ", total;
		SiNo
			si u > 3 Entonces
				total = vma * u;
				Escribir "La cantidades son: ", u," y el total es: ", total;
			FinSi
		FinSi
	SiNo
		Escribir "Valor no valido";
	FinSi
FinAlgoritmo
