Algoritmo sin_titulo
	leer n;
	Si n >= 0 y n mod 1 = 0 Entonces
		c = 1;
		s = 0;
		Mientras c <= n Hacer
			si n mod c = 0 Entonces
				s = s + c;
				// uncomment below line to print numero divisible por n
				Escribir c;
			FinSi
			c = c + 1;
		FinMientras
		Escribir s;
	SiNo
		Escribir "Error";
	FinSi
FinAlgoritmo
