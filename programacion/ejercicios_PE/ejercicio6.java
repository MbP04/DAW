import java.util.Scanner;
class ejercicio6{
	public static void main(String[] args){		
		int hora;
		int dia;
		int dia2;
		int hora2;
		int horasTranscurridas = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primera hora ");
		System.out.print("dia: ");
		dia = sc.nextInt();
		System.out.print("hora: ");
		hora = sc.nextInt();
		
		System.out.println("Introduce segunda hora ");
		System.out.print("dia: ");
		dia2 = sc.nextInt();
		System.out.print("hora: ");
		hora2 = sc.nextInt();
		
		if (dia2 < 7 && dia2>=1  && dia < 7 && dia>=1 || dia2 > dia){
			if (hora<=23 || hora>=0 && hora2<=23 || hora2>=0){
				if (dia == dia2) {
				    horasTranscurridas = hora2 - hora;
				}else{
				    horasTranscurridas = (dia2 - dia - 1) * 24 + (24 - hora) + hora2;
				}
				System.out.println("Horas transcurridas ente las "+hora+":00 del dia "+dia+" y las "+hora2+":00 del dia "+dia2+" son: "+ horasTranscurridas + " horas.");
				
			}else{
			System.out.println("No has puesto alguna hora bien");
			}				
		}else{
			System.out.println("No has puesto el dia bien");
		}		
	}
}