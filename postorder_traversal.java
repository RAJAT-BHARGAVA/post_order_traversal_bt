public class postorder_traversal {
    static class Node {
        int data ;
        Node left ;
        Node right ;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }

    }
    static class bt{
        static int ind = -1;
        public static Node buildtree(int []  nodes){
            ind++;
            if (nodes[ind]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }
    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    
    }
    public static void main(String[] args) {
        int [] node = {1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        bt tree = new bt();
        Node root =tree.buildtree(node);
        postorder(root) ;
    }
}
