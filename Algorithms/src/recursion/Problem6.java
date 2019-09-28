package recursion;
//Given a rope of length n, you need to find maximum number of pieces such that length of every piece is
//in set {a,b,c} for given three values of a, b, c.
public class Problem6 {

	public static void main(String[] args) {
		int n=9,a=2,b=2,c=2;
		System.out.println(maxPieces(n, a, b, c));
	}
	public static int maxPieces(int n, int a, int b, int c) {
		if(n<0) return -1;
		if(n==0) return 0;
		int temp=Math.max(maxPieces(n-a,a,b,c), maxPieces(n-b,a,b,c));
		int res = Math.max(temp, maxPieces(n-c,a,b,c));
		if (res==-1)		
		return -1;
		else
			return res+1;
	}
}
