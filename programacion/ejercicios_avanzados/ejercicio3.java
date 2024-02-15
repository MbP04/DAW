import java.util.Scanner;
class ejercicio3 {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("Introduce numero de variable para a: ");
		a = sc.nextInt();
		System.out.println(a);
		
		int b;
		System.out.print("Introduce numero de variable para b: ");
		b = sc.nextInt();
		System.out.println(b);	
		
		int c;
		System.out.print("Introduce numero de variable para c: ");
		c = sc.nextInt();
		System.out.println(c);	
		
		double raiz = Math.sqrt((b*b)-4*a*c);
		
		double tot1 = (-b+raiz) / (2*a);
		double tot2 = (-b-raiz) / (2*a);
		System.out.println("Resultado 1: "+tot1);		
		System.out.println("Resultado 2: "+tot2);


	}
}