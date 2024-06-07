Algoritmo array_num_in_range_chain_if
	definir c, i, totm15, tot2545, tot50, posm15, pos2545, pos50 Como Entero
	Dimension c[10];
	Dimension posm15[10];
	Dimension pos2545[10];
	Dimension pos50[10];
	definir prom Como Real;
	
	totm15 = 0;
	tot2545 = 0;
	tot50 = 0;
	
	para i <- 1 Hasta 10 con paso 1 Hacer
		Escribir "ingrese un numero natural";
		Leer c[i];
	FinPara
	
	// recorre el array y los valores entraran en el if con el rango selecionado
	
	para i = 1 hasta 10 con paso 1 Hacer
		si c[i] < 15 Entonces
			// si el elemento es <15 comienza a contar un acumulador en un total
			totm15 = totm15 + 1;
			// la posicion del elemento anterior se guardara en otro array
			posm15[totm15] = i;
		SiNo
			si (c[i] > 25) y (c[i] < 45) Entonces
				// si el elemento es >25 y <45 conmienza a contar un acumulador en un total
				tot2545 = tot2545 + 1;
				// la posicion del elemento anterior se guardara en otro array
				pos2545[tot2545] = i;
			SiNo
				si c[i] > 50 Entonces
					// si el elemento es >50 comenzara a contar un acumulador en un total
					tot50 = tot50 + 1;
					// la posicion del elemento anterior se guardara en otro array
					pos50[tot50] = i;
				FinSi
			FinSi
		FinSi
	FinPara
	
	Limpiar Pantalla
	
	// validacion de contadores
	
	si totm15 >= 1 Entonces
		Escribir "el total de numeros ingresados menores a 15 son: ", totm15, " siendo los ingresados: ";
		Para i = 1 Hasta totm15 Con Paso 1 Hacer
			Escribir c[posm15[i]];
		FinPara
	SiNo
		Escribir "no hay numeros en el rango menor a 15";
	FinSi
	
	si tot2545 >= 1 Entonces
		Escribir "el total de numeros ingresados entre 25 y 45 son: ", tot2545, " siendo los ingresados: ";
		para i = 1 Hasta tot2545 Con Paso 1 Hacer
			Escribir c[pos2545[i]];
		FinPara
	SiNo
		Escribir "no hay numeros en el rango >25 y <45";
	FinSi
	
	si tot50 >= 1 Entonces
		Escribir "el total de numeros ingresados mayores a 50 son: ", tot50, " siendo los ingresados: ";
		para i = 1 hasta tot50 con paso 1 Hacer
			Escribir c[pos50[i]];
		FinPara
	SiNo
		Escribir "no hay numeros en el rango >50";
	FinSi
	
	i = 0;
	definir na, suma Como Entero;
	
	
	Para  i = 1 Hasta 10 Con Paso 1 Hacer
		
	FinPara
	
FinAlgoritmo
