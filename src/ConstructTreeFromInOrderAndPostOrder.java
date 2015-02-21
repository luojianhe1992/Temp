


public class ConstructTreeFromInOrderAndPostOrder {
	public static void main(String[] args) {
		String inorderString = "dbeacf";
		String postorderString = "debfca";
		
		BinaryTreeNode root = constructTree(inorderString, postorderString);
		
		System.out.println(root);
	}
	public static BinaryTreeNode constructTree(String inorderString, String postorderString){
		
		char[] inorderArray = inorderString.toCharArray();
		char[] postorderArray = postorderString.toCharArray();
		int inStart = 0;
		int inEnd = inorderArray.length - 1;
		
		int postStart = 0;
		int postEnd = postorderArray.length - 1;
		
		//invoke the function
		return constructTree(inorderArray, inStart, inEnd, postorderArray, postStart, postEnd);
	}
	
	public static BinaryTreeNode constructTree(char[] inorderArray, int inStart, int inEnd,//
			char[]postorderArray, int postStart, int postEnd ){
		
		System.out.println("***********************");
		System.out.println(inStart + " " + inEnd);
		System.out.println(postStart + " " + postEnd);
		System.out.println("***********************");
		
		
		//stop condition
		if(inStart > inEnd || postStart > postEnd){
			return null;
		}
		
		//
		char rootValue = postorderArray[postEnd] ;
		
		BinaryTreeNode root = new BinaryTreeNode(rootValue);
		
		int rootIndexInInorderArray = 0;
		for(int i = 0;i < inorderArray.length; i++){
			if(inorderArray[i] == postorderArray[postEnd]){
				rootIndexInInorderArray = i;
				break;
			}
		}
		
		root.leftChild = constructTree(inorderArray, inStart, rootIndexInInorderArray - 1, 
				postorderArray, postStart, postStart + rootIndexInInorderArray - (inStart + 1) );
		
		root.rightChild = constructTree(inorderArray, rootIndexInInorderArray + 1, inEnd,
				postorderArray, postStart + rootIndexInInorderArray - inStart, postEnd - 1);
		
		return root;
	}
}
