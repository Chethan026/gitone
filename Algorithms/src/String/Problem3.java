package String;

//given a string, find the index of leftmost character which repeats
//input:abbcc
//ouput:1//index of b
public class Problem3 {

	public static void main(String[] args) {
		
		String s1 = "ascdbcc";
		
		int i = leftMostIndexOfRepeatingChar(s1);
		
		System.out.println(i);

	}

	private static int leftMostIndexOfRepeatingChar(String s1) {
		int[] count = new int[256];
		
		for(int i=0;i<s1.length();i++)
			count[s1.charAt(i)]++;
		
		for(int i=0;i<s1.length();i++)
			if(count[s1.charAt(i)]>=2)
				return i;
		
		return -1;
	}

}
