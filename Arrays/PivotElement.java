package Arrays;

public class PivotElement {
    /*
    [1,7,3,6,5,6] ==> find the left and right sum equal excluding the pivot index;
 
    Iterating through each index:
At index 0:
leftSum = 0
rightSum = 7 + 3 + 6 + 5 + 6 = 27
Not equal, continue to the next index.
 
At index 1:
leftSum = 1
rightSum = 3 + 6 + 5 + 6 = 20
Not equal, continue to the next index.

At index 2:
leftSum = 1 + 7 = 8
rightSum = 6 + 5 + 6 = 17
Not equal, continue to the next index.

At index 3:
leftSum = 1 + 7 + 3 = 11
rightSum = 5 + 6 = 11
Equal, return 3 as the pivot index.






 */ 
    public static int pivotElementBruteForce(int[] nums){

        for(int i=0; i<nums.length; i++){
            int leftSum =0;
            for(int j=0; j<i; j++){
                leftSum +=nums[j];
            }

            int rightSum =0;
            for(int j=i+1; j<nums.length;  j++){
                rightSum +=nums[j];
            }

            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }

    public static int pivotElementBetterApproach(int nums[]){
        int totalSum=0;
        for(int num:nums){
            totalSum +=num;
        }

        int leftSum =0;
        for(int i=0; i<nums.length; i++){
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum +=nums[i];
        }

        return -1;
    }
}
