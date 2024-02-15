import java.util.Scanner;
class ejemplo2{
	public static void main(String[] args){
		int HORA;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Dime la edad que tienes: ");
		HORA = sc.nextInt();
		
		if (HORA >= 8 && HORA <= 12){
			System.out.println("Buenos diassssssss");
		}else if (HORA >= 12 && HORA <= 21){
			System.out.println("Buenasss tardes");
		}else if (HORA >= 21 && HORA <= 7){
			System.out.println("Buenasss noches");
		}else{
			System.out.println("No existe esa hora");
	}
}
