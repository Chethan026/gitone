package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] a= {20,40,50,1,5,4,3,2};
		printArray(a);
		System.out.println();
		mergesort(a, 0, a.length-1);
		printArray(a);
	}
	public static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void mergesort(int[] arr, int s, int e) {
		if(s<e) {	
		int p=(s+e)/2;
		mergesort(arr,s,p);
		mergesort(arr,p+1,e);
		mergeprocedure(arr,s,p,e);
		}
	}
	public static void mergeprocedure(int[] a1,int s,int p,int e) {
		int n1=p-s+1;
		int n2=e-p;
		
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		
		for(int i=0;i<arr1.length;i++)
			arr1[i]=a1[s+i];
		for(int j=0;j<arr2.length;j++)
			arr2[j]=a1[p+1+j];
		
		
		int i=0,j=0;
		int k=s;
		
		while(i<n1 && j<n2) {
			
			if(arr1[i]<=arr2[j]) {
				a1[k]=arr1[i];
				i++;
			}
			else {
				a1[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a1[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			a1[k]=arr2[j];
			j++;
			k++;
		}
	}

}
/*
  MergeSort is based on Divide and conquer approach, 
  Best time complexity = O(nlogn); worst time complexity=O(nlogn);
  It takes extra space which is equal to input array, hence space complexity is O(n).
 */