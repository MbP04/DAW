import java.util.Scanner;
class ejercicio4 {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=== Insectos === ");
		System.out.println(" ");		
		//Le pedimos al usuario que nos ponga el numero de insectos
		int insec;
		System.out.print("Introduce numero de Insectos: ");
		insec = sc.nextInt();
		System.out.println("Tenemos: "+insec+" insectos");
		//Calculamos las patas del insecto, y lo muestro por pantalla
		int totin = (insec*6);
		System.out.println("Hay "+totin+" patas de insectos");
		
		
		System.out.println(" ");
		
		
		System.out.println("=== Aracnidos === ");
		System.out.println(" ");		
		//Le pedimos al usuario que nos ponga el numero de aracnidos y lo muestro por pantalla
		int arac;
		System.out.print("Introduce numero de Aracnidos: ");
		arac = sc.nextInt();
		System.out.println("Tenemos: "+arac+" aracnidos");
		//Calculamos las patas de los aracnidos, y lo muestro por pantalla
		int totara = (arac*8);
		System.out.println("Hay "+totara+" patas de aracnidos");
		
		
		System.out.println(" ");
		
		
		System.out.println("=== Crustaceos === ");
		System.out.println(" ");		
		//Le pedimos al usuario que nos ponga el numero de crustaceos y lo muestro por pantalla
		int crusta;
		System.out.print("Introduce numero de Crustaceos: ");
		crusta = sc.nextInt();
		System.out.println("Tenemos: "+crusta+" crustaceos");
		//Calculamos las patas de los crustaceos, y lo muestro por pantalla
		int totcrusta = (crusta*10);
		System.out.println("Hay "+totcrusta+" patas de crustaceos");
		
		
		System.out.println(" ");
		
		
		System.out.println("=== Cienpies === ");
		System.out.println(" ");		
		//Le pedimos al usuario que nos ponga el numero de cienpies y lo muestro por pantalla
		int cienp;
		System.out.print("Introduce numero de Cienpies: ");
		cienp = sc.nextInt();
		System.out.println("Tenemos: "+cienp+" cienpies");
		//Le pedimos al usuarios que nos ponga los segmentos de cada cienpies, y lo muestro por pantalla
		int cienpiseg;
		System.out.print("Introduce los segmentos de cada Cienpies: ");
		cienpiseg = sc.nextInt();
		System.out.println("Cada cienpie tiene "+cienpiseg+" segemento/s");
		//Calculamos las patas del cienpies, y lo muestro por pantalla
		int totcien =  cienp*2*cienpiseg;
		System.out.println("Hay "+totcien+" patas de cienpies");
		
		
		System.out.println(" ");
	
	
		System.out.println("=== Milpies === ");
		System.out.println(" ");		
		//Le pedimos al usuario que nos ponga el numero de milpies y lo muestro por pantalla
		int milp;
		System.out.print("Introduce numero de Milpies: ");
		milp = sc.nextInt();
		System.out.println("Tenemos: "+milp+" milpies");
		//Le pedimos al usuarios que nos ponga los segmentos de cada milpies, y lo muestro por pantalla
		int milpiseg;
		System.out.print("Introduce los segmentos de cada Milpies: ");
		milpiseg = sc.nextInt();
		System.out.println("Cada milpie tiene: "+milpiseg+" segmento/s");
		//Calculamos las patas del milpies, y lo muestro por pantalla		
		int totmil = milp*4*milpiseg;
		System.out.println("Hay "+totmil+" patas de cienpies");
		
		
		System.out.println(" ");
		
		
		//Finalmente calculamos el total de patas
		System.out.println("=== TOTAL === ");
		System.out.println(" ");
		
		int total = totin+totara+totcrusta+totmil+totcien;
		System.out.println("Total de patas: "+totin+" patas de insectos, "+totara+" patas de aracnidos, "+totcrusta+" patas de crustaceos "+totcien+" patas de cienpies y "+totmil+" patas de milpies = "+total+" patas");
		
		
		
		
	}
}