package Sorting_Algo;

/**
 * BubbleSort
 */

   
public class BubbleSort {

    // public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr.length-i-1; j++){
               if(arr[j] > arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
        }
   
      }

      public static void bubbleSort(int[] arr){
        int i=0;
        int j=arr.length-1;

        // int[] arr={7,8,3,2,1};
        while(i<j){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];
                i++;
            }else{
                j--;
            }
        }
      }
    public static void main(String[] args) {
        int[] arr={7,8,3,2,1};
        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}