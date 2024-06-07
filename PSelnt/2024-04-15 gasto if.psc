Algoritmo sin_titulo
	Definir gasto Como Real;
	gasto <- 0;
	// validar gastos
	// solo apruebo gastos inferiores a 10000
	Escribir "ingrese el monto del gasto";
	leer gasto
	si (gasto <= 10000) Entonces
		Escribir "gasto aprobado";
		sino escribir "gasto rechazado";
	FinSi
FinAlgoritmo
