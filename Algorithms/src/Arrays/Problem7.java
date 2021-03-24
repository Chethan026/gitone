package Arrays;

//Left rotate by d, best solution O(n) time O(1) space
public class Problem7 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i]=i;
		}
		int d = 4;
		int n = a.length;
		reverseArray(a,0,d-1);//O(d/2)
		reverseArray(a,d,n-1);//O((n-d)/2)
		reverseArray(a,0,n-1);//O(n)
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}
	private static void reverseArray(int[] a,int low,int high) {
		while(low<high) {
			int temp=a[low];
			a[low++]=a[high];
			a[high--]=temp;
		}
		
	}

}
