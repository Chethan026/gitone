package Arrays;
//inserting in middle of array
public class Problem2 {
	static int[] a = new int[10];
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			a[i]=i;
		}
		for (int i = 0; i < 5; i++)
			System.out.print(a[i]);
		int index=0;
		int value=7;
		 insert(index,value);
		 System.out.println();
		 for (int i = 0; i < 5; i++)
				System.out.print(a[i]);
	}
	private static void insert(int index, int value) {
		int temp=a[index];
		a[index]=value;
		for (int i = index+1; i < a.length; i++) {
			int temp2=a[i];
			a[i]=temp;
			temp=temp2;
		}
	}
}
