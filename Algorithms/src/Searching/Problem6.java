package Searching;
//Given an sorted and rotated array, find element in O(logn) time.
public class Problem6 {

	public static void main(String[] args) {
		int [] arr1 = {6,7,8,9,11,12,13,14,15,16,17,18,1,2,3,4,5};//assuming infinite array.
		int x=9;
		int pivot=infiniteArray(arr1,0,arr1.length-1);
		System.out.println(pivot);
		if(arr1[pivot]>x && x>arr1[0]) {
			int index=binSearch(arr1,0,pivot,x);
			System.out.println(index);
			}
		else {
			int index=binSearch(arr1,pivot+1,arr1.length-1,x);
			System.out.println(index);
		}
		
	}
	public static int infiniteArray(int[] arr1, int l,int h) {
		int mid=l+(h-l)/2;
		if(arr1[mid]>arr1[mid-1]&&arr1[mid]>arr1[mid+1])
			return mid;
		if(arr1[mid]>arr1[l])
			return infiniteArray(arr1,mid+1,h);
		if(arr1[mid]<arr1[l])
			return infiniteArray(arr1,l,mid-1);
		else
			return -1;
		
	}
	public static int binSearch(int []arr1,int l,int h,int x) {
		if(l>h)
			return -1;
		int mid= l+(h-l)/2;
		if(arr1[mid]==x)
			return mid;
		if(arr1[mid]>x)
			return binSearch(arr1,l,mid-1,x);
		else
			return binSearch(arr1,mid+1,h,x);
	} 
}
