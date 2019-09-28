package recursion;
//print n from n to 1 and 1 to n.
public class Problem2 {
//Whenever we use recursion we need to find base condition to stop function calls.
	//Tail recursion is faster than Head recursion
	public static void main(String[] args) {
		int n=4;
		int k=1;
		fun(n);
		System.out.println();
		fun1(n);
		System.out.println();
		fun2(n);
		System.out.println();
		fun3(n,k);
	}
	public static void fun(int n) {
		if(n<1)
			return;
		System.out.print(n);
		fun(n-1);
		System.out.print(n);
	}
	public static void fun1(int n) {
		if(n<1)
			return;
		System.out.print(n);
		fun1(n-1);//Tail recursion
	}
	public static void fun2(int n) {
		if(n<1)
			return;
		fun2(n-1);//Head recursion
		System.out.print(n);
	}
	//Code to convert above Head recursion to Tail recursion fun
	public static void fun3(int n,int k) {
		if(n<1)
			return;
		System.out.print(k);
		fun3(n-1,k+1);//Tail recursion
	}
}
