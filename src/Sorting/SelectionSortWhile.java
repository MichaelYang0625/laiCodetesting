package Sorting;

import java.util.Arrays;

public class SelectionSortWhile {
    public static void main(String[] args) {
        int[] array = {3,2,1,5,4,7,4,6,6,9};
        System.out.println(Arrays.toString(array));
        SelectionSortWhile ssw = new SelectionSortWhile();
        ssw.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public int[] selectionSort(int[] array){
        //corner case
        if(array == null || array.length == 0){
            return null;
        }

        //i --
        int i = 0;
        while (i < array.length - 1){ // last two elements: [i,j]; j = array.length - 1; j = i+1;
            int minIndex = i;
            int j = i+1;
            while (j < array.length){ //we need j reach the last value of the array
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
                j++;
            }
            swap(array, i, minIndex);
            i++;

        }
        return array;
    }

    public void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
