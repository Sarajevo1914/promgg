Funcion sueldo <- jornal (n_horas, turno, tipo_dia)
	si (turno = "diurno" y tipo_dia = Verdadero) Entonces
		sueldo <- n_horas * 10;
	SiNo
		si (turno = "diurno" y tipo_dia = falso) Entonces
			sueldo <- n_horas * (10 * 1.1);
		FinSi
	FinSi
	si (turno = "nocturno" y tipo_dia = Verdadero) Entonces
		sueldo <- n_horas * 13.5;
	SiNo
		si (turno = "nocturno" y tipo_dia = falso) Entonces
			sueldo <- n_horas * (13.5 * 1.1);
		FinSi
	FinSi
FinFuncion

Algoritmo sueldo_switch
	
	Definir sueldo, n_horas Como Real;
	definir trabajor, dia ,turno Como Caracter;
	definir tipo_dia Como Logico
		
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
			tipo_dia <- Verdadero
		"martes":
			tipo_dia <- Verdadero
		"miercoles":
			tipo_dia <- Verdadero
		"jueves":
			tipo_dia <- Verdadero
		"viernes":
			tipo_dia <- Verdadero
		"sabado":
			tipo_dia <- Falso
		"domingo":
			tipo_dia <- Falso
	FinSegun
	// return sueldo
	sueldo <- jornal(n_horas, turno, tipo_dia)
	Escribir "el trabajor", trabajor, " cobrara ", sueldo, " euros";
FinAlgoritmo
