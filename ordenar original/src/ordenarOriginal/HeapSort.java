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
public class HeapSort implements Sortable{
    public void sort(int [] array) {
        int k = 5;
        heapsort(array, array.length, k);
    }
    
    public String toString() {
        return "HeapSort";
    }
    
    public void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
    
    public void heapsort(int [] array, int tamanho, int k) {
        criaheap(array, tamanho);
        int fim = tamanho - 1;
        while(fim>tamanho-(k+1)) {
            swap(array, 0, fim);
            fim--;
            arrumaheap(array, 0, fim);
        }
    }
    
    public void criaheap (int [] array, int tamanho) {
        int inicio = (tamanho-2)/2;
        while(inicio>=0) {
            arrumaheap(array, inicio, tamanho-1);
            inicio = inicio - 1;
        }
    }
    
    public void arrumaheap(int[] array, int inicio, int fim) {
        int raiz = inicio; 
        while(raiz * 2 + 1 <= fim) {
            int filho = raiz * 2 + 1;
            int trocar = raiz; 
            
            if(array[trocar] > array[filho]){
                trocar = filho;
            }
            
            if(filho+1 <= fim && array[trocar] > array[filho+1]){
                trocar = filho + 1;
            }
            
            if(trocar == raiz){
                raiz = fim + 1;
            } else {
                swap(array, raiz, trocar);
                raiz = trocar;
            }
        }
    }
    
    /*public void heapsort(int [] array, int tamanho) {
        criaheap(array, tamanho);
        int fim = tamanho - 1;
        while(fim>0) {
            swap(array, 0, fim);
            fim--;
            arrumaheap(array, 0, fim);
        }
    }
    
    public void criaheap (int [] array, int tamanho) {
        int inicio = (tamanho-2)/2;
        while(inicio>=0) {
            arrumaheap(array, inicio, tamanho-1);
            inicio = inicio - 1;
        }
    }
    
    public void arrumaheap(int[] array, int inicio, int fim) {
        int raiz = inicio; 
        while(raiz * 2 + 1 <= fim) {
            int filho = raiz * 2 + 1;
            int trocar = raiz; 
            
            if(array[trocar] < array[filho]){
                trocar = filho;
            }
            
            if(filho+1 <= fim && array[trocar] < array[filho+1]){
                trocar = filho + 1;
            }
            
            if(trocar == raiz){
                raiz = fim + 1;
            } else {
                swap(array, raiz, trocar);
                raiz = trocar;
            }
        }
    }*/
}
