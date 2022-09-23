package DSA;
import java.util.*;
//push==ADD THE ELEMENT ,pop==TOP ELEMENT IS REMOVING ,peek==RETURN TOP ELEMENT
//LIFO OR FILO
//1.Array 2.Arraylist 3.Linked List
//Linked list

import java.util.Stack;

public class StackAl {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
         public static Node head=null;
         public static void push(int data){
             Node newNode=new Node(data);
             if(head==null){
                 head=newNode;
                 return;
             }newNode.next=head;
             head=newNode;
         }
        public static boolean isEmpty(){

             return head==null;
        }
        public static int pop(){
             if(isEmpty()){
                 return -1;
             }
             Node top =head;
             head=head.next;
             return top.data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top=head;
            return top.data;
        }
    }

    public static void main(String[] args) {
       // Stack stack=new Stack();
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());

       while (!Stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
