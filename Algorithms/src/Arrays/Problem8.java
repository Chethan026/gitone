package Arrays;
//Leaders in an Array
//Time O(n), space O(1)
public class Problem8 {

	public static void main(String[] args) {
		int[] a = {7,10,4,10,6,5,2};
		
		printLeaders(a);
		
	}

	private static void printLeaders(int[] a) {
		int cur_ldr = a[a.length-1];
		System.out.print(cur_ldr+" ");
		
		for (int i = a.length-1; i >=0 ; i--) {
			if(a[i]>cur_ldr) {
				cur_ldr = a[i];
				System.out.print(cur_ldr+" ");
			}
		}
		
	}

}
