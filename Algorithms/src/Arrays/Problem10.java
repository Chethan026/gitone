package Arrays;
//Max Profit in Stock buy and sale
//Time O(n) space O(1)
public class Problem10 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 8, 12 };
		System.out.println(maxProfit1(a));
		
		System.out.println(maxProfit2(a));
	}

	private static int maxProfit2(int[] a) {
		int max=0;
		for (int i = 1; i < a.length; i++) {
			if(a[i]>a[i-1])
				max=max+(a[i]-a[i-1]);
		}
		return max;
	}

	private static int maxProfit1(int[] a) {
		int max = 0,x = 0, y = 0;
		for (int i = 0, j = 1; j < a.length;) {
			x = a[i];
			if (a[j] >= a[j-1]) {
				if (j == (a.length-1)) {
					y = a[j];
					return max = max+(y-x);
				}
				y = a[j];
				j++;
				continue;

			} else {
				y = a[j - 1];
				max = max + (y - x);
				i = j;
				j++;
			}
		}
		return max;
	}

}
