Funcion total <- conversor (moneda, cantidad)
	si (moneda = "libra") Entonces
		total<-cantidad*1.22;
	FinSi
	si (moneda = "dolar") Entonces
		total<-cantidad*0.75;
	FinSi
	si (moneda = "yen") Entonces
		total<-cantidad*0.009;
	FinSi
FinFuncion

Algoritmo subrutina_moneda_conversion
	Escribir "introduce la moneda que quieras pasar a euros: libra, dolar o yen";
	leer moneda;
	Escribir "introduce la cantidad";
	leer cantidad;
	total <- conversor(moneda, cantidad);
	Escribir total;

FinAlgoritmo
