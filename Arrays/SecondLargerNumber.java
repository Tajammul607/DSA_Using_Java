
public package Arrays;

class SecondLargerNumber {

    public static int SecondLargestNumber(int[] arr){
        int maxi=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        
    
        
        for (int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi=Math.max(maxi,arr[i]);
            }
            
            if(arr[i]>min && arr[i] !=maxi){
                min=arr[i];
            }
        }
        
        return min;
    }

    public static int findThe2LargerEle(int[] num){
        int firstMax_Value= Integer.MIN_VALUE;
        int secondMax_Value =Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i]> firstMax_Value){
                firstMax_Value =Math.max(firstMax_Value, num[i]);

            }
        }
        for(int i=0; i<num.length; i++){
            if(num[i] > secondMax_Value && num[i]! =firstMax_Value ){
                secondMax_Value=num[i];
            }
        }
    }
    return secondMax_Value;
}