package Arrays;

/**
 * PairOfTwoNumber
 */
public class PairOfTwoNumber {

        
//     public static int[] pairOfIndex(int[] arr, int target) {
//     int[] indices = new int[2]; // Initialize array to store indices
    
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[i] + arr[j] == target) { // Check if the pair sums up to target
//                 indices[0] = i; // Store the first index
//                 indices[1] = j; // Store the second index
//                 return indices; // Return the indices array
//             }
//         }
//     }
    
//     return null; // If no such pair found, return null
// }


public static int[] pairOfIndex(int[] arr, int target){
    int[] indicies =new int[2];
    int i=0;
    int j=arr.length-1; 
    while(i<j){
        if(arr[i] + arr[j] == target){
            indicies[0]=arr[i];
            indicies[1]=arr[j];
            return indicies;
        }
        if(arr[i] + arr[j] <target){
            i++;
        }else{
            j--;
        }
    }
    return null;
}

public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
int target = 9;
int[] result = pairOfIndex(nums, target);
if (result != null) {
    System.out.println("Indices of the pair: [" + result[0] + ", " + result[1] + "]");
} else {
    System.out.println("No such pair found.");
}
}
}