package Arrays;
//sliding window problem
public class Problem12 {

	public static void main(String[] args) {
		int[] a = { 1, 8, 30, -5, 20, 7 };
		int d = 2;
		int k =findMaxSumInSlides1(a,d);// Time O(n*n) space O(d)
		System.out.println(k);
		int l=findMaxSumInSlides2(a,d);// Time O(n) space O(d)
		System.out.println(l);
		
	}

	private static int findMaxSumInSlides2(int[] a, int d) {
		int slide=0;
		for (int i = 0; i < d; i++) {
			slide=slide+a[i];
		}
		int Max=slide;
		for (int i = 1; i < a.length-d; i++) {
			slide=slide-a[i-1]+a[i+d-1];
			if(slide>Max) {
				Max=slide;
			}
		}
		return Max;
	}

	private static int findMaxSumInSlides1(int[] a, int d) {
		int Max=0;
		for (int i = 0; i < a.length-d; i++) {
			int sum=0;
			for (int j = i; j < d+i; j++) {
				sum=sum+a[j];
			}
			if(sum>Max) {
				Max=sum;
			}
		}
		return Max;
	}

}
