public class DiameterofBinaryTree2 {
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
   
       static class Info{
        int dia;
        int height;
        Info(int dia,int height){
            this.dia=dia;
            this.height=height; 
        }
    }
    
         public static Info diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }

           
            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);

            int dia=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.height+rightInfo.height+1);
            int height=Math.max(leftInfo.height,rightInfo.height)+1;
            return new Info(dia, height);    
        
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


                    System.out.println(diameter(root).dia);


                 
    }
}
