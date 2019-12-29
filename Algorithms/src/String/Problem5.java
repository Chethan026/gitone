package String;
//isAnagram present in given string?

public class Problem5 {

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		String s2 = "sgorf";
		
		boolean anagram = isAnagramPresent(s1,s2);
		System.out.println(anagram);
		
	}

	private static boolean isAnagramPresent(String s1, String s2) {
		int[] countText = new int[256];
		int[] countPat = new int[256];
		
		for (int i = 0; i < s2.length(); i++) {
			countPat[s2.charAt(i)]++;
			countText[s1.charAt(i)]++;
		}
		for (int i = s2.length(); i < s1.length(); i++) {
			if(areSame(countText,countPat))
				return true;
			countText[s1.charAt(i)]++;
			countText[s1.charAt(i-s2.length())]--;
		}
		return false;
	}

	private static boolean areSame(int[] countText, int[] countPat) {
		
		for (int i = 0; i < countPat.length; i++) {
			if(countText[i]!=countPat[i] ) {
				return false;
			}
		}
		return true;
	}

}
