import java.util.Scanner;
class ejercicio2 {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double numa;
		
		System.out.print("Introduce la altura (en metros): ");
		numa = sc.nextDouble();
		
		System.out.println(numa+" m");
				
		double nump;
		
		System.out.print("Introduce el peso (en kilos): ");
		nump = sc.nextDouble();

		System.out.println(nump+" kg");
		
		double numt = nump / (numa*numa);
		System.out.println("Tu indice de masa corporal es: "+nump+"/"+"("+numa+"*"+numa+") "+"= "+numt);
		
	}
}