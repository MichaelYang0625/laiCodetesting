package BInarySearch;

public class FirstOcc {
    public static void main(String[] args) {
        int[] testArray = new int[]{1,1,2,2,3};
        int t = 2; // index should be 2
        FirstOcc firstOcc = new FirstOcc();
        System.out.println(firstOcc.firstOccur(testArray, t));
    }
    public int firstOccur(int[] array, int target) {

        if(array == null || array.length == 0){
            return -1;
        }

        int left = 0;
        int right = array.length - 1;

        while(left < right - 1){
            int mid = left + (right - left)/2;

            if(target <= array[mid]){
                right = mid;
            }else{
                left = mid;
            }
        }


        if(array[left] == target){
            return left;
        }else if(array[right] == target){
            return right;
        }else{
            return -1;
        }
    }
}
