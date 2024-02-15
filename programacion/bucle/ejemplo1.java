import java.util.Scanner;

class ejemplo1{
	public static void main(String[] args){
		int NUM;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dime un numero: ");
			
			NUM = sc.nextInt();
			
			System.out.println("Has puesto: "+NUM);
		}while (NUM != 0); 
			System.out.println("Has puesto: "+NUM);
		
		
	}
}
