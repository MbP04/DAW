import java.util.Scanner;
class ejercicio3{
	public static void main(String[] args){		
		int NUM;
		int digitos = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		NUM = sc.nextInt();
				
		while(NUM != 0){
			NUM = NUM/10;
			digitos++;
						
		}	
		
		if (digitos <= 6){
			System.out.println("El numero tiene "+digitos+" digitos");
			
		}else{
			System.out.println("El numero es mayor a 6 digitos");				
		}		
	}
}