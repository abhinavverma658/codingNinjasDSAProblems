package basicLinkedList;

public class firstLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        Node x = new Node(5);
        Node y = new Node(8);
        x.next=y;
        System.out.println(x.data);
        System.out.println(x.next);
        System.out.println(y.data);
        System.out.println(y.next);
        System.out.println(x.next.data);
        System.out.println(y.next.data);

    }
}
