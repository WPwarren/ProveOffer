package Arithmetic2;

public class Problem_66 {

	public static int movintCount(int threshold,int rows,int cols){
		if(threshold<0 || rows<0||cols<0)
			return 0;
		boolean[] visited = new boolean[rows*cols];
		for(int i=0;i<visited.length;i++)
			visited[i] = false;
		
		int length = movingCountCore(threshold,rows,cols,0,0,visited);
		return length;
	}
	private static int movingCountCore(int threshold, int rows, int cols,int row,int col,
			 boolean[] visited) {
		int count = 0;
		
		if(check(threshold,rows,cols,row,col,visited)){
			visited[row*cols+col] = true;
			count = 1 + movingCountCore(threshold,rows,cols,row-1,col,visited) +
					movingCountCore(threshold,rows,cols,row+1,col,visited) +
					movingCountCore(threshold,rows,cols,row,col-1,visited) +
					movingCountCore(threshold,rows,cols,row,col+1,visited);
		}
		
		return count;
	}
	private static boolean check(int threshold, int rows, int cols, int row,
			int col, boolean[] visited) {
		if(row>=0 && row<rows && col>=0 && col<cols && !visited[row*cols+col] &&
				getNum(row)+getNum(col)<=threshold)
			return true;
		return false;
	}
	private static int getNum(int row) {
		int num = 0;
		while(row != 0){
			num += row %10;
			row = row /10;
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
