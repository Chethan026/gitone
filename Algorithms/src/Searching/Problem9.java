package Searching;
//Problem: find sum of a number equal to triplet in given sorted array.
public class Problem9 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,3,11,25,17,20,22,25,30};
		int x=6;
		boolean l=method1(arr1,x);//O(n*n*n) complexity
		System.out.println("O(n*n*n)"+l);
		boolean l2=method2(arr1,0,arr1.length-1,x);//)(n*n) complexity
		System.out.println("O(n*n)"+l2);
	}
	public static boolean method1(int[] arr1,int x) {
		for (int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				for(int k=j+1;k<arr1.length;k++) {
				if(arr1[i]+arr1[j]+arr1[k]==x)
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean method2(int[] arr1,int l, int h, int x) {
		while(l<h) {
			for (int i=0;i<arr1.length;i++) {
				if(isPair(arr1,i+1,h,x-arr1[i]))
					return true;
		}
	}
		return false;
}
	
	public static boolean isPair(int[] arr1,int l, int h, int x) {
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
