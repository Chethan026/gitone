package Searching;
//Finding 2 integers in an unsorted array whose sum is equal to given number
public class Problem7 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,3,4,4,4,4,4,4,4};
		int x=1;
		boolean l=method1(arr1,x);//O(n*n) complexity
		System.out.println(l);
	}
	public static boolean method1(int[] arr1,int x) {
		for (int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]+arr1[j]==x)
					return true;
			}
		}
		return false;
	}
}
