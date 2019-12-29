package Arrays;
//Trapping Rain water problem
public class Problem11 {

	public static void main(String[] args) {
		int[] a = { 5, 0, 6, 2, 3 };
		
		System.out.println(getWater1(a));//Time O(n*n) space O(1)
		
		System.out.println(getWater2(a));//TimeO(n) space O(n)
		
	}

	private static int getWater2(int[] a) {
		int res=0;
		int[] Lmax = new int[a.length];
		int[] Rmax = new int[a.length];
		Lmax[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>Lmax[i-1])
				Lmax[i]=a[i];
			else
				Lmax[i]=Lmax[i-1];
		}
		Rmax[a.length-1]=a[a.length-1];
		for (int i = a.length-2; i >=0; i--) {
			if(a[i]>Rmax[i+1])
				Rmax[i]=a[i];
			else
				Rmax[i]=Rmax[i+1];
		}
		
		for (int i = 1; i < a.length-1; i++) {
			res=res+Math.min(Lmax[i], Rmax[i])-a[i];
		}
		
		return res;
	}

	private static int getWater1(int[] a) {
		int res=0;
		for (int i = 1; i < a.length-1; i++) {
			int lMax = a[i];
			for (int j = 0; j < i; j++) {
				lMax=Math.max(a[j], lMax);
			}
			int RMax = a[i];
			for (int j = i+1; j < a.length; j++) {
				RMax=Math.max(RMax, a[j]);
			}
			res=res+Math.min(lMax, RMax)-a[i];
		}
		return res;
	}

}
