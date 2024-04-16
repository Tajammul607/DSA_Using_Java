package Arrays;

/**
 * lastOccurance
 */
public class lastOccurance {

       // public static int lastOccurance(int arr[], int target){
       
    //   for(int i= arr.length-1; i>0; i--){
    //       if(arr[i] == target){
    //           return i;
    //       }
    //   }
        
    //     return -1;
    // }
    public static int lastOccurance(int arr[], int target){
       
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>0;j--){
            if(arr[j] == target){
                return j;
            }
            }
        }
         
         return -1;
     }
}