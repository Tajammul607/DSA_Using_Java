// import java.util.Arrays;

// public class twopointer {

//     public static int[] findTwoSum(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left < right) {
//             int sum = nums[left] + nums[right];
//             if (sum == target) {
//                 return new int[]{left, right}; // Found the indices of the two numbers
//             } else if (sum < target) {
//                 left++; // Move the left pointer to increase the sum
//             } else {
//                 right--; // Move the right pointer to decrease the sum
//             }
//         }

//         // If no such pair found
//         return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] indices = findTwoSum(nums, target);
//         if (indices[0] != -1) {
//             System.out.println("Indices of the two numbers: " + indices[0] + ", " + indices[1]);
//             System.out.println("Numbers: " + nums[indices[0]] + ", " + nums[indices[1]]);
//         } else {
//             System.out.println("No such pair found.");
//         }
//     }
// }


/**
 *   Two pointer is used  to iterate the whole array in a single iteration
 * type of problems can solve using this 
 *     Reverse and array
 *     palindrome
 *     pair of elements in the sorted array
 * 
 */

 /**
  * twopointer
  */
 public class twopointer {
 
    public static int[] towPointer(int[] arr, int target){
        Array.sort(arr);
        int start=0;
        int end=arr.length-1;

        while (start < end) {
            if(arr[start] +arr[end]== target){
                return new int{start, end}
            }
            if(arr[start]+arr[end] < target){
                start++;
            }else{
                end--;
            }
            
        }
    }
    
    public static int[] threeSum(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            int j=i+1;
            int k=arr.length-1;
            int currentValue=target-arr[i];

            while(j<k){
                if(arr[j]+arr[k] =currentValue){
                    return new int{i,j,k}
                }
                if(arr[i]+arr[k]<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
    }

}