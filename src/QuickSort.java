class QuickSort {
    
   static void quickSort(int[] nums, int s,  int e)
    {
        //base case
        if(s>= e)
        return;

        //partition krenge
        int p = partition(nums, s, e);

        //sort left part
        quickSort(nums,s,p-1);

        //sort right part
        quickSort(nums,p+1,e);
    }

    static int partition(int[] arr, int s, int e)
    {
        int pivot = arr[s];
        int cnt = 0;
        for(int i = s+1;i<=e;i++)
        {
            if(arr[i]<=pivot)
            {
                cnt++;
            }
        }

        int pivotIndex = s+cnt;
        swap(arr, pivotIndex,s);

        //left and right part
        int i=s, j = e;
        while(i<pivotIndex && j>pivotIndex)
        {
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<pivotIndex && j>pivotIndex)
            {
                swap(arr, i, j);
            }
        }

        return pivotIndex;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] arr = { 3, 1, 4, 5, 2 };
        int n = arr.length;
 
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}
