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
public class BubbleSort implements Sortable{    
    public void inverter(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;       
        
    }
    
    public String toString() {
        return "BubbleSort";
    }
    
    public void sort(int[] array) {
        int n = array.length;
        boolean invertido;        
        do {
            invertido = false;
            for(int i = 1; i < n; i++) {
                if(array[i-1] > array[i]) {
                    inverter(array, i-1, i);
                    invertido = true;                    
                }
            }            
        }while(invertido == true);
    }
}
    
