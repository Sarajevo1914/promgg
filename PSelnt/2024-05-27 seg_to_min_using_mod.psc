Algoritmo seg_to_min_using_mod
	Definir tempo, min, seg Como Real;
	
	Escribir "ingrese un tiempo en segundos";
	leer tempo;
	
	min = tempo / 60;
	min = trunc(min);
	
	seg = tempo mod 60;
	
	Escribir "los seg ingresados son: ", tempo, " y la conversion a min es: ", min, " el tiempo resto: ", seg;
	
FinAlgoritmo
