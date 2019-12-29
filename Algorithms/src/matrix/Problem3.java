package matrix;
//Rotate Matrix by 90 degree counter clockwise
//sol: take transpose of a matrix then reverse the columns
public class Problem3 {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	
		Transpose(mat);
		rowsReverse(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private static void rowsReverse(int[][] mat) {
		for (int j = 0; j < mat.length; j++) {
			int l = mat.length-1;
			for (int i = 0; i < mat.length; i++) {
				if(l>i) {
				int t = mat[i][j];
				mat[i][j]=mat[l][j];
				mat[l][j]=t;
				l--;
				}
			}
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
