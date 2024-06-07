// dado n notas calcular
// notas aprobadas
// notas no aprobadas
// promedio de todas las notas
// prom notas aprobadas
// prom notas no aprobadas

// make another using arrays

Algoritmo studient_grades_walter
	Definir i, cantn, notas, ap, nap, totalap, totalnap, totaln Como Entero;
	Definir prom, promap, promnap Como Real;
	
	escribir "La cantidad de notas";
	
	leer cantn;
	
	para i <- 1 Hasta cantn Con Paso 1 Hacer
		Escribir "Ingrese la ", i, "° nota";
		leer notas;
		
		si notas >= 7 Entonces
			ap = ap + 1;
			totalap = totalap + notas;
		SiNo
			nap = nap + 1;
			totalnap = totalanp + notas;
		FinSi
		totaln = totaln + notas;
	FinPara
	
	
	si ap = 0 Entonces
		promap = 0;
	SiNo
		promap = totalap / ap;
	FinSi
		
	si nap = 0 Entonces
		promnap = 0;
	SiNo
		promnap = totalnap / nap;
	FinSi
	
	prom = totaln / cantn;

	Escribir "Sobre un total de: ", cantn, " notas";
	Escribir "Promedio general de todas las notas: ", prom;
	Escribir "Aprobadas ", ap," con un promedio de: ", promap;
	Escribir "No aprobadas, ", nap, " con un promedio de: ", promnap;
	
	
FinAlgoritmo
