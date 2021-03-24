package Arrays;

//Maximum difference problem
//
public class Problem9 {

	public static void main(String[] args) {
	int[] a = {3,3,10,6,4,8,1};
	long i=System.nanoTime();
	System.out.println(maxDif1(a)); //O(n*n) Naive method
	long j=System.nanoTime();
	System.out.println(maxDif2(a)); //O(n) Best solution
	long k=System.nanoTime();
	System.out.println(System.nanoTime());
	
	System.out.println("1: "+(j-i));
	System.out.println("2: "+(k-j));
	}

	private static int maxDif2(int[] a) {
		int res = a[1]-a[0];
		int minVal = a[0];
		for (int i = 1; i < a.length; i++) {
			res = Math.max(res, a[i]-minVal);
			minVal = Math.min(minVal, a[i]);
		}
		return res;
	}

	private static int maxDif1(int[] a) {
		int res = a[1]-a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				res = Math.max(res, a[j]-a[i]);
			}
		}
		return res;
	}

}
