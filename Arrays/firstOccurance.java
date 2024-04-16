package Arrays;

/**
 * firstOccurance
 */
public class firstOccurance {

      // public static int firstOccurance(int[] nums,int target){    
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=0; j<nums.length; j++){
    //             if(nums[j] == target){
    //               return j;  
    //             }
    //         }
    //     }
    //     return -1;
    // }
    public static int firstOccurance(int[] nums,int target){
        
        for(int i=0; i<nums.length; i++){

                if(nums[i] == target){
                //   return nums[j];  
                return i;
                }
            
        }
        return -1;
    }
 
}