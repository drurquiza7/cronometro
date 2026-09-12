import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] tamaños = {100, 1000, 10000, 100000};
        Cronometro cronometro = new Cronometro();
        Random random = new Random();
        System.out.println("--- PRUEBAS DE RENDIMIENTO CON ARRAYLIST Y SORT ---");

        for (int tam : tamaños){
            List<Integer> numeros = new  ArrayList<>();
            for(int i = 0; i < tam; i++){
                numeros.add(random.nextInt(1_000_000));                              
            }
            cronometro.reset();
            cronometro.empezar();
    
            Collections.sort(numeros);
    
            cronometro.finalizar();
            System.out.println("Elementos " +tam + " Tiempo demorado: " +cronometro.obtenerTiempoTranscurrido() +  " Milisegundos.");
        }
    

    }
}
