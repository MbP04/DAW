import java.util.Scanner;

class ejercicio5 {	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int huevca;
		System.out.print("Introduce numero de huevos maximos en la cazuela: ");
		huevca = sc.nextInt();
		System.out.println("Tenemos un maximo de "+huevca+" huevos en la cazuela");
		
		int huevos;
		System.out.print("Introduce numero de huevos que vas a comer: ");
		huevos = sc.nextInt();
		System.out.println("Tenemos: "+huevos+" huevos para comer");	
		
		if (huevca < huevos){
			int caz = huevos / huevca;
			int tiempo = caz * 10;
			System.out.println("Tardaras "+tiempo+" min en "+caz+" cazuelas");
			
		}else{
			System.out.println("En 10 minutos los tienes cocidos en 1 cazuela");
		}		
	}
}