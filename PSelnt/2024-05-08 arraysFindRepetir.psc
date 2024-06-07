Algoritmo arraysFindRepetir
	Definir entrada Como Entero;
	Definir contador Como Entero;
	Definir posicion Como Entero;
	Definir dnib Como Entero;
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
	
	Escribir "INGRESE EL DNI A BUSCAR: ";
	Leer dnib;
	
	contador = 1;
	
	Repetir
		si dnib = dni[contador] Entonces
			Escribir "El dni buscado: ", dnib, " corresponde a nombre: ", nombre[contador], " apellido: ", apellido[contador]; 
		FinSi
		contador = contador +1;
	Hasta Que dnib = dni[contador-1];
	
FinAlgoritmo