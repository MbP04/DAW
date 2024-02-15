import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bicicleta bici = new bicicleta();
        coche coch = new coche();
        //vehiculo veh = new vehiculo();
        boolean i = true;
        int opc;
        System.out.println("\033[H\033[2J");
        while (i) {
            System.out.println("VEHICULOS");
            System.out.println("===========");
            System.out.println("1.Anda en bicicleta");
            System.out.println("2.Anda en coche");
            System.out.println("3.Ver kilometraje de la bicicleta");
            System.out.println("4.Ver kilometraje del coche");
            System.out.println("5.Ver kilometraje total");
            System.out.println("6.Ver vehiculos totales");
            System.out.println("7.Salir");
            System.out.println("Elige una opcion (1-7)");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    bici.and(50);                      
                    break;
                case 2:
                    coch.and(100);
                    break;
                case 3:
                    System.out.println("Km Totales [BICI]: " + bici.getKilometrosRecorridos());
                    break;
                case 4:
                    System.out.println("Km Totales [COCHE]: " + coch.getKilometrosRecorridos());
                    break;
                case 5:
                    System.out.println("Km Totales [BICI-COCHE]: " + vehiculo.kilometrosTotales);
                    break;
                case 6:
                    System.out.println("Vehiculos creados [BICI-COCHE]: " + vehiculo.vehiculosCreados);
                    break;
                case 7:
                    i = false;
                    break;
                default:
                    System.out.println("No has puesto la opcion correcta");
                    break;
            }
        }
    }
}
