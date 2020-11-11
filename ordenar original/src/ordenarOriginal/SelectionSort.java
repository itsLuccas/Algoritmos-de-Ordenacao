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
public class SelectionSort implements Sortable{
    public void sort(int[] array) {
        int l = 3;
        int minimo;
        int temp; 
        for(int i = 0; i < l; i++) {
            minimo = i;
            
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            temp = array[i];
            array[i] = array[minimo];
            array[minimo] = temp;
        }
    }
    /*
    public void sort(int[] array) {
        int minimo;
        int temp; 
        for(int i = 0; i < array.length; i++) {
            minimo = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            temp = array[i];
            array[i] = array[minimo];
            array[minimo] = temp;
        }
    }*/
    
    public String toString() {
        return "SelectionSort";
    }
}
