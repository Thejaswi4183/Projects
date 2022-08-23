public class mirrored_triangle
{  
public static void main(String[] args) 
  {
    int i,j,k,b;
    b=5;
        for( i=1;i<=5;i++)
        {  
            for(j=1;j<b;j++)
            System.out.print(" ");
            b--;
            for(k=1;k<=i;k++)
            System.out.print("*");
            System.out.println("");
        }
        }
}