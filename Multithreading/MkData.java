public class MkData {
	public static double[][] generateRandomData(int n,int m) {
		double[][] arr = new double[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = Math.random();
			}
		}

		return arr;
	}
}