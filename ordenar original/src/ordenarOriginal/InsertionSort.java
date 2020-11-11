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
public class InsertionSort implements Sortable{
    public void inverter(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;       
        
    }
    
    public String toString() {
        return "InsertionSort";
    }
    
    public void sort(int[] array) {
        int n = array.length;        
        int k = 3;
        int j = 0;
        
        for(int i = 0; i < k; i++) {
            j = i;
            while(j > 0 && array[j-1] > array[j]) {
                inverter(array, j, j-1);
                j--;
            }
        }
        int pivo = array[k];
        for(int i = k+1; i < n; i++) {
            if(array[i] < pivo) {
                inverter(array, i, k);
                j = k;
                while(j > 0 && array[j-1] > array[j]) {
                    inverter(array, j, j-1);
                    j--;
                }
                pivo = array[k];
            }
        }
    }
    
    /*
    public void sort(int[] array) {
        int n = array.length;        
        for(int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && array[j-1] > array[j]) {
                inverter(array, j, j-1);
                j--;
            }
        } 
    }*/
}
