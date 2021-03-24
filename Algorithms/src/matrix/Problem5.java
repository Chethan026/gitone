package matrix;
//Boundary traversal of a matrix
public class Problem5 {

	public static void main(String[] args) {
		int[][] mat = {{10,18,22},{15,20,32},{35,40,45}};
		
		boundaryTraversal(mat);
		
	}

	private static void boundaryTraversal(int[][] mat) {
		int R=mat.length;
		int C=mat[0].length;
		for (int i = 0; i < C; i++) {
			System.out.print(" "+mat[0][i]);
		}
		for (int i = 1; i < R; i++) {
			System.out.print(" "+mat[i][C-1]);
		}
		for (int i = C-2; i >=0 ; i--) {
			System.out.print(" "+mat[R-1][i]);
		}
		for (int i = R-2; i >0 ; i--) {
			System.out.print(" "+mat[i][0]);
		}
	}

}
