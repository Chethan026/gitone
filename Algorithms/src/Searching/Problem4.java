package Searching;
//Problem: find number of occurence of number in sored array, in O(logn) time.
public class Problem4 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,3,4,4,4,4,4,4,4};
		int x=4;
		int l=leftMost(arr1,0,arr1.length-1,x);
		int r=rightMost(arr1,0,arr1.length-1,x);
		System.out.println(r-l+1);

	}
	public static int leftMost(int []arr1,int l,int h,int x) {
		if(l>h)
			return -1;
		int mid= l+(h-l)/2;
		if((arr1[mid]==x)&&((mid==0) || arr1[mid-1]!=x))
			return mid;
		if(arr1[mid]>=x)
			return leftMost(arr1,l,mid-1,x);
		else
			return leftMost(arr1,mid+1,h,x);
	} 
	public static int rightMost(int []arr1,int l,int h,int x) {
		if(l>h)
			return -1;
		int mid= l+(h-l)/2;
		if((arr1[mid]==x)&&((mid==h) || arr1[mid+1]!=x))
			return mid;
		if(arr1[mid]>x)
			return rightMost(arr1,l,mid-1,x);
		else
			return rightMost(arr1,mid+1,h,x);
	} 
}
