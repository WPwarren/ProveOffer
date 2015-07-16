package Arithmetic2;


public class Problem_09 {

	public int minNumberInRotateArray(int [] array) {
    	int flag = findPlace(array);
        Reverse(array,0,flag);
        Reverse(array,flag+1,array.length-1);
        Reverse(array,0,array.length-1);
        return array[0];
    }
    
    public int findPlace(int[] array){
        int i;
        for(i=0;i<array.length-1;i++){
            if(array[i]>array[i+1] )
                break;
        }
        return i;
    }
    
    public void Reverse(int[] array,int start,int end){
        int temp;
        int i,j;
        for(i= start,j=end ; i < j;i++,j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,1,2,2,2};
		Problem_09 p =new Problem_09();
		p.minNumberInRotateArray(a);
		for(int i : a)
			System.out.print(i);
	}

}
