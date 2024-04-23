package Sorting_Algo;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void insertionSort(int arr[]) {
        // [4,1,3,9,7]

            /*
         * dry run code---->first iteration:-
         * [4,1,3,9,7]
         * for(int i=1; i<arr.length; i++){
         * 
         * int ele=arr[i]; ele=1
         * int j=i-1; j=1-1=>0--> 4{element}
         * 
         * while(j>=0 && arr[j] > ele){ j>=0 && 4>1
         * arr[j+1]=arr[j]; [4,4,3,9,7]
         * j--;
         * }
         * arr[j+1]=ele; [1,4,3,9,7]
         * 
         * 
         * second iteration
         * [1,4,3,9,7]
         * for (int i=1; i<arr.length; i++){
         * int ele =arr[i]; 3
         * int j=i-1; j=2-1=1--> 4{element at 1 pos}
         * 
         * while(j>=0 && arr[j]> ele){ j>=0 && 4>3
         * arr[j+1]= arr[j]; [1,4,4,9,7]
         * j--;
         * }
         * 
         * arr[j+1]=ele [1,3,4,9,7]
         * }
         * 
         * 
         * [1,3,4,9,7] --3rd iteration
         * 
         * for(int i=1; i<arr.length; i++){
         * int ele=arr[i]; 9
         * int j=i-1; 3-1=2 --> 4{ele pos at 2}
         * 
         * while(j>=0; arr[j]>ele){ j>=0 4>9 false won't run this loop at this iteration
         * arr[j+1]=arr[j];
         * j--;
         * }
         * arr[j+1]=ele;
         * }
         * 
         */
    

        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > ele) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ele;
        }

    }
}