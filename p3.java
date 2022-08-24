public class p3 
{
    public static void main(int n) 
    {
        int x=1,flag=0;
        while(x!=n)
        {
           if(n==Math.pow(3,x))
            {
              flag=1;
              System.out.println("True");
              break;
            }
            x++;        
        }
        if(flag==0)
          System.out.println("False");
    }
}


