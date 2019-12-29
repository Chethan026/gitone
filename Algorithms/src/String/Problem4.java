package String;

//Given string find the index of left most non repeating character.
public class Problem4 {

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		
		int i = leftMostIndexOfNonRepeatingChar(s1);// 2 traversal of string
		
		int j = leftMostIndexOfNonRepeatingChar1(s1);// 1 traversal of string
		
		System.out.println(j);

	}
	
	private static int leftMostIndexOfNonRepeatingChar1(String s1) {
		int[] count = new int[256];
		for (int i = 0; i < count.length; i++) {
			count[i]=-1;
		}
		for(int i=0;i<s1.length();i++) {
			if(count[s1.charAt(i)]==-1)
				count[s1.charAt(i)]=i;
			else
				count[s1.charAt(i)]=-2;
		}
		int res=300;
		for (int i = 0; i < count.length; i++) {
			if(count[i]>=0) {
				res=Math.min(res, count[i]);
			}
		}
		
		
		return (res==300)?-1:res;
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
