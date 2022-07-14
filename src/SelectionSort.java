public class SelectionSort {
    void sort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 20, 6, 9};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
    }
}
