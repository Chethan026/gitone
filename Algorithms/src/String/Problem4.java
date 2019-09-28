package String;

//Given string find the index of left most non repeating character.
public class Problem4 {

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		
		int i = leftMostIndexOfNonRepeatingChar(s1);
		
		System.out.println(i);

	}
	
	private static int leftMostIndexOfNonRepeatingChar(String s1) {
		int[] count = new int[256];
		
		for(int i=0;i<s1.length();i++)
			count[s1.charAt(i)]++;
		
		for(int i=0;i<s1.length();i++)
			if(count[s1.charAt(i)]==1)
				return i;
		
		return -1;
	}
}
