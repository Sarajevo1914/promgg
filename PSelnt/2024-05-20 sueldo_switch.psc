Funcion sueldo <- jornal (n_horas, turno, tipo_dia)
	si (turno = "diurno" y tipo_dia = "laborable") Entonces
		sueldo <- n_horas * 10
	SiNo
		si (turno = "diurno" y tipo_dia = "festivo") Entonces
			sueldo <- n_horas * (10 * 1.1)
		FinSi
	FinSi
	si (turno = "nocturno" y tipo_dia = "laborable") Entonces
		sueldo <- n_horas * 13.5
	SiNo
		si (turno = "nocturno" y tipo_dia = "festivo") Entonces
			sueldo <- n_horas * (13.5 * 1.1)
		FinSi
	FinSi
FinFuncion

Algoritmo sueldo_switch
	
	Definir sueldo, n_horas Como Real;
	definir trabajor, turno, dia, tipo_dia Como Caracter;
		
	Escribir "introducide el nombre del trabajor";
	leer trabajor;
	Escribir "introduce el numero de horas trabajadas";
	leer n_horas;
	Escribir "introduce el turno: diurno o nocturno";
	leer turno;
	Escribir "introduce el dia de hoy";
	leer dia;
	
	segun dia Hacer
		"lunes":
			tipo_dia <- "laborable"
		"martes":
			tipo_dia <- "laborable"
		"miercoles":
			tipo_dia <- "laborable"
		"jueves":
			tipo_dia <- "laborable"
		"viernes":
			tipo_dia <- "laborable"
		"sabado":
			tipo_dia <- "festivo"
		"domingo":
			tipo_dia <- "festivo"
	FinSegun
	// return sueldo
	sueldo <- jornal(n_horas, turno, tipo_dia)
	Escribir "el trabajor", trabajor, " cobrara ", sueldo, " euros";
FinAlgoritmo
