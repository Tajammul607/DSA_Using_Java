class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LL {
    Node head;

    LL(){
        this.head=null;
    }

    public void InsertAtEnd(int data){
        Node newNode=new Node(data);

        if(head == null){
        head=newNode;
        return;
        }

        Node currentNode= head;

        if(currentNode.next !=null){
            currentNode=currentNode.next;
        }

        currentNode.next=newNode;
    }

    public Display(){
        Node newNode=head;

        while (newNode.next ! =null) {
            System.out.print(newNode + " ");
            newNode=newNode.next;
        }
    }
}


public static void reverseALL(int data){
    
}