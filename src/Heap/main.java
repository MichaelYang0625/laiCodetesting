package Heap;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = {3,4,1,2,5};
        System.out.println("Given array is: " + Arrays.toString(array));
        System.out.println();

        //Use max heap to get k smallest elements in the array
        System.out.println("Method 1: Use maxHeap");
        kSmallest solution = new kSmallest();
        int[] result = solution.kSmallestMethodI(array, 3);
        System.out.println("The first 3 smallest elements are: " + Arrays.toString(result));
        System.out.println("TC is: O(k + (n-k)logk);  SC: O(k)");

        System.out.println();


        //Use min heap
        System.out.println("Method 2: Use minHeap");
        int[] resultMethodTwo = solution.kSmallestMethodII(array, 3);
        System.out.println("The first 3 smallest elements are: " + Arrays.toString(resultMethodTwo));
        System.out.println("TC is: O(constant*n + klogn);  SC: O(k)");
    }

}
