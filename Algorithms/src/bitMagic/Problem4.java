package bitMagic;

public class Problem4 {

	public static void main(String[] args) {
		//Finding the one odd occurring number in array.
		int[] arr= {3,3,4,5,4,5,5,6};
		// x^0=x; x^y=y^x; (x^y)^z=x^(y^z);
		//even occurring element will cancel each other.
		int j=0;
		for(int i=0;i<arr.length;i++) {
			j=j^arr[i];
		}
		System.out.println(j);
		//Finding the 2 odd occurring numbers in array.
		
	}

}
