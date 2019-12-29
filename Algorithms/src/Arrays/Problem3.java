package Arrays;
//Reverse an array O(n) time, O(1) space
public class Problem3 {
	public static void main(String[] args) {
		int[] a = new int[9];
		for (int i = 0; i < 9; i++) {
			a[i]=i;
		}
		reverseArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	private static void reverseArray(int[] a) {
		int low=0; int high=a.length-1;
		while(low<high) {
			int temp=a[low];
			a[low++]=a[high];
			a[high--]=temp;
		}
		
	}

}
