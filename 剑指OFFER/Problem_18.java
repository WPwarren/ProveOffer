package Arithmetic2;

import java.util.ArrayList;

public class Problem_18 {

	public static ArrayList<Integer> printMatrix(int[][] matrix){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] flag = new int[rows][cols];
		
		int row = 0;
		int col = -1;
		int count = 0;
		
		while(count < rows*cols){
			col++;
			while(col<cols && flag[row][col]!=1){
				list.add(matrix[row][col]);
				flag[row][col] = 1;
				col++;
				count++;
			}
			col--;
			
			row++;
			while(row<rows && flag[row][col]!=1){
				list.add(matrix[row][col]);
				flag[row][col] = 1;
				row++;
				count++;
			}
			row--;
			
			col--;
			while(col>=0 && flag[row][col]!=1){
				list.add(matrix[row][col]);
				flag[row][col] = 1;
				col--;
				count++;
			}
			col++;
			
			row--;
			while(row>=0 && flag[row][col]!=1){
				list.add(matrix[row][col]);
				flag[row][col] = 1;
				row--;
				count++;
			}
			row++;
		}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1}};
		System.out.print(printMatrix(a));
	}

}
