import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.sound.midi.Soundbank;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> diaSemana = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        diaSemana.add("Lunes");
        diaSemana.add("Martes");
        diaSemana.add("Miercoles");
        diaSemana.add("Jueves");
        diaSemana.add("Viernes");
        diaSemana.add("Sabado");
        diaSemana.add("Domingo");
        
        for (int i=1; i<=10;i++){
            numeros.add(i);
        }
        //se elimina lo que haya en la poscion 5
        diaSemana.remove(5);
        //le añade algo a la posicion que le asignas
        diaSemana.add(3,"Juernes");

        System.out.println("Iteramos con Iterator");
        Iterator<String> ital = diaSemana.iterator();
        while (ital.hasNext()){
            System.out.println(ital.next());
        }
        Iterator<Integer> ital1 = numeros.iterator();
        while(ital1.hasNext()){
            System.out.println(ital1.next());
        }

        Collections.sort(diaSemana); //Con el .sort lo ordena alfabeticamente
        Collections.sort(numeros,Collections.reverseOrder());

        System.out.println("Iteramos con foreach");

        for (String dia : diaSemana){
            System.out.println(dia);
        }
        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
