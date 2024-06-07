Funcion EscribirCentrado(text)
	
	// whitespaces avalible is 40 yup not 80 colums
	// is 40 collums - the long(text)/2, the return is the begin of the text in the middle
	// of the output
	
	para i = 1 Hasta 40 - (Longitud(text)/2) Hacer
		Escribir Sin Saltar " ";
	FinPara
	
	Escribir Sin Saltar text;
	
	Escribir "";
	
FinFuncion

Algoritmo _funcion_center_text

	Definir text Como Caracter;
	
	Escribir "ingrese un texto";
	leer text;
	EscribirCentrado(text);
	
FinAlgoritmo
