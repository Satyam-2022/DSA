package DSA;
import java.util.*;

public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int []nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root) {
        if(root == null) {
            //System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if(root == null) {
           // System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if(root == null) {
           // System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
         Node curr=q.remove();
         if(curr==null){
             System.out.println();
             if(q.isEmpty()){
                 break;
             }else {
                 q.add(null);
             }
         }else {
             System.out.print(curr.data+" ");
             if(curr.left!=null){
                 q.add(curr.left);
             }
             if(curr.right!=null){
                 q.add(curr.right);
             }
         }
        }

    }
    public static int countofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countofNodes(root.left);
        int rightNodes=countofNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofNodes(root.left);
        int rightsum=sumofNodes(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return -1;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }

    public static void main(String[] args) {
        int []node={1, 2, 4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(node);
        System.out.println(root.data);
       // System.out.println();
        System.out.println("Preorder");
        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("Postorder");
        postorder(root);
        System.out.println();
        System.out.println("levelorder");
        levelorder(root);
        System.out.println("Roots="+countofNodes(root));
        System.out.println("sumofNodes= "+sumofNodes(root));
        System.out.println("Height of Tree= "+height(root));


    }
}
