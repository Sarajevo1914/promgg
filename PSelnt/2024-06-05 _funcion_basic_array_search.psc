Funcion buscar (cod, ape, nom)
	Escribir Sin Saltar "ingrese el codigo buscado";
	leer codb;
	
	// this bellow comment block code is the original code from walter fauque
	// this dosent work proppely
	
//	para b <- 1 hasta 3 con paso 1 Hacer
//		si codb=cod[b] Entonces
//			Escribir "el usuario buscado es: ";
//			Escribir "codigo: ", cod[b], " apellido: ", ape[b], " nombre: ", nom[b];
//		SiNo
//			Escribir "el usuario con codigo ", codb, " no existe";
//		FinSi
//	FinPara
	
	
	// this bellow is the correct one
	
	para b <- 1 hasta 3 con paso 1 Hacer
		si codb=cod[b] Entonces
			c = b;
		FinSi
	FinPara
	
	si c = 0 Entonces
		Escribir "el usuario con codigo ", codb, " no existe";
	SiNo
		Escribir "el usuario buscado es: ";
		Escribir "codigo: ", cod[c], " apellido: ", ape[c], " nombre: ", nom[c];
	FinSi
	

FinFuncion
Algoritmo _funcion_basic_array_search
	Dimension cod[10];
	Dimension ape[10];
	Dimension nom[10];
	Definir codb, cod, a, b, c Como Entero;
	Definir ape, nom Como Caracter;
	para a <- 1 hasta 3 con paso 1 Hacer
		Escribir sin saltar "ingrese codigo";
		leer cod[a];
		Escribir Sin Saltar "ingrese apellido";
		Leer ape[a];
		Escribir Sin Saltar "ingrese nombre";
		leer nom[a];
	FinPara
	buscar(cod,ape,nom)
FinAlgoritmo