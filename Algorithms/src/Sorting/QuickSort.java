package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {34,63,14,65,38,76,46,53,9,8,10};
		printArray(arr);
		System.out.println();
		int l=arr.length;
		sort(arr,0,l-1);
		printArray(arr);

	}
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void sort(int[] a1,int low, int high ) {
		if(low<high) {
		int p=partition(a1,low,high);
		sort(a1,low,p-1);
		sort(a1,p+1,high);
		}
	}
	public static int partition(int[] a1, int low, int high) {
		int i,j,pivot;
		pivot=a1[high];
		i=low-1;
		for(j=low;j<=high;j++) {
			if(a1[j]<=pivot) {
				i++;
				int temp=a1[j];
				a1[j]=a1[i];
				a1[i]=temp;
			}
		}
		return i;
	}

}

/*
 * QuickSort is Divide n conquer algorithm, where it picks up any random element as pivot
 * and scan array from left to right, if it finds any element less than pivot, then it swaps
 * with greater elements from right side. hence pivot will be placed in position where left 
 * side elements are lesser than pivot and right side elements are greater than pivot. Index of pivot 
 * will be returned which will be partition point of an array. likewise array is divided at pivot index and sorted
 * Method: Divide and Conquer
 * Time Complexity: (worst case when pivot divides at first/last) O(n*n)
 * Time Complexity: (best case when pivot divides at center) O(nlogn)
 * Space complexity:O(1)-in place algorithm.  */
 