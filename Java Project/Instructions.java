import java.io.*;
class Instructions
{
    void rules()throws IOException,InterruptedException
    {
      System.out.print('\u000C');
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      MAIN obj=new MAIN();
      System.out.println("1.Math Quiz");
      System.out.println("2.Brain Teasers");
      System.out.println("3.IQ Test");
      System.out.println("4.I will guess the number you have in your mind!");
      System.out.println("5.I will guess your age!");
      int c=Integer.parseInt(br.readLine());
      switch(c)
      {
          case 1:
          System.out.println("*Math Quiz is a game which blows your mind thinking");
          System.out.println("*In this game, the computer displays 10 questions which will leave you thinking for the answer");
          System.out.println("*The computer gives you ten seconds to answer each question");
          System.out.println("*If you give the correct answer you will get one point");
          Thread.sleep(5000);
          System.out.println("*Answer HONESTLY and do not cheat");
          System.out.println("*Now play the game\nPress Enter to continue...");
          Thread.sleep(5000);
          br.readLine();
          MathQuiz ab1=new MathQuiz();
          ab1.math();                      
          break;
          case 2:
          System.out.println("*Brain Tesers is like a game but not really a game");
          System.out.println("*In this game the computer will ask very difficult questions and riddles");
          System.out.println("*COUNT your score without fail because in the end you will know how smart you are!\nNow play the game");
          Thread.sleep(5000);
          System.out.println("*Press Enter to continue...");
          br.readLine();
          BrainTeasers ab2=new BrainTeasers();
          ab2.Brain();  
          break;
          case 3:
          System.out.println("*IQ TEST will check your IQ by asking just 10 questions.");
          System.out.println("*In this game the computer will ask you 10 questions and you have 10 seconds each,to answer.");
          System.out.println("*COUNT your score without fail because in the end you will know how smart you are!\nNow play the game");
          Thread.sleep(5000);
          System.out.println("*Press Enter to continue...");
          br.readLine();
          IQtest ab3=new IQtest();
          ab3.iq();
          break;
          case 4:
          System.out.println("\"I will guess the number\" is not a game.");
          System.out.println("The computer will guess the number you have in your mind by asking you to do simple calculations with that number");
          System.out.println("in your mind");
          Thread.sleep(5000);
          System.out.println("*Press Enter to continue...");
          br.readLine();
          Guess1 ab4=new Guess1();
          ab4.guess();  
          break;
          case 5:
          System.out.println("\"I will guess your age\" is not a game.");
          System.out.println("The computer will guess yor age by asking you to do simple calculations with your age");
          Thread.sleep(4000);
          System.out.println("*Press Enter to continue...");
          br.readLine();
          Guess2 ab5=new Guess2();
          ab5.Guess();  
          break;
          default:System.out.println("INVALID");
      }
      System.out.println(" Press Enter key to continue...");
      br.read();
      System.out.print('\u000C');
      obj.menu();
    }
}