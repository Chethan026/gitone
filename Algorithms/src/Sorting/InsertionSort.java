package Sorting;
//insertion sort is in place algorithm.
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {34,63,14,65,38,76,46,53,9,8,10};
		printArray(arr);
		System.out.println();
		sort(arr);
		printArray(arr);

	}
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void sort(int[] a1) {
		int i,j,key;
		for(i=1;i<a1.length;i++) {
			key=a1[i];
			for(j=i-1;j>=0;j--) {
				if(key<a1[j]) {
					a1[j+1]=a1[j];
					a1[j]=key;
				}
			}
		}
	}

}

/*
 * Insertion Sort: Time Complexity:O(n*n); space complexity:O(1); It is In place Algorithm.
 */