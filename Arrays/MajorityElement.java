

public class MajorityElement{

    // brute force approach 
    public static int majorityElement(int[] nums){

        int num= nums.length /2;
        
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > num){
                    return nums[i]
                }
            }

            return -1;
        }
    }

    //optimize 
    int num= nums.length/2;
    int element=nums[0];
    int count =1;
    for(int i=0; i<nums.length; i++){
        if(count ==0){
            element=nums[i];
            count =1;
        } else if(element == nums[i]){
                count++;
        }else{
            count--;
        }

        count=0;
        for(int n : nums){
            if(n ==element){
                count++;
            }

            if(count > num){
                return element;
            }
        }
        
    }

}