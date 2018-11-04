/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithms;

/**
 *
 * @author juanh
 */
public class HeapSort {
    private void heapify (int array[], int n){
        int i, k, aux;
        boolean band;
        for(i=2;i<=n;i++){
            k = i;
            band = true;
            while (k>1 && band) {
                band = false;
                if (array[k]>array[(k/2)]){
                    aux = array[(k/2)];
                    array[(k/2)]= array[k];
                    array[k]= aux;
                    k = (k/2);
                    band = true;
                }
            }
        }
    }
    
}
