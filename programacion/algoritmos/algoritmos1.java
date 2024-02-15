import java.util.Scanner;
class algoritmos1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num1;		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		int num2;		
		System.out.print("Introduce un numero: ");
		num2 = sc.nextInt();
		
		int num3;		
		System.out.print("Introduce un numero: ");
		num3 = sc.nextInt();
		
		if (num1 == num2){
			System.out.println(num1+" y "+num2 +" son iguales");
		}else if (num1 == num3){
			System.out.println(num1+" y "+num2+" son iguales");
		}else if (num2 == num3){
			System.out.println(num2+" y "+num3+" son iguales");
		}	
		
		
		if ( num1 <= num2 &&  num1 <= num3){
			if ( num2 <= num3){
				System.out.println("El numero mas pequeno es: "+num1);
				System.out.println("El numero mediano es: "+num2);
				System.out.println("El numero mas alto es: "+num3);
			
			}else{
				System.out.println("El numero mas pequeno es: "+num1);
				System.out.println("El numero mediano es: "+num3);
				System.out.println("El numero ms alto es: "+num2);
			}			
		}
		if ( num2 <= num1 &&  num2 <= num3){
			if ( num1 < num3){
				System.out.println("El numero mas pequeno es: "+num2);
				System.out.println("El numero mediano es: "+num1);
				System.out.println("El numero mas alto es: "+num3);
			
			}else{
				System.out.println("El numero mas pequeno es: "+num2);
				System.out.println("El numero mediano es: "+num3);
				System.out.println("El numero ms alto es: "+num1);
			}
		}
		
		if ( num3 <= num1 &&  num3 <= num2){
			if ( num1 <= num2){
				System.out.println("El numero mas pequeno es: "+num3);
				System.out.println("El numero mediano es: "+num1);
				System.out.println("El numero mas alto es: "+num2);
			
			}else{
				System.out.println("El numero mas pequeno es: "+num3);
				System.out.println("El numero mediano es: "+num2);
				System.out.println("El numero ms alto es: "+num1);
			}
		}
	}
}