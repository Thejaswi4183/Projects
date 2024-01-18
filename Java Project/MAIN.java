import java.io.*;
class MAIN
{
    void MAIN()throws IOException,InterruptedException
    {
        fill abc=new fill();
        abc.logo();
        Players stu=new Players();
        stu.info();
        menu();
    }
    void menu()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Instructions xyz=new Instructions();
        fill abc=new fill();
        System.out.println("\t\t\tEnter your choice");
        System.out.println("1.Math Quiz");
        System.out.println("2.Brain Teasers");
        System.out.println("3.IQ Test");
        System.out.println("4.I will guess the number you have in your mind!");
        System.out.println("5.I will guess your age!");
        System.out.println("6.Credits");
        System.out.println("7.High Scores");
        System.out.println("8.New Player");
        System.out.println("9.Quit\n");
        try
        {
            int y=Integer.parseInt(br.readLine());
            switch(y)
            {
            case 1:
            System.out.println('\u000C');
            abc.load();
            MathQuiz ob1=new MathQuiz();
            ob1.math();
            break;
            case 2:
            System.out.println('\u000C');
            abc.load();
            BrainTeasers ob2=new BrainTeasers();
            ob2.Brain();
            break;
            case 3:
            System.out.println('\u000C');
            abc.load();
            IQtest ob3=new IQtest();
            ob3.iq();
            break;
            case 4:
            System.out.println('\u000C');
            abc.load();
            Guess1 ob4=new Guess1();
            ob4.guess();
            break;
            case 5:
            System.out.println('\u000C');
            abc.load();
            Guess2 ob5=new Guess2();
            ob5.Guess();
            break;
            case 6:
            System.out.println('\u000C');
            Credits ob6=new Credits();
            ob6.credits();
            break;
            case 7:
            System.out.println('\u000C');
            Players ob7=new Players();
            ob7.score();
            break;
            case 8:
            System.out.println('\u000C');
            Players ob8=new Players();
            ob8.info();
            menu();
            break;
            case 9:
            System.out.println('\u000C');
            System.exit(0);
            break;
            default:System.out.println("INVALID");
            menu();
            }
    }
    catch(Exception e)
    {
        System.out.println("INVALID");
        menu();
    }
    }
}