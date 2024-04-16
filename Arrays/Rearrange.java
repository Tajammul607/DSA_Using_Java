

package Arrays;

/**
 * Rearrange
 */
public class Rearrange {

    //brute force 
    public static void RearrangeEle(int arr[]){

        // [1,2,3,4,5,6] ==> 6,1,5,2,4,3
        int newArr = new int[arr];

        int start=0;
        int end =arr.length-1;

        while (start < end) {
            if(arr[end] %2 ==0){
                newArr=arr[end];
                end--;
            }else {
                newArr = arr[start];
                start++;
            }
            
        }
    
    }
}