Algoritmo date_check
	Escribir "ingroduce el dia";
	leer dia;
	Escribir "introduce el mes";
	leer mes;
	Escribir "ingroduce el ano";
	leer ano
	
	// check date if correct
	si ((dia <= 31 y dia >= 0) y (mes < 12 y mes >= 0) y ano > 0) Entonces
		Escribir dia Sin Saltar;
		// switch case for moth
		segun mes Hacer
			1:
				Escribir " de enero de " Sin Saltar
			2:
				Escribir " de febrero de " Sin Saltar
			3:
				Escribir " de marzo de " Sin Saltar
			4:
				Escribir " de abril de " Sin Saltar
			5:
				Escribir " de mayo de " Sin Saltar
			6:
				Escribir " de junio de " Sin Saltar
			7:
				Escribir " de julio de " Sin Saltar
			8:
				Escribir " de agosto de " Sin Saltar
			9:
				Escribir " de setiembre de " Sin Saltar
			10:
				Escribir " de octubre de " Sin Saltar
			11:
				Escribir " de noviembre de " Sin Saltar
			12:
				Escribir " de diciembre de " Sin Saltar
		FinSegun
		Escribir ano;
	SiNo
		Escribir "error";
	FinSi
FinAlgoritmo
