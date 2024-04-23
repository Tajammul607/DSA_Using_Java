public class SelectionSort {

    /*
    selection sort : is one of the algo to sort the element
    step-1:--> in the unsorted array will min the min value and placed it into sorted array 
               an the remining ele are placed in the unsorted array
               
    selection sort can be done using extra space with O(n^2)
    
     */
    public static int select(int arr[], int i){
        int minValue= arr[i];
        int index=i;

        for(int j=i+1; j<arr.length-1; j++){
            if(arr[j]< minValue){
                minValue=arr[j];
                index=j;
            } 
        }

        return index;
    }

    public static int selectionSort(int arr[], int n){

        for(int i=0; i<arr.length; i++){
            int index=select(arr, i);// this function is used to get the min element
            int temp= arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
