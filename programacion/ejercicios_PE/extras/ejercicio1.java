public class ejercicio1 {
	public static void main(String[] args){
		int i;
		int[] numeros = new int[15];

		Scanner teclado = new Scanner(System.in);

		for(i=0; i<numeros.length; i++){
			System.out.printf("Introduzca numero %d: ", i+1);
			numeros[i] = teclado.nextInt();
		}

		for(i=0; i<numeros.length; i++){
			System.out.println(numeros[i]);	
		}
	}
}