package Arrays;
//Stock Buy and Sell //Two conditions not considered: loss in decreasing/increasing order. 
public class Problem4 {

	public static void main(String[] args) {
		int[] arr= {10,5,3,17};
		int profit=profit(arr);
		System.out.println(profit);
	}
	public static int profit(int[] arr) {
		int[] Min=new int[arr.length];
		int min=0;
		int[] Max=new int[arr.length];
		int max=0;
		int profit=0;
		for(int i=0; i<arr.length;i++) {
			if(i==0) {
				Min[min]=arr[i];min++;
				continue;
			}
			if(i==arr.length-1&&(arr[i-1]<arr[i])) {
				Max[max]=arr[i];max++;
				continue;
			}
			if(i==arr.length-1&&(arr[i-1]>arr[i])) {
				Max[max]=arr[i-1];max++;
				continue;
			}
			if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]) {
				Max[max]=arr[i];max++;
			}
			if(arr[i-1]>arr[i]&&arr[i]<arr[i+1]) {
				Min[min]=arr[i];min++;
			}
			
		}
		for(int i=0;i<Min.length;i++) {
			profit+=(Max[i]-Min[i]);
	} 
		return (profit>=0)?profit:0;
}
}
