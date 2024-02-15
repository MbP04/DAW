import java.util.Scanner;
class ejercicio5{
	public static void main(String[] args){		
		int i;
		int j;
		int n;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime numero: ");
		n = sc.nextInt();
		
		if( n >= 0){
			for (i=1;i<=n;i++){
				for (j = i; j <= n; j++) {
					resultado = i + j + i * j;
					System.out.println("Par (" + i + "," + j + "): " + i + "+" + j + "+" + i + "*" + j + " vale " + resultado);
				}
				
			}	
		}else{
			System.out.println("Pon un numero positivo");
		}
	}
}