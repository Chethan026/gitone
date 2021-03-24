package recursion;
//Finding Factorial of a number.
public class Problem1 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		System.out.println(fac(n));
		System.out.println(fac1(n,k));
	}
	public static int fac(int i) {
		if(i==0)
			return 1;
		return i*fac(i-1);//Head recursion
	}
	
	public static int fac1(int i , int k) {
		if(i==0)
			return k;
		k=k*i;
		return fac1(i-1,k);//Tail recursion
	}
}
