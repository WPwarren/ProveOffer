package Arithmetic2;

public class Problem_04 {

	public static boolean Find(int [][] array,int target) {
		if(array == null)
			return false;
		int rows = array.length;
		int cols = array[0].length;
		if(rows==0 || cols==0)
			return false;
		int row = 0;
		int col = cols-1;
		boolean finded = false;
		while(row<rows && col>=0){
			if(array[row][col]==target){
				finded = true;
				break;
			}else if(array[row][col]<target){
				row++;
			}else{
				col--;
			}
		}
		return finded;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print(Find(a,8));
	}

}
