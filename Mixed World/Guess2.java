import java.io.*;
class Guess2
{
    void Guess()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        fill abc=new fill();
        System.out.println("\t\t\t1.I will guess your age!\n\t\t\t2.Instructions\n\t\t\t3.Quit");
        int e=Integer.parseInt(br.readLine());
        switch(e)
        {
            case 1:
            System.out.print('\u000C');
            abc.load();
            System.out.println("I will guess your age!                                                                            [Press Enter]");
            br.readLine();
            System.out.println("First Multiply your age with 5                                                            [Press Enter if done]");
            br.readLine();
            System.out.println("Add 8 to the answer                                                                       [Press Enter if done]");
            br.readLine();
            System.out.println("Then multiply by 2                                                                        [Press Enter if done]");
            br.readLine();
            System.out.println("Subtract 6 from it                                                                         [Press Enter if done]");
            br.readLine();
            System.out.println("Then multiply by 10                                                                        [Press Enter if done]");
            br.readLine();
            System.out.println("Type the final answer");
            int ans=Integer.parseInt(br.readLine());
            int result=(ans-100)/100;
            System.out.println("Is your age "+result+"?");
            System.out.println("Press Enter to continue...");
            br.readLine();
            System.out.print('\u000C');
            MAIN ab=new MAIN();
            ab.menu(); 
            break;
            case 2:
            System.out.print('\u000C');
            abc.load();
            Instructions bcd=new Instructions();
            bcd.rules();
            break;
            case 3:
            System.out.print('\u000C');
            System.exit(0);
            break;
            default:System.out.println("INVALID");
        }
    }
}
            