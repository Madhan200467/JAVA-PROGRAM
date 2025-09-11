class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class tree{
    Node root;
    tree(){
        root=null;
    }
    public void insert(int n){
        Node newnode=new Node(n);
        if(root==null)
        root=newnode;
        else{
            Node temp=root;
            while(true){
                if(temp.data<n){
                    if(temp.right==null){
                        temp.right=newnode;
                        break;
                    }
                    else{
                        temp=temp.right;
                    }
                }
                else{
                    if(temp.left==null){
                        temp.left=newnode;
                        break;
                    }
                    else{
                        temp=temp.left;
                    }
                }
            }
        }
    }
    
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		tree a=new tree();
		a.insert(50);
		a.insert(75);
		a.insert(25);
		a.insert(10);
		a.insert(12);
		a.insert(90);
		a.insert(87);
		a.insert(7);
		a.insert(64);
		a.insert(93);
		a.insert(4);
		a.insert(21);
		a.insert(56);
		a.insert(44);
		a.inorder(a.root);
		System.out.println();
		a.preorder(a.root);
		System.out.println();
		a.postorder(a.root);
	}
}
