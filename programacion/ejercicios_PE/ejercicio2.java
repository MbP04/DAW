import java.util.Scanner;
class ejercicio2{
	public static void main(String[] args){		
		int BASE;
		int EXP;
		long calc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime una base: ");
		BASE = sc.nextInt();
		
		System.out.print("Dime un exponente: ");
		EXP = sc.nextInt();
		
		calc =1;
		for (int cont = 0; cont < EXP; cont++){
			 calc = calc*BASE;
		}
			System.out.println(calc);
	}
}