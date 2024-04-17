/**
 * KadaneAlgo
 */
public class KadaneAlgo {
    public Static int MaxSumSubArray(int[] arr){
        int maxSum=0;
        int curSum=0;

        for(int i=0; i<arr.length; i++){
            curSum =curSum +arr[i];

            if(curSum> maxSum){
                maxSum=curSum;
            }

            if(curSum < 0){
                curSum =0;
            }
        }
        return maxSum;
    }  
    


    public static int maxSumSubArray(int[] arr) {
        int maxSum = arr[0]; // Initialize maxSum to the first element of the array
        int curSum = arr[0]; // Initialize curSum to the first element of the array
    
        for (int i = 1; i < arr.length; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]); // Calculate the current sum
    
            maxSum = Math.max(maxSum, curSum); // Update maxSum if current sum is greater
    
            // If current sum becomes negative, reset it to 0
            if (curSum < 0) {
                curSum = 0;
            }
        }
    
        return maxSum;
    }
    
}

