package a2024_06_10;

public class Array5 {

	public static void main(String[] args) {
		String estudiante[] = {"carlos", "sebastian", "claudia", "diana", "ricardo", "maria", "juan", "nora", "hector", "julio"};
		double met[] = {10, 9, 9, 8, 7, 6, 5, 4, 4, 1};
		double fisica[] = {5, 4, 9, 9, 6, 8, 9, 8, 4, 10};
		double quimica[] = {9, 9, 3, 8, 9, 7, 4, 6, 4, 8};
		double prom[] = new double[10];
		
		int i;
		
		for(i = 0; i<met.length; i++) {
			prom[i] = (met[i] + fisica[i] + quimica[i]) / 3;
			System.out.println(prom[i]);
		};

	}
}