
public class GetMaxTreeHeight {
	public static void main(String[] args) {
		String bt = "ab**cdef*****";
		
		System.out.println(getMaxTreeHeight(bt));
	}
	
	public static int getMaxTreeHeight(String str){
		
		char[] charArray = str.toCharArray();
		
		return getMaxTreeHeight(charArray, 0, 0, 0);
		
	}
	
	public static int getMaxTreeHeight(char [] charArray, int currentPoint, int len, int maxHeight){
		
		//the stop condition
		if(currentPoint == charArray.length - 1){
			if (len > maxHeight) {
				maxHeight = len;
			}
			return maxHeight;
		}
		
		//meet the leaf node
		if(charArray[currentPoint] != '*' && charArray[currentPoint + 1]=='*' && charArray[currentPoint + 2] == '*'){
			len++;
			if(len > maxHeight){
				maxHeight = len;
			}
			//currentPoint + 3
			currentPoint = currentPoint + 3;
			System.out.println("in the first condition, the maxheight is:"+maxHeight+", current index is:"+currentPoint);
			return getMaxTreeHeight(charArray, currentPoint, len, maxHeight);
		}
		//the left child is *
		else if(charArray[currentPoint] != '*' && charArray[currentPoint + 1]=='*' && charArray[currentPoint + 2] != '*'){
			len++;
			if(len > maxHeight){
				maxHeight = len;
			}
			//currentPoint + 2
			currentPoint = currentPoint + 2; 
			System.out.println("in the second condition, the maxheight is:"+maxHeight+", current index is:"+currentPoint);
			return getMaxTreeHeight(charArray, currentPoint, len, maxHeight);
		}
		else if(charArray[currentPoint] != '*'){
			//moving
			len++;
			//currentPoint + 1
			currentPoint = currentPoint + 1;
			if (len > maxHeight) {
				maxHeight = len;
			}
			System.out.println("in the third condition, the maxheight is:"+maxHeight+", current index is:"+currentPoint);
			return getMaxTreeHeight(charArray, currentPoint, len, maxHeight);
		}
		else{
			//currentPoint + 1
			currentPoint = currentPoint + 1;
			if(len > maxHeight){
				maxHeight = len;
			}
			System.out.println("in the fourth condition, the maxheight is:"+maxHeight+", current index is:"+currentPoint);
			return getMaxTreeHeight(charArray, currentPoint, len, maxHeight);
		}
	}
}
