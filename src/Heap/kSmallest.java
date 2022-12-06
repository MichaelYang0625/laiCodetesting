package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kSmallest {
    public int[] kSmallestMethodI(int[] array, int k) {
        //corner case:
        if(array == null || array.length == 0 || k == 0) {
            return new int[0];
        }

        //make up a MaxHeap:
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)) {
                    return 0;
                }
                return o1 > o2 ? -1 : 1; //this is a maxHeap
            }
        });


        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                maxHeap.offer(array[i]);            //put first k elements of the array into the maxHeap
            }else if (array[i] < maxHeap.peek()) {  //If the element is bigger than the biggest element in maxHeap: update
                maxHeap.poll();                       //remove old biggest
                maxHeap.offer(array[i]);              //offer new biggest
            }
        }


        int[] result = new int[k];
        for (int i = k-1; i >= 0; i--) {
            result[i] = maxHeap.poll();
        }
        return result;
    }

    //Method2: Use minHeap
    public int[] kSmallestMethodII(int[] array, int k) {
        //corner case
        if(array == null || array.length == 0 || k == 0) {
            return new int[0];
        }

        //make up a MinHeap:
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)) {
                    return 0;
                }
                return o1 < o2 ? -1 : 1;
            }
        });

        for (int i = 0; i < array.length; i++) {
            minHeap.offer(array[i]);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }

}
