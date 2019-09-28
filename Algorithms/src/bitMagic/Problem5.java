package bitMagic;
//Finding all subsets of a string
public class Problem5 {
	public static void main(String[] args) {
		char[] arr= {'a','b','c'};
		int count=(1<<arr.length);
		for(int i=0;i<count;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i&(1<<j))!=0) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}

}
