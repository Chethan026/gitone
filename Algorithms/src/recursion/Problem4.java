package recursion;
//Josephus problem of killing Kth person iteratively to find final survival.
public class Problem4 {
	public static void main(String[] args) {
		int n=8,k=2;
		System.out.println(survival(n,k));
	}
	public static int survival(int n, int k) {
		if(n==1) return n;
		return (survival(n-1,k)+k-1)%n+1;
	}
}
