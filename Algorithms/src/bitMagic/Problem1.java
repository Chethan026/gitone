package bitMagic;
//Finding Kth bit whether set or unset from right.
public class Problem1 {

	public static void main(String[] args) {
		int k=2;
		int i=7;
		if((i&(1<<k-1))!=0) 
			System.out.println(k +"nd Bit is set");
		else
			System.out.println(k +"nd bit is unset");
	//Finding even or odd number?
		int a=3;
		if((a&1)==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
	}

}
