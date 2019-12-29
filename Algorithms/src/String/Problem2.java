package String;

//Given 2 strings find if they are anagram of each other?
//input:s1=geeks, s2=gkees
//ouput:yes
public class Problem2 {

	public static void main(String[] args) {
		
		String s1="geeks";
		String s2="gkese";
		
		boolean f = isAnagram(s1,s2);
		
		System.out.println(f);

	}

	private static boolean isAnagram(String s1, String s2) {
		
		int[] count=new int[256];
		
		if(s1.length()!=s2.length())
			return false;
		
		for (int i=0;i<s1.length();i++)
			count[s1.charAt(i)]++;
		
		for (int i=0;i<s2.length();i++)
			count[s2.charAt(i)]--;
		
		for (int i=0;i<count.length;i++)
			if(count[i]!=0)
				return false;
		
		return true;
	}

}
