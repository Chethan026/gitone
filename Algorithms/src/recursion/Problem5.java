package recursion;
//Finding sum of digits in number
public class Problem5 {

	public static void main(String[] args) {
		int n=12345;
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n<10) return n;
		return sum(n/10)+n%10;
	}
}
