import java.util.Scanner;

class ejercicio11 {	
	
	public static void main(String[] args){
		int dado1 = (int)(Math.random()*7);
		int dado2 = (int)(Math.random()*7);
		int dado3 = (int)(Math.random()*7);
		int total = dado1+dado2+dado3;
		
		System.out.println("Dado 1: "+dado1);
		System.out.println("Dado 2: "+dado2);
		System.out.println("Dado 3: "+dado3);
		
		System.out.println("El total de todos los dados son : "+total);
	}
}