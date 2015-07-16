package Arithmetic2;

public class Problem_54 {

	int[] result = new int[256];
    int index = 1;
    public Problem_54(){
        for(int i=0;i<256;i++)
            result[i] = -1;
    }
	//Insert one char from stringstream
	void Insert(char ch)
	{
		if(result[ch] == -1){
            result[ch] = index;
        }else if(result[ch]>0){
            result[ch] = -2;
        }
        index++;
	}
  //return the first appearence once char in current stringstream
	char FirstAppearingOnce()
	{
	 	int min = Integer.MAX_VALUE;
        char ch = '\0';
        for(int i=0;i<256;i++){
            if(result[i]>0 && result[i]<min){
                min = result[i];
                ch = (char)i;
            }
        }
        
        if(ch=='\0')
            return '#';
        else 
            return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_54 p = new Problem_54();
		String s = "google";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++){
			p.Insert(ch[i]);
		}
		System.out.print(p.FirstAppearingOnce());
	}

}
