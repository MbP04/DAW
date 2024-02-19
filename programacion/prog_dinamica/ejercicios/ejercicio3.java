import java.util.Scanner;
import java.util.Stack;
public class ejercicio3 {
    public static void limpia() {
        System.out.print("\033[H\033[2J");  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        Stack<Double> numeros = new Stack<Double>();
        String num;
        double tot = 0,tot2=0;
        double num1 = 0;
        double media = 0;
        double desv = 0;
        double resultado= 0;
        do{
            limpia();
            System.out.println("La media es: "+media+"       La desviacion es: "+desv);
            System.out.print(": ");
            num = sc.nextLine(); 
            switch (num){
                case "q":
                    seguir = false;
                    break;
                default:
                    //MEDIA ESTADISTICA
                    double numero = Double.parseDouble(num);
                    numeros.push(numero);
                    num1 += numero;
                    media = num1 / numeros.size();
                    
                    //DESVIACION TÍPICA
                    tot += (numero-media); // / numeros.size();
                    resultado += Math. pow(tot, 2);
                    tot2 = resultado / numeros.size();
                    desv = Math.sqrt(tot2);
                    break;          
            }
        }while (seguir);
    }
}
