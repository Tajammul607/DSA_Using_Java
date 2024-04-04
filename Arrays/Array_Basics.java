import javax.swing.plaf.synth.SynthStyle;

class Array_Basics {

    public static int maxEle(int arr[]){
    
        int max_ele=arr[0];
    
        for(int i=1; i<arr.length; i++){
            if(arr[i] >max_ele){
                max_ele =arr[i];
            }
        }
    
        return max_ele;
    }
    public static int[] insertEleAtGivenPosition(int arr[], int ele, int pos){
        // creating a new array
        int[] newArray= new int[arr.length+1];

        for(int i=0; i<pos; i++){
            newArray[i]=arr[i];
        }

        newArray[pos]=ele;

        for(int i=pos+1; i< newArray.length; i++){
            newArray[i]= arr[i-1];
        }
        return newArray;
    }
    public static int sumOfAllElement(int arr[]){
    //[1,2,3,4,5,6,7]=28

    int sum=0;

    for(int i=0; i<arr.length; i++){
        sum +=arr[i];
    }

    return sum;

    }
    public static boolean isContainsTheEle(int arr[], int ele){
         // [2,3,10,12,60,67] ele=3
         
        //  for(int i=0; i<arr.length; i++){
        //     for(int j=1; j<arr.length; j++){
        //         if(arr[i]== ele || arr[j]== ele){
        //             return  true;
        //         }
        //     }
        //  }
        //  return false; O(n^2)
            for(int i=0; i<arr.length; i++){
                if(arr[i]== ele){
                    return true;
                }
            }
            return false;
        }
    public static void reverseAnArray(int arr[]){
            //[1,2,3,4,5]=> [5,4,3,2,1]

            // int[] newArr=new int[arr.length+1];
            // for(int i=arr.length-1;i>=0;i++){
            //     newArr[i] = arr[i];
            // }

            int start=0;
            int end=arr.length-1;

            while(start<end){
                int temp=start;
                start=end;
                end=temp;
                start++;
                end--;
            }
        }
    public static int secondLargestElement(int arr[]){

    int firstLargest= Integer.MIN_VALUE;// in case if the array contains -ve values
    int secondLargest=Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
        if(arr[i] > firstLargest ){
            firstLargest =arr[i];
        }else if( arr[i] > secondLargest && arr[i] != firstLargest){
            secondLargest =arr[i];
        }
    }
    return secondLargest;
  }
       
    public static boolean removeDublicateElement(int arr[]){
        //[1,2,3,3,4,5] --> 3
        /**
         * 
         */

         for(int i=0; i<arr.length-1; i++){
            
            if(arr[i]== arr[i-1]){
                return true;
            }
         }
         return false;
    }
  
  
    public static void main(String[] args){
        int[] arr ={10,20,90,40,50};
        int ele=70;
        int pos=3;
        // System.out.print(insertEleAtGivenPosition(arr,ele,pos));

        System.out.println(removeDublicateElement(arr));
      
    }
}


// [1,2,4,5,6,8,9,0,10]

