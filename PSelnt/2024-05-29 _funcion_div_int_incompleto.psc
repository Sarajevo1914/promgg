
// find all divisor of a int
// check
// https://www.math.uh.edu/~minru/web/divis2.html

Funcion divc <- CantidadDedivisores(num)
	
	para i = 1 Hasta num Hacer
		
		si num / 
		
		divc = divc + 1;
		
	FinPara
	
	
FinFuncion

Algoritmo _funcion_div_int_incompleto
	
	Definir num Como Entero;
	Definir divc Como Entero;
	
	Escribir "ingrese un numero altetorio para saber la cantidad de divisores";
	leer num;
	
	Escribir "el numero ingresado ", num," tiene: ", divc," divisores";
FinAlgoritmo
