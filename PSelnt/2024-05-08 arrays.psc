Algoritmo arrays
	Definir dni Como Entero;
	Dimension dni[3];
	Definir apellido, nombre Como caracter;
	Dimension apellido[3];
	Dimension nombre[3];
	
	para i <- 1 Hasta 3 con paso 1 Hacer
		Escribir "ingrese dni";
		Leer dni[i];
		Escribir "ingrese nombre";
		leer nombre[i];
		Escribir "ingrese apellido";
		Leer apellido[i];
	FinPara
	
	Escribir "BELLOW THIS LINE IS A OUTPUT"
	
	para i <- 1 hasta 3 con paso 1 Hacer
		Escribir "DNI: ",dni[i];
		Escribir "Nombre: ",nombre[i];
		Escribir "apellido: ",apellido[i];
	FinPara
	
FinAlgoritmo
