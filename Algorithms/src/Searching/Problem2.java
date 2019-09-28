package Searching;
//Binary array search, Time complexity o(logn); sorted array search.
public class Problem2 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6,7,8,9};
		int x=8;
		int index=binSearch(arr1,0,arr1.length-1,x);
		System.out.println(index);
	}
	public static int binSearch(int []arr1,int l,int h,int x) {
		if(l>h)
			return -1;
		int mid= l+(h-l)/2;
		if(arr1[mid]==x)
			return mid;
		if(arr1[mid]>=x)
			return binSearch(arr1,l,mid-1,x);
		else
			return binSearch(arr1,mid+1,h,x);
	} 
}
