package bitMagic;
//Finding whether given number is power of 2 or not?
public class Problem2 {
	public static void main(String[] args) {
		int i=16;
		if(i!=0&&((i&(i-1))==0))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
