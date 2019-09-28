package recursion;
//Using recursion find subset of string input
public class Problem7 {
//In recursion, when passing int value, index++ should not be used, index+1 should be used to call recursive fun
	public static void main(String[] args) {
		String str="ABC";
		String curr="";
		int index=0;
		subSets(str, curr, index);
	}
	
	public static void subSets(String str, String curr, int index ) {
		if(index==str.length()) {
			System.out.println(curr);
			return;
		}
			subSets(str,curr,index+1);
		subSets(str,curr+str.charAt(index),index+1);
	}
}
