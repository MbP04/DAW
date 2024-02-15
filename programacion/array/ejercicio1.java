import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args){
		int i;
		int[] numeros = new int[15];
		int temp;

		Scanner teclado = new Scanner(System.in);
	
		//Introduce los 15 numeros por pantalla
		for(i=0; i<numeros.length; i++){
			System.out.printf("Introduzca numero %d: ", i+1);
			numeros[i] = teclado.nextInt();
		}

		temp=numeros[15-1];
    		for(i=15-1;i>0;i--)
    		{
       	 		numeros[i]=numeros[i-1];
    		}
    		numeros[0]=temp;
 
    		System.out.println("\nCon el array cambiado");
    		for(i=0;i<15;i++)
    		{
       	 		System.out.println(numeros[i]);
    		}
	}
}