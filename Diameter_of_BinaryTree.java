/*------------------------Approach 1--------------------------*/

public class Diameter_of_BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        public static int height(Node root){
            if(root==null){
                return 0;
            }
        return Math.max(height(root.left),height(root.right))+1;
        }
         public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            //case 1 when diametere passses through root node

            int dia1=height(root.left)+height(root.right)+1;


            //case 2 when longest diameter lies in subtree of the binary tree
            int dia2=Math.max(diameter(root.left),diameter(root.right));
            
            return Math.max(dia1,dia2);


         }
          
                }

                public static void main(String[] args) {
                   Node root=new Node(1);
                   root.left=new Node(2);
                   root.left.left=new Node(3);
                   root.left.left.left=new Node(4);
                   root.left.left.left.left=new Node(5);
                   root.left.left.left.left.left=new Node(6);
                   root.left.left.left.left.left.left=new Node(7);
                   root.left.left.left.left.left.right=new Node(8);
                   root.left.left.left.left.right=new Node(9);
                   root.left.left.left.left.right.right=new Node(10);
                   root.left.left.left.left.right.right.right=new Node(11);
                   root.right=new Node(12);


                    System.out.println(BinaryTree.diameter(root));


                 
    }
}