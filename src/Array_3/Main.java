package Array_3;

public class Main {
    public static  void main(String[] args){
        //1. Given an array, return its minimum value
//        int array[] = {1,2,3,0,4};
//        System.out.println(getMin(array));

        //2. Given an array, return sum of all elements.
//        int array2[] = {1,5,2,7};
//        System.out.println(getSum(array2));

        //3. Given an array, and two indices i and j. Swap the element at position i and element at position j.
//        int array3[] = {1,1,4,5,1,4};
//        swap(array3, 0, 5);
//        for(int i = 0; i < array3.length; i++){
//            System.out.print(array3[i] + " ");
//        }

        //4. Given an array, reverse all its elements.
//        int array4[] = {1,1,4,5,1,4};
//        for(int i = 0; i < array4.length; i++){
//            System.out.print(array4[i] + " ");
//        }
//        reverse(array4);
//
//        System.out.println();
//
//        for(int i = 0; i < array4.length; i++){
//            System.out.print(array4[i] + " ");
//        }

        //5. Given a two-dimensional array, calculate the sum of all its elements
        int[][] array5 = {{1,1}, {4,5}, {1,4}};
        System.out.println(getTwoDsum(array5));
        
    }

    public static int getMin(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }

        int n = array[0];
        for(int i = 0; i <= array.length - 1; i++){
            if(n >= array[i]) {
                n = array[i];
            }else {
                continue;
            }
        }
        return n;
    }

    public static int getSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void reverse(int[] array){
        int head = 0;
        int tail = array.length - 1;
        while (head < tail){
            swap(array, head, tail);
            head ++;
            tail --;
        }
    }

    public static int getTwoDsum(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
}
