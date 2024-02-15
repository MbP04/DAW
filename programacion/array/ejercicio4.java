import java.util.Scanner;
public class ejercicio4 {
	public static void main(String[] args){
		int [][] b = {   {1,1,1,1,1,1},
					{1,0,0,0,0,1},
					{1,0,0,0,0,1},
					{1,0,0,0,0,1},
					{1,0,0,0,0,1},
					{1,0,0,0,0,1},
					{1,0,0,0,0,1},
					{1,1,1,1,1,1}};
	
		for (int i = 0; i < b.length; i++){ 
			for (int j = 0; j < b[i].length; j++){ 
				System.out.print(b[i][j] + " ");	// Imprime elemento 
			} 
			System.out.println();	// Imprime salto de linea 
		}
	}
}