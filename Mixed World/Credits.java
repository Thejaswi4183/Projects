import java.io.*;
class Credits
{
     static void credits()throws IOException,InterruptedException
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          for(int i=17;i>0;i--)
          {
              for(int j=i;j>0;j--)
              {
                    System.out.println();
              }
              System.out.println("\t\tDesigning:Thejaswi.S");
              System.out.println("\t\tCoding:Thejaswi.S");
              System.out.println("\t\tTesting:Thejaswi.S   ");
              System.out.println("\t\tExecutive:Thejaswi.S");
              System.out.println("\t\tMarketing:Thejaswi.S");
              Thread.sleep(300);
              System.out.print('\u000C');
          }
          System.out.print("\t\tPress Enter to Continue...");
          br.read();
          System.out.print('\u000C');
          MAIN m=new MAIN();
          m.menu();
     }
}
     