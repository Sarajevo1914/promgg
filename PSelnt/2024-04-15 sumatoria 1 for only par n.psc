Algoritmo sin_titulo
	definir n1, sumatoria, c, i como entero;
	sumatoria <- 0;
	Escribir "ingrese la cantida de numeros que quira sumar";
	// utilizo la var c como cantidad de n a sumar
	leer c;
	para i<- 1 Hasta c Con Paso 1 Hacer
		Escribir "ingrese el ", i, "° numero";
		// en n1 guardo el n a sumar
		Leer n1;
		// la var sumatoria acumulo los valores
		// solo sumare los n que sean pares
		si (n1 mod 2 = 0) Entonces
			sumatoria<- sumatoria + n1;
		FinSi
		
	FinPara
	Escribir "el resultado de la suma es ", sumatoria;
FinAlgoritmo
