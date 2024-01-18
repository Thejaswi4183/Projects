import java.io.*;
public class Players
{
    static String s[]=new String[10];
    static int score[]=new int[10];
    static int p=5;
    static void info()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print('\u000C');
        System.out.println("Enter number to Sign in or press \"6\" to Add Name");
        score[0]=10;
        score[1]=8;
        score[2]=9;
        score[3]=7;
        score[4]=8;
        s[0]="Thejaswi";
        s[1]="Narayana";
        s[2]="Govinda";
        s[3]="Vishnu";
        s[4]="Venkatesha";
        System.out.println("1."+s[0]);
        System.out.println("2."+s[1]);
        System.out.println("3."+s[2]);
        System.out.println("4."+s[3]);
        System.out.println("5."+s[4]);
        System.out.println("6.Add a Name");
        int v=Integer.parseInt(br.readLine());
        switch(v)
        {
            case 1:        
            System.out.print('\u000c');
            System.out.println("Welcome "+s[0]);
            System.out.println("Your score in Math Quiz:"+score[0]);
            Thread.sleep(3500);
            System.out.print('\u000c');
            break;
            case 2:
            System.out.print('\u000c');
            System.out.println("Welcome "+s[1]);
            System.out.println("Your score in Math Quiz:"+score[1]);
            Thread.sleep(3500);
            System.out.print('\u000c');
            break;
            case 3:
            System.out.print('\u000c');
            System.out.println("Welcome "+s[2]);
            System.out.println("Your score in Math Quiz:"+score[2]);
            Thread.sleep(3500);
            System.out.print('\u000c');
            break;
            case 4:
            System.out.print('\u000c');
            System.out.println("Welcome "+s[3]);
            System.out.println("Your score in Math Quiz:"+score[3]);
            Thread.sleep(3500);
            System.out.print('\u000c');
            break;
            case 5:
            System.out.print('\u000c');
            System.out.println("Welcome "+s[4]);
            System.out.println("Your score in Math Quiz:"+score[4]);
            Thread.sleep(3500);
            System.out.print('\u000c');
            break;
            case 6:
            System.out.print('\u000c');
            System.out.println("Enter your name");
            s[p]=br.readLine();
            System.out.print('\u000c');
            System.out.println("Welcome "+s[p]);
            Thread.sleep(3500);
            p++;
            System.out.print('\u000c');
            break;
            default:
            System.out.println("INVALID");
            info();
        }
    }
    void scores()throws IOException,InterruptedException
    {
        score[p-1]+=1;
    }
    void score()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print('\u000c');
        System.out.print("1."+s[0]);
        System.out.println("\tScore in Math Quiz:"+score[0]);
        System.out.print("2."+s[1]);
        System.out.println("\tScore in Math Quiz:"+score[1]);
        System.out.print("3."+s[2]);
        System.out.println("\tScore in Math Quiz:"+score[2]);
        System.out.print("4."+s[3]);
        System.out.println("\tScore in Math Quiz:"+score[3]);
        System.out.print("5."+s[4]);
        System.out.println("\tScore in Math Quiz:"+score[4]);
        System.out.print("6."+s[5]);
        System.out.println("\tScore in Math Quiz:"+score[5]);
        System.out.print("7."+s[6]);
        System.out.println("\tScore in Math Quiz:"+score[6]);
        System.out.print("8."+s[7]);
        System.out.println("\tScore in Math Quiz:"+score[7]);
        System.out.print("9."+s[8]);
        System.out.println("\tScore in Math Quiz:"+score[8]);
        System.out.print("10."+s[9]);
        System.out.println("\tScore in Math Quiz:"+score[9]);
        System.out.println("Press Enter to continue");
        br.readLine();
        System.out.print('\u000c');
        MAIN obj=new MAIN();
        obj.menu();
    }
}