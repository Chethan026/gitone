package Sorting;
//Bubble sort is an in place algorithm, with TC O(n*n) SC O(1).
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {34,63,14,65,38,76,46,53,9,8,10};
		printArray(arr);
		System.out.println("");
		sort(arr);
		printArray(arr);
	}
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int swap=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap++;
				}
			}
			if(swap==0)
				break;
		}
	}
}

