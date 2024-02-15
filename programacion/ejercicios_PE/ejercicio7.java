import java.util.Scanner;
class ejercicio7{
	public static void main(String[] args){
		int opc;
		int num = (int) (Math.random()*3+1);
		Scanner sc = new Scanner(System.in);
		System.out.println("===== BIENVENIDO AL PIEDRA, PAPEL O TIJERAS ===== ");
		System.out.println("Elije un de estas opciones con el 1,2 o 3 de tu teclado: ");
		System.out.println("1  Piedra");
		System.out.println("2  Papel");
		System.out.println("3  Tijeras");
		System.out.println("4  Lagarto");
		System.out.println("5  Spock");
		
		System.out.print("Opcion del usuario: ");
		opc = sc.nextInt();	
		
		if (opc == 1){
			System.out.println("Has elejido piedra");
		}else if (opc == 2){
			System.out.println("Has elejido papel");
		}else if (opc == 3){
			System.out.println("Has elejido tijeras");
		}else if (opc == 4){
			System.out.println("Has elejido lagarto");
		}else if (opc == 5){
			System.out.println("Has elejido ");
		}else{			
			System.out.println("La opcion que has puesto no es la correcta");
		}
	
		if (num == 1){
			System.out.println("La maquina a elegido piedra");
		}else if (num == 2){
			
			System.out.println("La maquina a elegido papel");
		}else if (num == 3){
			System.out.println("La maquina a elegido tijeras");
		}
		
		if (opc == num){
			System.out.println("Habeis quedado empate");
		}else if (opc == 1 && num == 2){
			System.out.println("El usuario a perdido");
		}else if (opc == 1 && num == 3){
			System.out.println("El usuario a ganado");
		}else if (opc == 2 && num == 1){
			System.out.println("El usuario a ganado");
		}else if (opc == 2 && num == 3){
			System.out.println("El usuario a perdido");
		}
	}
}