import javax.swing.text.Position.Bias;


public class ConstructTreeFromPreOrderAndInOrder {
	public static void main(String[] args) {
		String preorderString = "abdecfg";
		String inorderString = "dbeafcg";
		
		BinaryTreeNode root = constructTree(preorderString, inorderString);
		
		System.out.println(root);
	}
	
	public static BinaryTreeNode constructTree(String preorderString , String inorderString){
		char[] preorderArray = preorderString.toCharArray();
		char[] inorderArray = inorderString.toCharArray();
		
		int preStart = 0;
		int preEnd = preorderArray.length - 1;
		
		int InStart = 0;
		int InEnd = inorderArray.length - 1;
		
		return constructTree(preorderArray, inorderArray, preStart, preEnd, InStart, InEnd);
	}
	
	public static BinaryTreeNode constructTree(char[] preorderArray, char[] inorderArray, //
			int preStart, int preEnd, int InStart, int InEnd){
		
		if(preStart > preEnd || InStart > InEnd){
			return null;
		}
		
		char rootValue = preorderArray[preStart];
		BinaryTreeNode root = new BinaryTreeNode(rootValue);

		int rootIndexInInorderArray = -1;
		for(int i = 0;i<inorderArray.length; i++){
			if(inorderArray[i] == rootValue){
				rootIndexInInorderArray = i;
				break;
			}
		}
		
		System.out.println("**********************************");
		System.out.println("preStart = " + preStart);
		System.out.println("preEnd = " + preEnd);
		System.out.println("inStart = " + InStart);
		System.out.println("inEnd = " + InEnd);
		System.out.println("rootIndexInInorderArray = " + rootIndexInInorderArray);
		System.out.println("**********************************");
		
		int len = rootIndexInInorderArray - InStart;
		
		//recursive invoking the function
		root.leftChild = constructTree(preorderArray, inorderArray, preStart + 1, preStart + 1 + len - 1, InStart, rootIndexInInorderArray - 1);
		root.rightChild = constructTree(preorderArray, inorderArray, preStart + 1 + len - 1 + 1, preEnd, rootIndexInInorderArray + 1, InEnd);
		
		return root;
		
	}
}
