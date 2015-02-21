
public class TreeGetHeight {
	public static void main(String[] args) {
		
	}
	
	public static int getHeight(BinaryTreeNode root){
		if(root == null){
			return 0;
		}
		
		//using recursive way
		return Math.max(getHeight(root.getLeftChild()), getHeight(root.getRightChild())) + 1;
	}
}
