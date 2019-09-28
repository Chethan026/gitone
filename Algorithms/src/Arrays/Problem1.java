package Arrays;
//Reversing given array with less than O(n) time.
public class Problem1 {

	public static void main(String[] args) {
		int[] arr= {8,6,4,2,1};
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
		System.out.println();
		int[] arr1=rev(arr);
		for(int i=0;i<arr1.length;i++) System.out.print(arr1[i]);
	}
	public static int[] rev(int[] arr) {
		int low =0;
		int high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;high--;
		}
		return arr;
		
	}

}
