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
public class MergeSort implements Sortable{    
        int[] arrayAux;
    
   public String toString() {
       return "MergeSort";
   }
    
    public void sort(int[] array) {
        arrayAux = new int[array.length];
        mergesort(array, 0, array.length-1);        
    }
    
    public void mergesort(int[] array, int p, int r) {
        int q;
        if(p < r) {
            q = (p + r) / 2;
            mergesort(array, p, q);
            mergesort(array, q+1, r);
            intercala(array, p, q, r);
        }
    }
    
     public void intercala(int[] array, int p, int q, int r) {        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(i = p; i <= q; i++) {
            arrayAux[i] = array[i]; 
        }
        
        for(j = q+1 ; j <= r; j++) {
            arrayAux[r+q+1-j] = array[j];
        }
        
        i = p;
        j = r;
        
        for(k = p; k <= r; k++) {
            //System.out.println("comp");            
            if(arrayAux[i] >= arrayAux[j]) {
                array[k] = arrayAux[i];
                i = i+1;
            } else {
               array[k] = arrayAux[j];
               j = j -1;
            }
        }
    }
}
