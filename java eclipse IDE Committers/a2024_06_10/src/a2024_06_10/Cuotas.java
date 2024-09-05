package a2024_06_10;
import java.util.Scanner;
public class Cuotas {


	// mpago
	// 1 efectivo = descuento 10% sobre 1 solo pago
	// 2 Visa/Mastercard = hasta 6 cuotas sin interes, de 7 a 12 recargo 45%
	// 3 mercadopago = hasta 12 cuotas 60% recargo
	
	
	public static void main(String[] args) {
		
		int mpago, cuota;
		double monto, montof = 0, vcuota =0;
		
		Scanner entr = new Scanner(System.in);
	
		System.out.println("ingrese monto a pagar");
		monto = entr.nextDouble();
		
		System.out.println("ingrese metodo de pago: \n 1: efectivo \n 2: Tarjeta Visa/Mastercard \n 3: MercadoPago");
		mpago = entr.nextInt();
		
		System.out.println("ingrese cuotas que se pagara");
		cuota = entr.nextInt();
		
		
		if(mpago == 1 && cuota == 1) {
			montof = monto * 0.90;
			montof = vcuota;
		} else if (mpago == 2 && cuota <= 6) {
			vcuota = monto / cuota;
			montof = monto;
		} else if (mpago == 2 && cuota > 6) {
			montof = monto * 1.45;
			vcuota = montof / cuota;
		} else if (mpago == 3) {
			montof = monto * 1.60;
			vcuota = montof / cuota;
		}
	
		System.out.println("El importe final es de: " + montof + " con un valor de cuota: " + vcuota);

	}

}
