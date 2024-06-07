// enunciado

// a un trabajador se le descuentan 10% del sueldo si es menor o igual a 1000
// por encima de 1000 hasta 2000 5% del adicional
// por encima de 2000 3%
// calcular el descuento y el sueldo neto del trabajador dado su sueldo

Algoritmo sueldo_escala_notundestando
	Definir sueldoB, sueldoN, desc, adi Como real;
	
	Escribir "ingrese su sueldo bruto";
	leer sueldoB;
	
	
	si sueldoB <= 1000 Entonces
		desc = sueldoB * 0.1;
		//Escribir "Su sueldo bruto es: ", sueldoB, " el descuento que se le aplica es del 10%, siendo su sueldo neto: ", sueldoN, " siendo el descuento del: ", desc;
	FinSi
	si sueldoB > 1000 y sueldoB <= 2000 Entonces
		adi = sueldoB - 1000;
		desc = (1000 * 0.1) + (adi * 0.05);
		//Escribir "Su sueldo bruto es: ", sueldoB, " se resta el 10% y un adicional del 5%, siendo su sueldo neto: ", sueldoN, " siendo el descuento del: ", desc;
	FinSi
	si sueldoB > 2000 Entonces
		adi = sueldoB - 2000;
		desc = (1000 * 0.1) + (1000 * 0.05) + (adi * 0.03)
		//Escribir "Su sueldo bruto es: ", sueldoB, " se resta el 10% y un adicional del 5% + 3%, siendo su sueldo neto: ", sueldoN, " siendo el descuento del: ", desc;
	FinSi
	
	sueldoN = sueldoB - desc;
	
	Escribir "sueldo bruto: ", sueldoB, " sueldo neto: ", sueldoN;
	
	
FinAlgoritmo
	