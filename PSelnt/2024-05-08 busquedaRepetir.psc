Algoritmo busquedaRepetir
	Definir i, j, m, auxiliar, array Como Entero
	Dimensionar array(5)
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir 'ingrese el ', i, ' º numero'
		Leer array[i]
	FinPara
	
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		
		Para j <- i + 1 Hasta 5 Con Paso 1 Hacer
			
			Si array[j] < array[i] Entonces
				
				auxiliar <- array[j]
				array[j] <- array[i]
				array[i] <- auxiliar
				
			FinSi
			
		FinPara
		
	FinPara
	
	Para m <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir array[m]
	FinPara
FinAlgoritmo
