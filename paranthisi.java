public class paranthisi {
    public static void main(String args[])
    {
     String str=")";
System.out.println( paran(str,0,0,0));
    }
    public static int paran(String str,int index,int open ,int close){
        if(str.charAt(str.length()-1)=='(')
        {
            return -1;
        }
        if(index>str.length()-1)
        {
            if(open==close)
            {
                return 1;
            }
            else{
                return -1;
            }
        }
        if(str.charAt(index)=='(')
        {
            open++;
        }
        else if(str.charAt(index)==')'){
            close++;
        }
        
        
        index++;
            return paran(str,index,open,close) ;
        
     
    }
}
