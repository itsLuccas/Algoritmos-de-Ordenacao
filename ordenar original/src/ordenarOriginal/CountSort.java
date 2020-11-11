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
public class CountSort implements Sortable{
    public void sort(int[] array) {
        countSort(array);
    }
   
    public void countSort(int[] array) {
        int maior =  encontraMaior(array); 
        int[] count = new int[maior+1];
        
        for(int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
        }
        
        int index = 0;
        
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                array[index] = i;
                index++;
                count[i]--;
            }
        }
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
    
    public String toString() {
        return "CountSort";
    }
}
