// algo dado num aleatorio positivo (no puede ser cero) de como retorno la cantidad de cifras del mismo (ej. 253 da como retorno 3)

// check 
// https://codigogx.blogspot.com/2016/05/codigo-para-contar-cantidad-de-digitos.html

Algoritmo cifras_num
	
	Definir num, numcifra Como entero;
	definir aux Como Real;
	
	Escribir "Ingrese un numero Aleatorio positivo";
	Leer num;
	
	numcifra = 1;
	aux = num;
	
	Repetir
		aux = aux / 10;
		si aux >= 1 Entonces
			numcifra = numcifra + 1;
		FinSi
	Hasta Que aux < 1
	
	Escribir "la cantidad de cifras del numero: ", num, " y la cantidad de cifras encontradas es: ", numcifra;
	
FinAlgoritmo
