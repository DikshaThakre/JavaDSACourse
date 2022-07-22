public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 9, 16, 34, 66, 88, 92, 97};
        int target = 96;
        System.out.println(binarysearch(arr, target, 0, arr.length-1));
    }

    static int binarysearch(int[] arr, int target, int start, int end){
        if(end < start){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            return binarysearch(arr, target, mid+1, end);
        }
        return binarysearch(arr, target, start, mid-1);
    }

}
