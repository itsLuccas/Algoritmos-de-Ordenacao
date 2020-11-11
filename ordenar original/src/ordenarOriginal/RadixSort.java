/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarOriginal;

import java.util.ArrayList;

/**
 *
 * @author lucca
 */
public class RadixSort implements Sortable {

    public void sort(int[] array) {
        int maior = encontraMaior(array);
        ArrayList<ArrayList<Integer>> bucket = criaBucket();

        for (int numcasas = 1; maior / numcasas > 0; numcasas *= 10) {
            for (int i = 0; i < array.length; i++) {
                int digitoAtual = (array[i] / numcasas) % 10;
                bucket.get(digitoAtual).add(array[i]);
            }
            int pos = 0;
            for (ArrayList lista : bucket) {
                for (int i = 0; i < lista.size(); i++) {
                    array[pos] = (int) lista.get(i);
                    pos++;
                }
                lista.clear();
            }
        }
    }

    public String toString() {
        return "RadixSort";
    }

    public ArrayList<ArrayList<Integer>> criaBucket() {
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {
            bucket.add(new ArrayList<>());
        }
        return bucket;
    }

    public int encontraMaior(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /*
    public void radixsort(int[] array) {
        int maior = encontraMaior(array);
        ArrayList[] bucket = new ArrayList[10];
        
        for(int i = 0; i < bucket.length; i++) {
            ArrayList <Integer> lista = new ArrayList<>();
            bucket[i] = lista;
        }
        
        for(int i = 1; i <= Integer.toString(maior).length(); i++) {
            for(int j = 0; j < array.length; j++) {
                int digitoAtual = (array[j]/10)%10;
                bucket[j].add(array[j]);
            }
        }
    }
    
    public int checaProximoDigito(int i) {
        
    }
    
    public int encontraMaior(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
     */
}
