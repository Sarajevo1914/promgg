Algoritmo divisores_numero
	leer n;
	si n > 0 y n mod 1 = 0 Entonces
		c = 1;
		Mientras c <= n Hacer
			si n mod c = 0 Entonces
				Escribir c;
			FinSi
			c = c + 1;
		FinMientras
	SiNo
	Escribir "Error";
	FinSi
FinAlgoritmo
