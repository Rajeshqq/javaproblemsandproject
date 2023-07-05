public class Mo {
    public static void main(String args[])

    {
        int x=20;
        int y=5;
        int z=100;
        int count1=0;
        int count2=0;
        int n;
       
        int fact=0;
        if(z<=5)
        {
            System.out.println("0");
       System.out.println(y); 
       System.exit(0);
        }
        if(z/5<x)
        {
             n=z/5;
        }
        else{
        n=x;
        }
        for(int i=1;i<=n;i++)
        { 
            if(fact>=z)
            {
                 
                break;
            }
            fact=fact+5;
            count1++;
            
        }
        System.out.println(fact);
        if(fact==z)
        {
        System.out.println(count1);
       System.out.println(count2);
       System.exit(0);
        }
        else{
            for(int j=1;j<=y;j++)
            {
                fact=fact+1;
                count2++;
                if(fact>=z)
                {
                    break;
                }
                
            }
        }
        if(fact==z)
        {
            System.out.println(fact);
        System.out.println(count1);
        System.out.println(count2);
        }
        else
        {
            System.out.println(fact);
            System.out.println("-1");
        }
    }
}
