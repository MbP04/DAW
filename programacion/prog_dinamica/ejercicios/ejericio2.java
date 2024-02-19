import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class ejericio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cli_cont = 0;
        int cli_orden = 1;
        int menu = 1;
        String nom;
        //String clien;
        Queue<String> clientes = new LinkedList<String>();
        do{
            System.out.println("1. Nuevo cliente ha entrado");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Mostrar cola actual");
            System.out.println("0. Salir");
            System.out.print("Introduce un numero: ");
		    num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 0:
                    menu = 0;
                    break;
                case 1:
                    System.out.print("Nombre del cliente:");
                    nom = sc.nextLine();
                    clientes.add(nom);
                    System.out.println("Hay "+cli_cont+" clientes por delante");
                    cli_cont++;
                    break;
                case 2:
                    System.out.println("Es atendido "+clientes.peek());
                    clientes.poll();
                    cli_cont--;
                    break;
                case 3:
                    System.out.println("======= CLIENTES ======");
                    Iterator<String> itq = clientes.iterator();
                    cli_orden = 1;
                    while (itq.hasNext()) {
                        System.out.println(cli_orden+". "+itq.next());
                        cli_orden++;
                    }
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("No has elegido ninguna opcion");
                    break;
            }
        }while (menu == 1);
    }
}