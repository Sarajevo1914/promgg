Funcion writeStrike(text)
	
	Escribir text;
	para x = 1 hasta Longitud(text) Hacer
		Escribir Sin Saltar "_";
	FinPara
	
	Escribir "";
	
FinFuncion

Algoritmo _funcion_with_textlong
	Definir text Como Caracter;
	Definir cantidad Como Entero;
	
	writeStrike("primer ejemplo");
	writeStrike("segundo ejemplo");
	writeStrike("tercer ejemplo");
	
FinAlgoritmo
