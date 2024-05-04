package Stack&Queue;

public class QueueImplementation<V> {
    
    private V array[];
    int front =0; // remove the element from the array
    int back = -1;  // add / insert the element in the array
    int size;
    int currentSize;
    
    QueueImplementation(int maxSize){
        size = maxSize;
        currentSize=0;
        array = new V[maxSize];
    }

    public  boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == size;
    } 

    public V top(){
        return array[front];
    }

    public void Enqueue(V value){
        if(isEmpty()){
            return null;
        }
        back = (back+1) %  maxSize;
        currentSize ++;
        return array[back] = value;
    }

    public void Dequeue(){
        if(isFull()){
            return null;
        }

        currentSize --;
        V temp = array[front];
        front = (front+1) % maxSize; 
         return temp;

    }


     public static void main(String[] args) {
        
     }
}
