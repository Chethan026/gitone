package BasicMaths;
//Problem: Counting Number of Digits in Number.
public class Problem1 {

	public static void main(String[] args) {
		int N=20152;
		double M=N;
		//Method: 1
		int count=0;
		while(N!=0) {
			count++;
			N=N/10;
		}
		System.out.println("Number of digits in "+M +" is "+count);
	//Method: 2
		double val=(Math.log(M)/Math.log(10))+1;
		System.out.println("Number of digits in "+M +" is "+Math.floor(val));
	}
}
