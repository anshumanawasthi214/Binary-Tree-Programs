public class BinaryTreeTraversal {
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
               static int idx=-1;
                public static Node buildTree(int nodes[]){
                    idx++;
                    if(nodes[idx]==-1){
                        return null;
                    }
                    Node n=new Node(nodes[idx]);
                    n.left=buildTree(nodes);
                    n.right=buildTree(nodes);
    
                    return n;
                }
        }
        public static void main(String[] args) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree bin=new BinaryTree();
            Node root=bin.buildTree(nodes);
          System.out.println(root.data);
        }
    }
    
}
