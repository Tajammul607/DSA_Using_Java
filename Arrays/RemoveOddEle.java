public package Arrays;

class RemoveOddEle {

    public static int[] removeOddElement(int[] arr){
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(ar[i]%2 !=0){
                count++;
            }
        }

        int[] newArr= new int[count];

        int j=0;// need to initialize cox the looping in done the original arr so to add and keep track of the ele need to use..

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                newArr[j] = arr[i];
            }
        }

        return newArr;
    }

   public static void main(String[] args) {
      int[] arr= {1,2,3,5,6,7,4,8,9,10};

      int[] a = removeOddElement(arr);

      for(int i=0; i<a.length; i++){
        System.out.print(a[i] + " ");
    }
   } 
}