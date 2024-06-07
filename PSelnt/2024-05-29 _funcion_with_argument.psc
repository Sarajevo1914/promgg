Funcion writeStrike(text, cantidad)
	
	Escribir text;
	para x = 1 hasta cantidad Hacer
		Escribir Sin Saltar "_";
	FinPara
	
	Escribir "";
	
FinFuncion

Algoritmo _funcion_with_argument
	Definir text Como Caracter;
	Definir cantidad Como Entero;
	
	writeStrike("primer ejemplo", 16);
	writeStrike("segundo ejemplo", 17);
	writeStrike("tercer ejemplo", 16);
	
FinAlgoritmo
