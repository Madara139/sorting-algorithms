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
public class QuickSort {
    private int partition (int array [], int low, int high) {
        int i = (low-1);
        int pivot = array[high];
        int j, aux;
        for (j=low;j<high;j++){
            if (array[j]<=pivot){
                i++;
                aux = array [i];
                array[i]= array[j];
                array[j]= aux;
            }
        }
        aux = array [i+1];
        array[i+1]=array[high];
        array[high]=aux;
        return (i+1);
    }
    public void quicksort (int array [], int low, int high){
        if (low<high) {
            int p = partition (array, low, high);
            quicksort(array, low, p-1);
            quicksort(array, p+1, high);
        }
    }
}
