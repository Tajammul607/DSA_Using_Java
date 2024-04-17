package Arrays;

/**
 * ProductMax2Num
 */
public class ProductMax2Num {

    // O(n^2)
    public static int productOfMax2Num(int num[]){
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] * num[j] >maxProduct) {
                    maxProduct =num[i]*num[j];
                }
            }
        }
        return maxProduct;
    }

    //O(n)
    public static int productOfMax2Num(int num[]){
        int maxProduct=Integer.MIN_VALUE;
        int i=0;
        int j=num.length-1;
            //  [3, 5, 2, 6, 8, 1]
        while(i<j){
            int cur =num[i] * num[j];
            if( cur >maxProduct){
                maxProduct=num[i] * num[j];
            }
            if(cur< maxProduct){
                j--;
            }
            i++;
        }
        return maxProduct;
    }
}