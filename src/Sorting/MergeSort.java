package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.print("Before:");
        int[] array = {5,2,7,4,1,3,8,6};
        System.out.println(Arrays.toString(array));

        System.out.print("After: ");
        MergeSort solution = new MergeSort();
        int[] sortedArray = solution.mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public int[] mergeSort(int[] array){
        //corner case
        if(array == null || array.length == 0){
            return array;
        }

        //
        return mergeSort(array, 0, array.length-1);
    }

    private int[] mergeSort(int[] array, int left, int right){
        //base case
        if(left == right){
            return new int[] {array[left]};
        }

        //subproblrm
        int mid = left + (right - left) / 2;
        int[] leftResult = mergeSort(array, left, mid);
        int[] rightResult = mergeSort(array, mid+1, right);

        //recursion rule
        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] one, int[] two){
        int[] result = new int[one.length + two.length];
        int i = 0, j = 0, k = 0;
        while(i < one.length && j < two.length){
            if(one[i] < two[j]){
                result[k] = one[i];
                i++;
            }else{
                result[k] = two[j];
                j++;
            }
            k++;
        }

        while(i < one.length){
            result[k] = one[i];
            i++;
            k++;
        }

        while(j < two.length){
            result[k] = two[j];
            j++;
            k++;
        }

        return result;
    }
}
