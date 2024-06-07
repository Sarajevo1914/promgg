Funcion numeroUsuario <- leerNumero (numeroUsuario)
	Definir volver como logico;
	volve <- falso;
	Repetir
		Escribir "Ingrese un numero entre 1 y 100";
		leer numeroUsuario;
		si numeroUsuario >= 1 Entonces
			si numeroUsuario <= 100 Entonces
				volver = Verdadero;
			FinSi
		FinSi
	Hasta Que volver = Verdadero
FinFuncion


Funcion codigo <- comprobarNumero (numeroCorrecto, numeroUsuario)
	Definir codigo Como Entero;
	si numeroUsuario = numeroCorrecto Entonces
		codigo = 0;
	SiNo
		si numeroUsuario < numeroCorrecto Entonces
			codigo = -1;
		SiNo
			codigo = 1;
		FinSi
	FinSi
FinFuncion

Algoritmo adivinar_numero
	Definir numeroCorrecto, numeroUsuario Como Entero;
	Definir salir Como Logico;
	numeroUsuario = 1;
	numeroCorrecto = 43;
	salir = Falso;
	
	Mientras salir = Falso hacer
		numeroUsuario = leerNumero(numeroUsuario);
		
		segun comprobarNumero(numeroCorrecto, numeroUsuario) hacer
			0:
				Escribir "Numero correcto";
			1:
				Escribir "El numero introducido es mayor que el numero a adivinar";
			-1:
				Escribir "El numero introducido es menor que el numero a adivinar";
		FinSegun
	FinMientras
	
FinAlgoritmo
