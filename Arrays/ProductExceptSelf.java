public package Arrays;

class ProductExceptSelf {


    // brute force approach O(n ^ 2)  space O(n)
    public int[] productExceptSelf(int [] arr,int n){

        int[]  newArr= new int[n]
        // {1,2,3,4,5,6}
        for(int i=0; i<n; i++ ){
            int product= 1;
            for(int j=0; j<n; j++){
               
               if(i != j){
                    product *=arr[j];
                }
               
            }
            newArr[i]= product;

            return newArr;
        }
    }


    public int[] productExceptBetterApproach(int[] arr, int n){
        /**
         * so while solving we might have zero's present in the arr
         * 
         * if their's no zero 
         *      ---> multiply all the elements first 
         *      ---> then divide the product by each of the element 
         * 
         * case 2 :- if the arr contains 1 zero
         *      ---> simple except that index of zero will have the product of all elements
         *      ---> rest of all the elements is zero
         * 
         * case 3 : if the arr contains more than 1 zero
         *     --> then the entire aarray of prodect is zero
         */
         int product=1;
         int countZero=0;

         for(int i=0; i<n; i++){
                if(i! =countZero){
                    product *=arr[i];
                }else{
                    countZero +=1;
                }
         }

         int[]  ans=new int[n];

         for(int i=0; i<n; i++){
            if(arr[i] !=0){
                ans[i]=product/arr[i];
                 if(countZero ==1) ans[i]=0;
               }else{
                ans[i]=product;
            }

            if(countZero >1){
                ans[i]=0;
            }
         }
  return ans;

    }

}