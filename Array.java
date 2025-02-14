public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x)
	{
		int[][] matrix = new int[x][x];
		int value = 1;
		for (int row = 0; row < x; row++) {
			for (int col = 0; col < x; col++) {
				matrix[row][col] = value++;
			}
		}
		return matrix;
	}

	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x)
	{
		int[][] matrix = new int[x][x];
		int value = 1;
		for (int col = 0; col < x; col++) {
			for (int row = 0; row < x; row++) {
				matrix[col][row] = value++;
			}
		}
		return matrix;
	}

	// Array should be of format
	// 1  2  3  4
	// 5 6 7 8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column)
	{
		int[][] matrix = new int[row][column];
		int value = 1;
		for (int r = 0; r < row; r++) {
			for (int col = 0; col < column; col++) {
				matrix[r][col] = value++;
			}
		}
		return matrix;
	}

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row)
	{
		int[][] matrix = new int[column][row];
		int value = 1;
		for (int col = 0; col < column; col++) {
			for (int r = 0; r < row; r++) {
				matrix[col][r] = value++;
			}
		}
		return matrix;
	}

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a) {
		for (int[] row : a) {
			for (int num : row) {
				if (num < 10) {
					System.out.printf(" %d  ", num);  // Extra space for single-digit numbers
				} else {
					System.out.printf("%d  ", num);   // Normal spacing for two-digit numbers
				}
			}
			System.out.println(); // Move to the next line after printing a row
		}
	}
}