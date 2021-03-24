package Searching;
//2 pointer approach to find integer sum equal to given number in sorted array.
public class Problem8 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,3,11,25,17,20,22,25,30};
		int x=56;
		boolean l=method1(arr1,0,arr1.length-1,x);//O(n) complexity
		System.out.println(l);
	}
	public static boolean method1(int[] arr1,int l, int h, int x) {
		while(l<h) {
			if(arr1[l]+arr1[h]==x)
				return true;
			if(arr1[l]+arr1[h]>x)
				h--;
			if(arr1[l]+arr1[h]<x)
				l++;
		}
		return false;
	} 
}
