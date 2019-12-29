package String;

public class Problem7 {

	public static void main(String[] args) {
		String s1="AAAAAB";
		String s2="AAAA";
		
		patternSearch(s1,s2);
	}

	private static void patternSearch(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if(s1.substring(i).startsWith(s2))
				System.out.println(" "+i);
		}
		
	}

}
