import java.util.Random;
import java.util.Scanner;

class ejercicio12 {	
	
	public static void main(String[] args){
		int dado1;
		int dado2;
		int tirada = 0;
		
		do{
			tirada++;
			dado1 = (int)(Math.random()*7);
			dado2 = (int)(Math.random()*7);	
			System.out.println("Tirada "+tirada);
			System.out.println("Dado 1: "+dado1);
			System.out.println("Dado 2: "+dado2);			
			System.out.println("= = = = =");	
			

		}while (dado1 != dado2);
		System.out.println("Los numeros son iguales en la tirada "+tirada);
	}
}