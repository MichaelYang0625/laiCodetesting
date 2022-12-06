package Sorting;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,1,8,7,6};
        System.out.println(Arrays.toString(array));
        SelectSort selectSort = new SelectSort();
        selectSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public int[] selectionSort(int[] array){
        //corner case
        if(array == null || array.length == 0){
            return array;
        }

        //select the minIndex from array and make it out of the array
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i; //
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
        }
        return array;
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
