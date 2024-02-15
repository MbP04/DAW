import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class queue {
    public static void main(String[] args) {
        Queue<String> diaSemana = new LinkedList<String>();
        Queue<Integer> numeros = new LinkedList<Integer>();
        String dia;
        Integer numero;
        
        diaSemana.add ("Lunes");
        diaSemana.add ("Martes");
        diaSemana.add ("Miercoles");
        diaSemana.add ("Jueves");
        diaSemana.add ("Viernes");
        diaSemana.add ("Sabado");
        diaSemana.add ("Domingo");

        for (int i = 1; i <= 10;i++){
            numeros.add(i);
        }

        System.out.println("Iteramos con Iterator");
        Iterator<String> itq = diaSemana.iterator();
        while (itq.hasNext()){
            System.out.println(itq.next());
        }
        System.out.println("Iteramos con foreach");
        for (Integer num : numeros){
            System.out.println(num);
        }
        dia=diaSemana.peek();
        numero=numeros.peek();
        System.out.printf("El perimer día de la semana es el %s\n", dia);
        System.out.printf("El perimer numero de la cola es el %s\n", numero);

    }
}
