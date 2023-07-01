//import java.lang.reflect.Method;
import java.util.*;


 
  class Train
{ 
      protected int age[]=new int[10] ;
	  protected int id[]=new int[10];
	  protected int no;
     protected  String[] name=new String[10]; 
     protected int tier1,tier2,tier3; 
     protected String type;
             Train() 
             { 
                 tier1=2; 
                 tier2=50; 
                 tier3=50; 
          
             } 
  Scanner sc=new Scanner(System.in); 
       
   public void details() 
   { 
int i;
 
System.out.println("enter the tier you want book the ticket");
type=sc.next();
System.out.println("enter the number of seats"); 
   no=sc.nextInt(); 
for(i=1;i<=no;i++)
{
  
   System.out.println("enter the name "); 
   name[i]=sc.next(); 
   System.out.println("enter the age "); 
   age[i]=sc.nextInt(); 
   System.out.println("enter the id"); 
   id[i]=sc.nextInt(); 
}

   
    
   } 
 public int book() 
 { 
 
if(type.equals("tier1")== true)
{   
  if(no<=tier1) 
       { 
           tier1=tier1-no; 
           return 1; 
       } 
		else 
		{
		System.out.println("there is no enough seats");
		System.out.println("try tier2 0r 3");

		}
}
else if(type.equals("tier2")==true)
{


        if(no<=tier2) 
       { 
           tier2=tier2-no; 
           return 1; 
       } 
		else
		{
			System.out.println("there is no enough seats");
			System.out.println("try tier2 0r 3");

		}
}
else if(type.equals("tier3")==true)
{
        if(no<=tier3) 
       { 
           tier3=tier3-no; 
           return 1; 
       } 
        else
{
		System.out.println("there is no enough seats");
        System.out.println("try tier2 0r 3");

}
}
else 
{
    System.out.println("enter the correct tier");
    

   
    
}


       return 0; 
        
        
   } 
 public void cancel() 
   { 
       int cancel;
String type1;

		
    System.out.println("which tier do you booked the ticket");
    type1=sc.next();
       System.out.println("how many ticket you want to cancel"); 
       
       cancel=sc.nextInt(); 
      if(cancel<=no) 
      { 
 no=no-cancel; 
 
if(type1.equals("tier1")==true)

{
   
          if(tier1<=2) 
          { 
              tier1=tier1+cancel; 
          } 
}
else if(type1.equals("tier2")==true)
{
  if(tier2<=50) 
 { 
  tier2=tier2+cancel; 
 } 
}
else if(type1.equals("tier3")==true)
{
  if(tier3<=50) 
 { 
 tier3=tier3+cancel; 
 } 
}
          System.out.println("your ticket canceled successfully"); 
      } 
          else 
          { 
                  System.out.println("you didn't book any ticket yet"); 
                  } 
      }
} 
 
public class Reservation extends Train{ 
 
   protected int cost; 
   int cost()
   {
    if(type.equals("tier1")==true)
    {
        cost=120;
        return cost;
    }
    else if(type.equals("tier2")==true)
    {
        cost=240;
        return cost;
        
    }
    else  if(type.equals("tier3")==true)
    {
        cost=350;
        return cost;
    }
    return 0;
    }
   
   void bill() 
   { 
int i;
if(no!=0) 
{ 
System.out.println("no of seat you booked"+no); 
System.out.println("passenger details");
for(i=1;i<=no;i++)
{
       System.out.println("name:"+name[i]); 
        System.out.println("age:"+age[i]); 
         System.out.println("id:"+id[i]);
} 
         
          System.out.println("cost of the ticket"+cost()*no); 
} 
else 
System.out.println("you didn't book ticket yet"); 
   } 
 
     
    public static void main(String[] args) { 
         
        int option; 
        Reservation ob= new Reservation(); 
       
        try (Scanner ob1 = new Scanner(System.in)) {
            while(true) 
             { 
            System.out.println("RAILWAY RESERVATION"); 
            System.out.println("1.book()"); 
            System.out.println("2.cancel()"); 
            System.out.println("3.bill()");    
            System.out.println("4.exit()"); 
            System.out.println("enter the option"); 
            
                option=ob1.nextInt();
            
            switch(option) 
            { 
                case 1: 
                    ob.details(); 
                    int temp=ob.book(); 
                    if(temp==1) 
                    System.out.println("your seat is booked succesfully"); 
                    else 
                        System.out.println("sorry the seats are reserved"); 
                    break; 
                case 2: 
                     ob.cancel(); 
                     break; 
                case 3: 
                    ob.bill(); 
                    break; 
                case 4: 
                    System.exit(0); 
                default : 
                    System.out.println("enter the correct option"); 
                     
            } 
                    }
        } 
                
         
    } 
    
     }