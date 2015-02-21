
public class BinaryTreeNode {
	char value;
	public BinaryTreeNode leftChild;
	public BinaryTreeNode rightChild;
	
	public BinaryTreeNode(char value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}

	public BinaryTreeNode(char value, BinaryTreeNode leftChild,
			BinaryTreeNode rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("value:"+value+", leftChild:"+leftChild+", rightChild:"+rightChild);
		return sb.toString();
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
