class LinkedList{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int n){
            data=n;
            next=null;
        }
    }
    
    LinkedList(){
        head=null;
    }
    
    public void insertAtEnd(int n){
        Node newnode= new Node(n);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
    public void insertAtBeing(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    
    public void deleteAtEnd(){
        Node temp=head;
        if(head==null){
            System.out.print("Empty list");
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public void deleteAtBegin(){
        if(head==null){
            System.out.print("Empty list");
        }
        head=head.next;
    }
    
    public void insertAtPosition(int n,int k){
        Node newnode=new Node(n);
        Node temp=head;
        if(head==null){
            head=newnode;
        }
        else{
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    
    public void deleteAtPosition(int k){
        Node temp=head;
        if(head==null){
            System.out.print("Empty list");
        }
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}

public class Main
{
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.insertAtEnd(10);
		a.insertAtEnd(20);
		a.insertAtEnd(30);
		a.insertAtEnd(40);
		a.display();
		System.out.println();
		a.insertAtBeing(5);
		a.insertAtBeing(0);
		a.display();
		System.out.println();
		a.deleteAtEnd();
		a.deleteAtBegin();
		a.display();
		System.out.println();
		a.insertAtPosition(6,1);
		a.display();
		System.out.println();
		a.deleteAtPosition(3);
		a.display();
	}
}
