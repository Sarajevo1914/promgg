package a2024_06_10;

public class Remiseria {

	public static void main(String[] args) {
		String chofe[] = {"coco", "tito", "rolo","coco","rolo","coco","tito","rolo","rolo"};
		double importe[] = {200, 300, 300, 500, 600, 400, 200, 500, 300};
		
		double totaltito=0, totalrolo=0, totalcoco=0;
		double ccoco=0, crolo=0,ctito=0;
		int i=0;
		int viajes = chofe.length;
		
		for(i = 0; i < viajes; i++) {
			if(chofe[i].equals("coco")) {
				totalcoco = totalcoco + importe[i];
			} else if(chofe[i].equals("tito")) {
				totaltito = totaltito + importe[i];
			} else if(chofe[i].equals("rolo")) {
				totalrolo = totalrolo + importe[i];
			}
		}
		
		ccoco = totalcoco * 0.2;
		ctito = totaltito * 0.2;
		crolo = totalrolo * 0.2;
		
		System.out.println("total coco: " + totalcoco);
		System.out.println("total tito: " + totaltito);
		System.out.println("total rolo: " + totalrolo);

		System.out.println("comision coco: " + ccoco + " tito: " + ctito + " rolo: " + crolo);
		
		System.out.println("suma de las comisiones: "+(ccoco+ctito+crolo));
		System.out.println("suma de total*: "+(totalcoco+totaltito+totalrolo)*.2);
	}

}