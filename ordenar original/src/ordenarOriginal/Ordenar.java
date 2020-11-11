/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarOriginal;

import java.util.Random;
import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;

/**
 *
 * @author lucca
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void randomize(int[] array) {
        // Rand
        Random rand = new Random(1);

        // Inicializa o vetor
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public static void printVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void main(String[] args) {
        // Variável
        int[] array = new int[20];

        // Deixa randomico o array
        randomize(array);

        // Cria o arraylist e adiciona os algoritmos
        ArrayList<Sortable> algoritmos = new ArrayList<>();
        algoritmos.add(new InsertionSort());
        //algoritmos.add(new SelectionSort());
        //algoritmos.add(new BubbleSort());
        //algoritmos.add(new MergeSort());
        //algoritmos.add(new QuickSort());
        //algoritmos.add(new HeapSort());
        //algoritmos.add(new CountSort());
        //algoritmos.add(new RadixSort());

        for (int i = 0; i < algoritmos.size(); i++) {
            //printVetor(array);
            //Instant start = Instant.now();            
            algoritmos.get(i).sort(array);
            //Instant finish = Instant.now();            
            //long tempoFinal = Duration.between(start, finish).toMillis();
            System.out.println(algoritmos.get(i).toString() + ":");
            //System.out.println("Tempo: " + tempoFinal + "ms");
            printVetor(array);
            //randomize(array);
        }
    }
}
