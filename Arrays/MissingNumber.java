

public package Arrays;

class MissingNumber {

       // for(int i=1; i<=n; i++){
        //     boolean found=false;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[j] == i){
        //             found=true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

    public static int missingNumber(int[] nums){
        int n=nums.length;
        int exceptedSum = n *(n+1)/2;

        int actualSum=0;

        for(int num : n){
            actualSum +=num;
        }

        return exceptedSum - actualSum
    }
}