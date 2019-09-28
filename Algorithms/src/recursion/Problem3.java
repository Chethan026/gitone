package recursion;
//Recursion program for palindrome.
public class Problem3 {

	public static void main(String[] args) {
		String str="malayalam";
		System.out.println(isPal(str,0,str.length()-1));
	}
	public static boolean isPal(String str,int s ,int e) {
		if(s==e) return true;
		if(s>e) return true;
		if(str.charAt(s)!=str.charAt(e)) 
			return false;
		else
		return isPal(str,s+1,e-1);
	}
}
