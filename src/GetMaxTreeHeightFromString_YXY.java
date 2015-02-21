
public class GetMaxTreeHeightFromString_YXY {
	
	public static void main(String[] args) {
		String preorderString = "a b * * c d * * *";
		
		System.out.println(heightOfTree(preorderString));
	}
	
	//
	public static int heightOfTree(String enc) {
		int[] sinfo = null;
		String[] split = enc.split(" ");
		try {
			//invoke the override function
			sinfo = heightOfTree(enc.split(" "), 0);
		} catch (NullPointerException e) {
			//
			return -1;
		} catch (IndexOutOfBoundsException e) {
			//
			return -1;
		}
//		System.out.println(sinfo[1] + "\t" + split.length);
		if(sinfo[1] != split.length)
			return -1;
		return sinfo == null ? -1 : sinfo[0];
	}

	//override the heightOfTree
	public static int[] heightOfTree(String[] enc, int index) {
		
		if (enc[index].equals("*")) {
			return new int[] { 0, 1 };
		}

		int offset = 1;
		int width = 0;
		int[] pleft = heightOfTree(enc, width + index + offset);
		width += pleft[1];
		int[] pright = heightOfTree(enc, width + index + offset);
		width += pright[1];
		return new int[] { Math.max(pleft[0], pright[0]) + 1, width + 1 };
	}
}
