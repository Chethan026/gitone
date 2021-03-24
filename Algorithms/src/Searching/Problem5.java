package Searching;
//Problem: given an infinite sorted array reduce time complexity from O(logn) to O(logk), where k is index of element to be searched. 
public class Problem5 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18};//assuming infinite array.
		int x=9;
		int index=infiniteArray(arr1,x);
		System.out.println(index);
	}
	public static int infiniteArray(int[] arr1, int x) {
		if(arr1[0]==x)
			return 0;
		int i=1;
		while(arr1[i]<x)
			i=i*2;
		return binSearch(arr1,i/2,i,x);
		
	}
	public static int binSearch(int []arr1,int l,int h,int x) {
		if(l>h)
			return -1;
		int mid= l+(h-l)/2;
		if((arr1[mid]==x)&&(mid==0) | arr1[mid-1]!=x)
			return mid;
		if(arr1[mid]>=x)
			return binSearch(arr1,l,mid-1,x);
		else
			return binSearch(arr1,mid+1,h,x);
	} 
}
