Algoritmo cilindro_diametro
	Escribir "Para calcular el volumen y area del cilindro ingrese el diametro y luego la altura del mismo en la misma medida ej. cm o mm";
	leer d, h;
	si d > 0 y h > 0 Entonces
		vol = pi * d * h;
		area = pi * d;
	SiNo
		Escribir "valores no validos";
	FinSi
	Escribir "El volumen del cilindro es: ", vol, " y el areal es: ", area;
FinAlgoritmo
