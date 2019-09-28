package Searching;
//find first occurrence of number in sorted array in O(logn) time.
public class Problem3 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,4,3,3,3,4,5};
		int x=3;
		int index=binSearch(arr1,0,arr1.length-1,x);
		System.out.println(index);
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
