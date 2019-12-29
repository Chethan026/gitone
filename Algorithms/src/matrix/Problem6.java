package matrix;
//spiral order traversal of matrix
public class Problem6 {

	public static void main(String[] args) {
		int[][] mat = {{10,18,22},
					   {15,20,32},
					   {35,40,45}};
		int R=mat.length;
		int C=mat[0].length;
		spiralTraversal(mat,R,C,0,0);
		
	}

	private static void spiralTraversal(int[][] mat,int R,int C,int x,int y) {
		if(R>x && C>y) {
		for (int i = x; i < C; i++) {
			System.out.print(" "+mat[x][i]);
		}
		for (int i = x+1; i < R; i++) {
			System.out.print(" "+mat[i][C-1]);
		}
		for (int i = C-2; i >=y ; i--) {
			System.out.print(" "+mat[R-1][i]);
		}
		for (int i = R-2; i >x ; i--) {
			System.out.print(" "+mat[i][y]);
		}
		R--;C--;x++;y++;
		spiralTraversal(mat, R, C,x,y);
		}
	}

}
