package Sorting_Algo;

/**
 * MergeSort
 * 
 *
 */

 
public class MergeSort {
    public static void merge(int[] arr, int mid, int left, int right){

    /**
     * how to find the each lenght of the array
     * [3,4,5] = left{5} mid{7} ==> arr1[7-5+1]=>3 will be the length of the arr1
     * [7,8]=> right{9 cox in the left (5-7 already defined)} arr2[9-7]=> 2 will be the len of arr2 
     */
       int[] arr1 =new int[mid-left+1]; 
       int[] arr2=new int[right-mid];

       int k=0;
       for(int i=left; i<=mid; i++){
        arr1[k]=arr[k];
        k++;
       }

       k=0;
       for(int i=mid+1; i<=right; i++){
        arr2[k]=arr[k];
        k++;
       }

       int i=0;
       int j=0;
       int f=left;
       
       while(i<arr1.length && j<arr2.length){
        if(arr1[i] <arr2[j]){
            arr[f]=arr1[i];
            i++;
        }else{
            arr[f]=arr2[j];
            j++;
        }
        f++;
       }
// left over values in the arr
       while(i<arr1.length){
        arr[f]=arr1[i];
        i++;
        f++;
    }
   
        while(j<arr2.length){
            arr[f]=arr2[j];
            j++;
            f++;
        }
    }

   public static void mergeSort(int arr[],int right, int left){
          if(left<right){
            int mid =(left+right)/2;
             mergeSort(arr,left,mid);
             mergeSort(arr,mid+1,right);
             merge(arr,left,mid,right);
         }
        }
    
}