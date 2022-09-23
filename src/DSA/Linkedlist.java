package DSA;
//Doubly linked list
//manipulation is faster no bit shifting is required

public class Linkedlist {
        Node head;
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
            }
        }
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head ==null){
                head =newNode;
                return;
            }newNode.next=head;
            head=newNode;
        }
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head ==null){
                head =newNode;
                return;
            }
            Node currNode=head;
            while (currNode.next!=null){
                currNode =currNode.next;
            }
            currNode.next=newNode;

        }
        public void delFirst(){
            if(head ==null){
                System.out.println("empty");
                return;
            }
            head=head.next;
        }
        public void delLast(){
            if(head ==null){
                System.out.println("empty");
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            secondLast.next=null;
        }
        public void reverseI(){
            if(head==null||head.next==null){
                return;
            }
            Node prevNode=head;
            Node currNode=prevNode.next;
            while (currNode!=null){
                Node nextNode=currNode.next;
                currNode.next=prevNode;
                prevNode =currNode;
                currNode=nextNode;
            }
            head.next=currNode;
            head=prevNode;
        }
        public void printList(){
            if(head==null){
                System.out.println("list is empty");
            }
            Node currNode = head;
            while (currNode !=null){
                System.out.print(currNode.data+" -> ");
                currNode =currNode.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            Linkedlist list=new Linkedlist();
            list.addFirst("a");
            list.addFirst("is");
            list.addLast("list");
            list.addFirst("this");
            list.printList();
            list.reverseI();
            list.printList();
            list.delFirst();
            list.printList();
            list.delLast();
            list.printList();
    }
}
