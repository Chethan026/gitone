package Arrays;
//Left Rotate array
public class Problem6 {

	public static void main(String[] args) {
		int[] a = new int[9];
		for (int i = 0; i < 9; i++) {
			a[i]=i;
		}
		//leftRotateArrayByOne(a);////O(n) time O(1) space
		int d = 4;
		for (int i = 0; i < d; i++) {
			//leftRotateArrayByOne(a);//O(n*d) time O(1) space
		}
		
		leftRotateByD(d,a);//O(n) time O(n) space
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}

	private static void leftRotateByD(int d,int[] a) {
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		for (int i = 0; i < a.length-d; i++) {
			a[i]=b[d+i];
		}
		for (int i = a.length-d, j=0; i < a.length; i++,j++) {
			a[i]=b[j];
		}
	}

	private static void leftRotateArrayByOne(int[] a) {
		int i = a[0];
		int j;
		for (j = 0; j < a.length-1; j++) {
			a[j]=a[j+1];
		}
		a[j]=i;
	}

}
