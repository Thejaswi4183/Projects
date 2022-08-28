public class hollowtriangle
{  
public static void pattern(int n) 
{
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n-i; j++)
        {
           System.out.print(" ");
        }
        if(i==1 || i==n)
        {
        for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
        }
        }
        else
        {
            for(int k=1;k<2*i;k++)
            {
                if(k==1 | k==2*i-1)
                {
                System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}

public static void main(String[] args)
{
    pattern(5);
}
}