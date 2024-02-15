import java.util.Scanner;
class ejemplo2{
	public static void main(String[] args){
		int EDAD;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Dime la edad que tienes: ");
		EDAD = sc.nextInt();
		
		if (EDAD < 18 ){
			System.out.print("El usuario es mayor de edad");
		}else{
			System.out.print("El usuario no es mayor de edad");
		}
	}
}
