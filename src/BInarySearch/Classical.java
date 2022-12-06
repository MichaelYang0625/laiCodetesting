package BInarySearch;

public class Classical {
    public static void main(String[] args) {
        int[] arrayToSearch = new int[] {1,2,2,2,3,4};
        int t = 3;  //looking for "3", index should be 4
        Classical classical = new Classical();
        System.out.println(classical.binarySearch(arrayToSearch, t));
    }

    public int binarySearch(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == target){
                return mid;
            } else if (array[mid] > target) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
