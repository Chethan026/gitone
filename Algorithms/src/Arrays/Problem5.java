package Arrays;
//deleting element in array
public class Problem5 {

	static int[] a = new int[10];
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			a[i]=i;
		}
		System.out.println("Size before "+a.length);
		int value=7;
		 int size=delete(value);
		 System.out.println("Size after "+a.length);
		 
		 for (int i = 0; i < 10; i++)
				System.out.print(a[i]);
		 
	}
	private static int delete(int value) {
		int i;
		for (i = 0; i < a.length; i++) {
			if(a[i]==value)
				break;
		}
		if(i==a.length)
			return a.length;
		for (int j = i; j < a.length-1; j++) {
			a[j]=a[j+1];
		}
		return a.length-1;
	}

}
