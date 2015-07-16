package Arithmetic2;


public class Problem_65 {

	public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
		if(matrix == null || rows<0 || str==null || cols<0){
			return false;
		}
		
		boolean[] visited = new boolean[rows*cols];
		for(int i = 0;i<visited.length;i++)
			visited[i] = false;
		Integer pathLength = 0;
		
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				if(hasPathCore(matrix,rows,cols,str,row,col,pathLength,visited));
					return true;
			}
		}
		
		return false;
	}
	private boolean hasPathCore(char[] matrix, int rows, int cols, char[] str,
			int row, int col, Integer pathLength, boolean[] visited) {
		if(pathLength == str.length){
			return true;
		}
		boolean hasPath = false;
		
		if(row>=0 && row<rows && col>=0 && col<cols && matrix[row*cols+col]==str[pathLength] && !visited[row*cols+col]){
			visited[row*cols+col] = true;
			pathLength ++;
			
			hasPath = hasPathCore(matrix,rows,cols,str,row-1,col,pathLength,visited)||
					hasPathCore(matrix,rows,cols,str,row+1,col,pathLength,visited) || 
					hasPathCore(matrix,rows,cols,str,row,col-1,pathLength,visited) ||
					hasPathCore(matrix,rows,cols,str,row,col+1,pathLength,visited);
			
			if(!hasPath){
				visited[row*cols+col] = false;
				pathLength--;
			}
		}
		return hasPath;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_65 p = new Problem_65();
		char[] matrix = {'a','b','c','e','s','f','c','s','a','d','e','e'};
		int rows = 3;
		int cols = 4;
		char[] str = {'b','c','c','e','d'};
		
		boolean result = p.hasPath(matrix, rows, cols, str);
		System.out.print(result);
	}

}
