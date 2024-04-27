
package Arrays;

/**
 * Rearrange
 */
public class Rearrange {

    // brute force
    public static void RearrangeEle(int arr[]) {
       // [1,2,3,4,5,6] ==> 6,1,5,2,4,3
        int newArr = new int[arr];

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[end] % 2 == 0) {
                newArr = arr[end];
                end--;
            } else {
                newArr = arr[start];
                start++;
            }

        }

    }

}
public static void rearrange(long arr[], int n){
    int min_idx = 0 , 
    max_idx = n-1;
    long max_elem = arr[max_idx]+1;

    for(int i=0; i<n; i++){
        if (i % 2 == 0){

            arr[i] +=  arr[max_idx] % max_elem * max_elem;//---5(index)%49 or 6(value)%49

            max_idx--; //5-1=>4

        }

        else{
            arr[i] +=  arr[min_idx] % max_elem * max_elem;
            min_idx++;
        }

    }
    for(int i=0; i<n; i++){

        arr[i] = arr[i]/max_elem;
        
    }
}