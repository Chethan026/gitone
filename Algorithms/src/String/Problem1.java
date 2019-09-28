package String;

//Reverse words in a given string.
//input: i.love.progaramming
//output: programming.love.i
public class Problem1 {

	public static void main(String[] args) {
		
		String s1="i.love.progaramming";
		
		System.out.println(s1);
		
		String s2 = reverse(s1);
		
		System.out.println(s2);

	}
	
	public static String reverse(String s) {
		
		String[] arr = s.split("\\.");
		
		String s1 = "";
		
		for (int i=arr.length-1;i>=0;i--) {
			s1=s1.concat(arr[i]+".");
		}
		
		return s1;
	}

}
