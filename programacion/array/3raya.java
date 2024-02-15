//import java.util.Random;
import java.util.Scanner;

class ejercicio3raya  {	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = 3;
        int colum = 3;
        int c1,c2,c3;
        int c,f;
        int colmaq,filmaq;
        boolean continuar = true;
        
        char [][] tabla = new char [fila][colum];

        while (continuar){
            boolean pasasUsu = true;
            boolean pasasMaq = true;
            
            //Muestro la tabla
            for (c1 = 0;c1<fila; c1++){
                for (c2 = 0;c2<colum; c2++){
                    if (tabla[c1][c2] == 'X' || tabla[c1][c2] == 'O') { 
                        System.out.print("  |"+tabla[c1][c2]+"|");
                    }else{
                        System.out.print("  | |");
                    }
                }
                System.out.println(" ");
            }
            
            //Horizontal gana jugador
            if (tabla [0][0] == 'X' &&  tabla [0][1] == 'X' && tabla [0][2] == 'X' || tabla [1][0] == 'X' &&  tabla [1][1] == 'X' && tabla [1][2] == 'X' || tabla [2][0] == 'X' &&  tabla [2][1] == 'X' && tabla [2][2] == 'X' ){
                System.out.println("HAS GANADO");
                continuar = false;
            //Vertical gana jugador
            }else if (tabla [0][0] == 'X' &&  tabla [1][0] == 'X' && tabla [2][0] == 'X' || tabla [0][1] == 'X' &&  tabla [1][1] == 'X' && tabla [2][1] == 'X' || tabla [0][2] == 'X' &&  tabla [1][2] == 'X' && tabla [2][2] == 'X' ){
                System.out.println("HAS GANADO");
                continuar = false;
            //Diagonal gana jugador
            }else if (tabla [0][0] == 'X' &&  tabla [1][1] == 'X' && tabla [2][2] == 'X' || tabla [0][2] == 'X' &&  tabla [1][1] == 'X' && tabla [2][0] == 'X'){
                System.out.println("HAS GANADO");
                continuar = false;
            //Horizontal gana maquina
            }else if (tabla [0][0] == 'O' &&  tabla [0][1] == 'O' && tabla [0][2] == 'O' || tabla [1][0] == 'O' &&  tabla [1][1] == 'O' && tabla [1][2] == 'O' || tabla [2][0] == 'O' &&  tabla [2][1] == 'O' && tabla [2][2] == 'O' ){
                System.out.println("HA GANADO LA MAQUINA :(");
                continuar = false;
            //Vertical gana maquina
            }else if (tabla [0][0] == 'O' &&  tabla [1][0] == 'O' && tabla [2][0] == 'O' || tabla [0][1] == 'O' &&  tabla [1][1] == 'O' && tabla [2][1] == 'O' || tabla [0][2] == 'O' &&  tabla [1][2] == 'O' && tabla [2][2] == 'O' ){
                System.out.println("HA GANADO LA MAQUINA :(");
                continuar = false;
            //Diagonal gana maquina
            }else if (tabla [0][0] == 'O' &&  tabla [1][1] == 'O' && tabla [2][2] == 'O' || tabla [0][2] == 'O' &&  tabla [1][1] == 'O' && tabla [2][0] == 'O'){
                System.out.println("HA GANADO LA MAQUINA :(");
                continuar = false;
            }else{
                System.out.print("Dime la fila que quieres (0-2): ");
                f = sc.nextInt();
                System.out.print("Dime la columna que quieres (0-2): ");
                c = sc.nextInt();
                while (pasasUsu){
                    if (tabla [f][c] == 'X' || tabla [f][c] == 'O'){
                        System.out.println("Esa casilla ya esta usada");
                        System.out.print("Dime la fila que quieres (0-2): ");
                        f = sc.nextInt();
                        System.out.print("Dime la columna que quieres (0-2): ");
                        c = sc.nextInt();
                    
                    }else{
                        pasasUsu = false;
                        //MOVIMIENTOS JUGADOR
                        if (f == 0 && c == 0){
                            tabla [0][0] = 'X';
                        }else if (f == 0 && c == 1){
                            tabla [0][1] = 'X';
                        }else if (f == 0 && c == 2){
                            tabla [0][2] = 'X';
                        }else if (f == 1 && c == 0){
                            tabla [1][0] = 'X';
                        }else if (f == 1 && c == 1){
                            tabla [1][1] = 'X';
                        }else if (f == 1 && c == 2){
                            tabla [1][2] = 'X';
                        }else if (f == 2 && c == 0){
                            tabla [2][0] = 'X';
                        }else if (f == 2 && c == 1){
                            tabla [2][1] = 'X';
                        }else if (f == 2 && c == 2){
                            tabla [2][2] = 'X';
                        }
                    }
                }
                while (pasasMaq){
                    //MOVIMIENTOS MAQUINA
                    //Jugadas de la maquina
                    colmaq=(int) (Math.random()*2+1);
                    filmaq = (int) (Math.random()*2+1);
                    if (tabla [filmaq][colmaq] == 'X' || tabla [filmaq][colmaq] == 'O'){
                        
                    }else{
                        pasasMaq = false;
                        if (filmaq == 0 && colmaq == 0){
                            tabla [0][0] = 'O';
                        }else if (filmaq == 0 && colmaq == 1){
                            tabla [0][1] = 'O';
                        }else if (filmaq == 0 && colmaq == 2){
                            tabla [0][2] = 'O';
                        }else if (filmaq == 1 && colmaq == 0){
                            tabla [1][0] = 'O';
                        }else if (filmaq == 1 && colmaq == 1){
                            tabla [1][1] = 'O';
                        }else if (filmaq == 1 && colmaq == 2){
                            tabla [1][2] = 'O';
                        }else if (filmaq == 2 && colmaq == 0){
                            tabla [2][0] = 'O';
                        }else if (filmaq == 2 && colmaq == 1){
                            tabla [2][1] = 'O';
                        }else if (filmaq == 2 && colmaq == 2){
                            tabla [2][2] = 'O';
                        }
                    }
                }

            }
        }
    }
}