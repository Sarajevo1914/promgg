Algoritmo cilindro_radio
	Escribir "Para calcular el volumen y area del cilindro ingrese el radio y luego la altura del mismo en la misma medida ej. cm o mm";
	leer r, h;
	si r > 0 y h > 0 Entonces
		vol = pi * r^2 * h;
		area = pi * r^2;
	SiNo
		Escribir "valores no validos";
	FinSi
	Escribir "El volumen del cilindro es: ", vol, " y el areal es: ", area;
FinAlgoritmo
