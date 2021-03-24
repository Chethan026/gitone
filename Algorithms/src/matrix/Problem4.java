package matrix;
//search element in row wise and column wise sorted matrix
//time O(R+C).
public class Problem4 {

	public static void main(String[] args) {
		int[][] mat = {{10,18,22},{15,20,32},{35,40,45}};
		int x=45;
		
	System.out.println(findElement(mat,x));
		
	}

	private static boolean findElement(int[][] mat, int x) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = mat[i].length-1; j >= 0 ; j--) {
				if(x>mat[i][j])
					break;
				if(x==mat[i][j])
					return true;
				if(x<mat[i][j])
					continue;
			}
		}
		return false;
		
	}

}
