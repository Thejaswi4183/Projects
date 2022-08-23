public class diamond
{  
public static void main(String[] args) 
  {
    int i,j,k,b;
    b=5;
        for( i=1;i<5;i++)
        {  
            for(j=1;j<b;j++)
            System.out.print(" ");
            b--;
            for(k=1;k<2*i;k++)
            System.out.print("*");
            System.out.println("");
        }
        b=1;
        for( i=1;i<5;i++)
        {  
            for(j=1;j<=b;j++)
            System.out.print(" ");
            b++;
            for(k=1;k<2*(5-i);k++)
            System.out.print("*");
            System.out.println("");
        }
  } 
 }