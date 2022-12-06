package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] one = {1,2,3};
        int[] two = {4,5,6};
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        int[] merged = mergeTwoSortedArrays.merge(one, two);
        System.out.println(Arrays.toString(merged));
    }


    //谁小移谁
    public int[] merge(int[] one, int[] two){
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
