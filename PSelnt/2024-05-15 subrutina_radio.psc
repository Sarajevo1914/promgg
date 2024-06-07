Funcion area <- area_circulo (radio)
	area <- PI * (radio^2);
FinFuncion

Algoritmo subrutina_radio
	
	Escribir "ingrese el radio del circulo";
	leer radio;
	area<-area_circulo(radio);
	Escribir area;
	
FinAlgoritmo
