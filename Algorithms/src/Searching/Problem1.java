package Searching;
//Linear array search (unsorted); O(n) time complexity. 
public class Problem1 {

	public static void main(String[] args) {
		int [] arr1 = {5,3,7,2,3,4,2,8};
		int x=8;
		int index=search(arr1,x);
		System.out.println(index);
	}
	 
	public static int search(int[] arr1, int x) {
		for (int i=0;i<arr1.length;i++) {
			if(x==arr1[i])
				return i;
		}
		return -1;
	}

}