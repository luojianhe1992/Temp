
public class GetMaxTreeHeight2 {
	public static void main(String[] args) {
		
	}
	
	//using recursive programming skill
	public static int getMaxHeight(String str ){
		char[] charArray = str.toCharArray();
		
		return getMaxHeight(charArray, 0, 0, 0);
	}
	
	public static int getMaxHeight(char[] charArray, int currentPoint, int len, int max){
		
		if(currentPoint > charArray.length - 1){
			return 0;
		}
		
		if(charArray[currentPoint] != '*'){
			len++;
		}
		
		int left = getMaxHeight(charArray, currentPoint + 1, len, max);
		
		int right = getMaxHeight(charArray, currentPoint + 2, len, max);
		
		return Math.max(left, right);
		
	}
}
