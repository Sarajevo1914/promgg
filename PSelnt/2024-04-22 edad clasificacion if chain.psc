Algoritmo edad_clasificacion_if_chain
	Escribir "ingrese su edad";
	Leer edad;
	si edad <= 10 Entonces
		Escribir "NINO";
	sino
		si edad > 11 y edad <= 14 Entonces
			Escribir "PUBER"
		SiNo
			si edad >= 15 y edad <= 18 Entonces
				Escribir "ADOLECENTE";
			SiNo
				si edad >= 19 y edad <= 25 Entonces
					Escribir "JOVEN";
				SiNo
					si edad >= 26 y edad <= 65 Entonces
						Escribir "ADULTO";
					SiNo
						si edad >= 66 Entonces
							Escribir "ANCIANO";
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi

FinAlgoritmo