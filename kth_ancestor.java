public class kth_ancestor {
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
                 if(idx>=nodes.length || nodes[idx]==-1){
                     return null;
                 }
                 Node n=new Node(nodes[idx]);
                 n.left=buildTree(nodes);
                 n.right=buildTree(nodes);
    
                 return n;
             }
    
             public static int sumTree(Node root){
                if(root==null){
                    return 0;
                }
                int temp=root.data;
                int l=sumTree(root.left);
                int r=sumTree(root.right);
                int lc=root.left==null?0:root.left.data;
                int rc=root.right==null?0:root.right.data;
    
                root.data=l+r+lc+rc;
                return temp;
             }
    
             public static void preorder(Node root){
                if(root==null){
                    return ;
                }
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right);
             }

             public static int ancestor(Node root,int val,int k){
                if(root==null){
                    return -1;
                }

                if(root.data==val){
                    return 0;
                }
                

                int ld=ancestor(root.left,val,k);
                int rd=ancestor(root.right,val,k);
                int max=Math.max(ld,rd);
                if(max+1==k){
                    System.err.println(root.data);
                }

              
                if(ld!=-1){
                     ld+=1;
                     return ld;
                }

                if(rd!=-1){
                     rd+=1;
                     return rd;
                }
            
                return -1;

            }
        }
    
        public static void main(String[] args) {
            int a[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
           Node root= BinaryTree.buildTree(a);
            System.out.println();
           BinaryTree.ancestor(root,5,2);
    
        }
    
    
}