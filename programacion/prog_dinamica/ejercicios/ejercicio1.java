import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;

public class ejercicio1 {
    public static void limpia() {
        System.out.print("\033[H\033[2J");  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        boolean sigue = true;
        Stack<Integer> numeros = new Stack<Integer>();
        int tot = 0;
        do{
            limpia();
            Iterator<Integer> ital1 = numeros.iterator();
            while (ital1.hasNext()){
                System.out.println(ital1.next()); 
            }
            System.out.println("Total: "+tot);
            System.out.print(": ");
		    num = sc.nextLine();
            
            //System.out.print(tot);
            switch (num) {
                case "q":
                    sigue = false;
                    break;
                case "+":
                    tot = numeros.getLast() + tot;//numeros.get(numeros.size()-1);
                    numeros.remove(numeros.getLast());
                    //numeros.remove(numeros.get(numeros.size()-1));
                    break;
                case "-":
                    tot = tot - numeros.getLast();// numeros.get(numeros.size()-1);
                    numeros.remove(numeros.getLast());
                    //numeros.remove(numeros.get(numeros.size()-1));
                    break;
                case "*":
                    tot = numeros.getLast() * tot;// numeros.get(numeros.size()-1);
                    numeros.remove(numeros.getLast());
                    //numeros.remove(numeros.get(numeros.size()-1));
                    break;
                case "/":
                    tot = tot / numeros.getLast();//numeros.get(numeros.size()-1);
                    numeros.remove(numeros.getLast());
                    //numeros.remove(numeros.get(numeros.size()-1));
                    break;
                default:
                    int numero = Integer.parseInt(num);
                    numeros.psuh(numero);
                    break;
            }
        }while (sigue);
    }
}
