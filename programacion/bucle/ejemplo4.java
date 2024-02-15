import java.util.Scanner;
class ejemplo4{
	public static void main(String[] args){
		int MES;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("dime el numero de un mes: ");
		MES = sc.nextInt();
	
		switch (MES)
			case 1:
				System.out.print("Enero");
			case 2:
				System.out.print("Febrero");
			case 3:
				System.out.print("Marzo");
			case 4:
				System.out.print("Abril");
			case 5:
				System.out.print("Mayo");
			case 6:
				System.out.print("Junio");
			case 7:
				System.out.print("Julio");
			case 8:
				System.out.print("Agosto");
			case 9:
				System.out.print("Septiembre");
			case 10:
				System.out.print("Octubre");
			case 11:
				System.out.print("Noviembre");
			case 12:
				System.out.print("Diciembre");
	}
}