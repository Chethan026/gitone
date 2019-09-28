package bitMagic;
//Counting set bits of a number
public class Problem3 {
	public static void main(String[] args) {
		int i=16;
		int count=0;
		while(i>0) {
			count++;
			i=i&(i-1);
		}
		System.out.println(count);
	}
}
