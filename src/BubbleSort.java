public class BubbleSort {
    void bubbleSort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {89, 76, 34, 45};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
    }
}
