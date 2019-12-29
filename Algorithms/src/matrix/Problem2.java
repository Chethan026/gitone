package matrix;
//Transpose of a matrix
public class Problem2 {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		Transpose(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
	}

	private static void Transpose(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = i+1; j < mat[i].length; j++) {
				int t=mat[j][i];
				mat[j][i]=mat[i][j];
				mat[i][j]=t;
			}
		}
	}

}
