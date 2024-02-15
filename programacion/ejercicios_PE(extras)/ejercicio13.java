import java.util.Random;
import java.util.Scanner;

class ejercicio13  {	
	
	public static void main(String[] args){
		//Declaramos las variables
		int vidas = 5;
		int num;
		int  dado1 = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		
		
		do{
			//Pido al usuario un numero
			System.out.print("Que numero ha salido?: ");
			num = sc.nextInt();
			
			//Si el numero del usuario es mas pequeño que el de la maquina
			if (num < dado1){
				System.out.println("El numero es mas grande");	
				System.out.println("Te quedan "+(vidas-1)+" oportunidades");	
				System.out.println("= = = = =");
			//Si el numero del usuario es mas grande que el de la maquina
			}else if(num > dado1){
				System.out.println("El numero es mas pequenyo");	
				System.out.println("Te quedan "+(vidas-1)+" oportunidades");	
				System.out.println("= = = = =");
			}
			
			//Cada jugaada vamos restando vidas
			vidas--;

		}while (dado1 != num && vidas != 0);
		
		//Si te has quedado con 0 vidas, te lo muestro
		if (vidas == 0){
			System.out.println("Te has quedado sin vidas :( ");
			System.out.println("El numero era: "+dado1);
		//Si no es el caso es que lo has conesguido
		}else{
			System.out.println("LO HAS CONSEGUIDO!!");

		}
	}
}