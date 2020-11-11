/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarOriginal;

/**
 *
 * @author lucca
 */
public class QuickSort implements Sortable{
    public void sort(int[] array) {
        quicksort(array, 0, array.length-1);
    }
    
    public void quicksort(int[] array, int inicio, int fim) {
        int k = 4;
        if(inicio < fim) {
            int meio = particionar(array, inicio, fim);
            quicksort(array, inicio, meio - 1);
            if(k > meio) 
                quicksort(array, meio + 1, fim);
        }
    }
    
    public int particionar(int[] array, int inicio, int fim) {
        int i = inicio + 1;
        int j = fim;
        int aux = 0;
        
        while(i <= j) {
            if(array[i] < array[inicio]) {
                i++;
            } else if(array[j] > array[inicio]) {
                j--;
            } else {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        aux = array[inicio];
        array[inicio] = array[j];
        array[j] = aux;
        return j;
    }
    
    /*public void quicksort(int[] array, int inicio, int fim) {
        if(inicio < fim) {
            int meio = particionar(array, inicio, fim);
            quicksort(array, inicio, meio - 1);
            quicksort(array, meio + 1, fim);
        }
    }
    
    public int particionar(int[] array, int inicio, int fim) {
        int i = inicio + 1;
        int j = fim;
        int aux = 0;
        
        while(i <= j) {
            if(array[i] > array[inicio]) {
                i++;
            } else if(array[j] < array[inicio]) {
                j--;
            } else {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        aux = array[inicio];
        array[inicio] = array[j];
        array[j] = aux;
        return j;
    }*/
    
    public String toString() {
        return "QuickSort";
    }
}
