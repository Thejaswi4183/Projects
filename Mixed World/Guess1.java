import java.io.*;
class Guess1
{
    void guess()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        fill abc=new fill();
        System.out.println("\t\t\t1.I will guess the number in your mind\n\t\t\t2.Instructions\n\t\t\t3.Quit");
        int a=Integer.parseInt(br.readLine());
        switch(a)
        {
            case 1:
            System.out.print('\u000C');
            abc.load();
            System.out.println("Keep a number BETWEEN 0 AND 20 IN YOUR MIND                         [You can keep even 0 OR 20][Press Enter]");
            br.readLine();
            System.out.println("Add 5 to the number                                                                            [Press Enter]");
            br.readLine();
            System.out.println("Multiply the answer with 3                                                                     [Press Enter]");
            br.readLine();
            System.out.println("Subtract that with 15                                                                          [Press Enter]");
            br.readLine();
            System.out.println("Type the final answer");
            int ans=Integer.parseInt(br.readLine());
            int result=ans/3;
            System.out.println("Was the number "+result+"?");
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
            