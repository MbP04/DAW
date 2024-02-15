import java.util.Scanner;
public class reto_116 {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int c=0;
		if (num == 0){
			System.out.print("");
		}else{
			while (true){
				c++;
				System.out.println("Hola mundo.");
				if (c==num) {break;}
			}		
		}
	}	
}