public class SameSubTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    

    static class BinaryTree{
        public static boolean same(Node root,Node subroot){
            if(root.data!=subroot.data){
                same(root.left,subroot);
                same(root.right,subroot);
            }
            
        }
    
   
              
    }
                public static void main(String[] args) {
                   Node root=new Node(1);
                   root.left=new Node(2);
                   root.left.left=new Node(4);
                   root.left.right=new Node(5);
                   root.right=new Node(3);
                   root.right.right=new Node(6);


                   Node subroot=new Node(2);

                   subroot.left=new Node(3);
                   subroot.right=new Node(4);


                    System.out.println(BinaryTree.same(root,subroot));


                }        
    }
}