import java.io.*;
public class MathQuiz
{
    void questions()throws IOException,InterruptedException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.print('\u000C');
         int score=0;
         System.out.println("ALL OF THEM ARE EASY YET MOST OF THEM FAIL!!:(");
         System.out.println("1. What is (999 − 99 + 9) ÷ 9?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans=Integer.parseInt(br.readLine());
         if(ans==101)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("CORRECT!");
             System.out.println("It was very easy");
             System.out.println("Lets go to the next Question....");
         }
         else if(ans!=101 && ans>=0 || ans!=101 && ans<=0)
         {
             System.out.println("WRONG!\nBetter Luck next time.");
             System.out.println("One method is to first work out the value of the expression in the brackets and then divide the result by 9."); 
             System.out.println("This gives (999 − 99 + 9) ÷ 9 = 909 ÷ 9 = 101.");
             System.out.println("Alternatively, we can first divide each number in the bracket by 9 and then evaluate the resulting expression."); 
             System.out.println("This gives (999 − 99 + 9) ÷ 9 = (111 − 11 + 1) = 101."); 
             System.out.println("Lets go to the next Question....");
         }
         Thread.sleep(7000);
         System.out.print('\u000C');
         System.out.println("2. How many minutes are there in 1/12 of a day?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans1=Integer.parseInt(br.readLine());
         if(ans1==120)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("VERY GOOD!");
             System.out.println("There are 24 hours in a day. 24 divided by 12 = 2. And in 2 hours there are 120 minutes.");
             System.out.println("Lets go to the next Question....");
         }
         else if(ans1!=120 && ans1>=0 || ans!=120 && ans1<=0)
         {
             System.out.println("WRONG!\nThere are 24 hours in a day. 24 divided by 12 = 2. And in 2 hours there are 120 minutes.");
             System.out.println("Better Luck next time.It was a little bit tricky");
             System.out.println("Lets go to the next Question....");
         }
         Thread.sleep(7000);
         System.out.print('\u000C');
         System.out.println("NOW IT'S TIME TO ACTIVATE YOUR BRAIN");
         System.out.println("3. The number 987,654,321 is multiplied by 9. HOW MANY TIMES DOES THE DIGIT 8 OCCUR IN THE RESULT?");
         Thread.sleep(10000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans2=Integer.parseInt(br.readLine());
         if(ans2==9)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("EXCELLENT!");
             System.out.println("For this one you just have to be good at long multiplication.");
             System.out.println("Lets go to the next Question....");
         }
         else if(ans2!=9 && ans>=0 || ans2!=9 && ans2<=0)
         {
             System.out.println("WRONG!\nFor this one you just have to be good at long multiplication.\nSorry!");
             System.out.println("Better Luck next time.It was a little bit tricky");
             System.out.println("Lets go to the next Question....");
         }
         Thread.sleep(7000);
         System.out.print('\u000C');
         System.out.println("NOW IT'S WILL BE SIMPLE BUT A LITTLE CONFUSING");
         System.out.println("4.What is the difference between the smallest 4-digit number and the largest 3-digit number?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans3=Integer.parseInt(br.readLine());
         if(ans3==1)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("YOUR BRAIN IS WORKING!!:)");
             System.out.println("The smallest 4-digit number is 1000.");
             System.out.println("The largest 3-digit number is 999. So their difference is equal to 1000 − 999 = 1.");
             System.out.println("Lets go to the next Question....");
         }
         else if(ans3!=1 && ans3>=0 || ans3!=1 && ans3<=0)
         {
             System.out.println("WRONG!");
             System.out.println("The smallest 4-digit number is 1000.");
             System.out.println("The largest 3-digit number is 999. So their difference is equal to 1000 − 999 = 1.");
             System.out.println("Better Luck next time.It was a little bit tricky");
             System.out.println("Lets go to the next Question....");
         }
         Thread.sleep(7000);
         System.out.print('\u000C');
         System.out.println("5. In my row in the theatre the seats are numbered consecutively from T1 to T50."); 
         System.out.println("I am sitting in seat T17 and you are sitting in seat T39. How many seats are there between us?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans4=Integer.parseInt(br.readLine());
         if(ans4==21)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("AWESOME!");
             System.out.println("The seats between us are numbered from T18 up to T38.");
             System.out.println("So the seats between us are the 38 seats from T1 up to T38, other than the 17 seats from T1 up to T17."); 
             System.out.println("So there are 38 − 17 = 21 seats between us...OBVIOUSLY!");
         }
         else if(ans4!=21 && ans4>=0 || ans4!=21 && ans4<=0 )
         {             
             System.out.println("WRONG!");
             System.out.println("The seats between us are numbered from T18 up to T38."); 
             System.out.println("So the seats between us are the 38 seats from T1 up to T38, other than the 17 seats from T1 up to T17."); 
             System.out.println("So there are 38 − 17 = 21 seats between us...OBVIOUSLY!");
         }
         Thread.sleep(10000);
         System.out.print('\u000C');
         System.out.println("NOW THIS IS LITTLE TRICKY!!:)"); 
         System.out.println("6.Find the smallest +ve mathematical number which is spelled in an alphabetical order ?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer\nEnter Number");
         System.out.print("Your Answer:");
         int ans5=Integer.parseInt(br.readLine());
         if(ans5==40)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("VERY GOOD");
             System.out.println("F-O-R-T-Y\nis in Alphabetical Order.\nIt was very Difficult.");
         }
         else if(ans5!=40 && ans5>=0 || ans5!=40 && ans5<=0 )
         {
             System.out.println("WRONG!");
             System.out.println("ITS FORTY."); 
             System.out.println("ITS WAS VERY DIFFICULT."); 
             System.out.println("So there are 38 − 17 = 21 seats between us...OBVIOUSLY!");
         }
         Thread.sleep(10000);
         System.out.print('\u000C');
         System.out.println("THIS QUESTION WILL BLOW YOUR MIND!!!:)"); 
         System.out.println("7.1+2+3+4+5+6+7+8+9+10=?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans6=Integer.parseInt(br.readLine());
         if(ans6==55)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("YOU ARE VERY BRILLIANT!!!");
             System.out.println("FOR THIS YOU SHOULD BE GOOD IN LONG ADDITION");
         }
         else if(ans6!=0 && ans6>0 || ans6!=0 && ans6<0 )
         {
             System.out.println("WRONG!");
             System.out.println("FOR THIS YOU SHOULD BE GOOD IN LONG ADDITION");
         }
         Thread.sleep(10000);
         System.out.print('\u000C');
         System.out.println("OK DON'T CURSE ME I WILL MAKE IT A LITTLE EASY:D"); 
         System.out.println("8.What is 2014 − 4102 ?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans7=Integer.parseInt(br.readLine());
         if(ans7==-2088)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("FANTASTIC!!!");
             System.out.println("It is easier to subtract the smaller number, 2014, from the larger number, 4102. ");
             System.out.println("Now 4102 − 2014 = 2088 and so 2014 − 4102 = −2088");
         }
         else if(ans7!=-2088 && ans7>=0 || ans7!=-2088 && ans7<=0 )
         {
             System.out.println("WRONG!");
             System.out.println("It is easier to subtract the smaller number, 2014, from the larger number, 4102. ");
             System.out.println("Now 4102 − 2014 = 2088 and so 2014 − 4102 = −2088");
         }
         Thread.sleep(10000);
         System.out.print('\u000C');
         System.out.println("THIS WILL BE BE VERY VERY EASY!!!!!!!!!!!!"); 
         System.out.println("9.10001 – 101 = ? ");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans8=Integer.parseInt(br.readLine());
         if(ans8==9900)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("CORRECT!!!");
             System.out.println("It was very easy!!");
         }
         else if(ans8!=9900 && ans8>=0 || ans8!=9900 && ans8<=0 )
         {
             System.out.println("WRONG!");
             System.out.println("BETTER LUCK NEXT TIME!");
         }
         Thread.sleep(10000);
         System.out.print('\u000C');
         System.out.println("FOR THIS YOU MUST THINK A BIT!!"); 
         System.out.println("10.A number is greater than 3 but less than 8. Also the number is greater than 6 but less than 10."); 
         System.out.println("What is the number?");
         Thread.sleep(7000);
         System.out.println("I will give you ten seconds to think.");
         System.out.println(time());
         System.out.println("Enter your Answer");
         System.out.print("Your Answer:");
         int ans9=Integer.parseInt(br.readLine());
         if(ans9==7)
         {
             Players ob7=new Players();
             ob7.scores();
             score++;
             System.out.println("SUPER!!!");
             System.out.println("Numbers greater than 3 and less than 8 are 4,5,6 and 7.The numbers greater than 6 and less than 10 are 7 and 9.");
             System.out.println("Therefore,the number 7 is greater than 3 and 8 and also greater than 6 and less than 10");
         }
         else if(ans9!=7 && ans9>=0 || ans8!=7 && ans8<=0 )
         {
             System.out.println("WRONG!");
             System.out.println("Numbers greater than 3 and less than 8 are 4,5,6 and 7.The numbers greater than 6 and less than 10 are 7 and 9.");
             System.out.println("Therefore,the number 7 is greater than 3 and 8 and also greater than 6 and less than 10");
         }
         Thread.sleep(10000);
         System.out.println("Your Score:"+score);
         if(score>=0 && score<3)
         {
             System.out.println("Better Luck Next Time");
         }
         else if(score>3 && score<=5)
         {
             System.out.println("Good");
         }
         else if(score>5 && score<=9)
         {
             System.out.println("Very Good");
         }
         else if(score==10)
         {
             System.out.println("Excellent");
         }
         System.out.println("Press Enter to continue...");
         br.readLine();
         System.out.print('\u000C');
         MAIN ab=new MAIN();
         ab.menu(); 
    }
    String time()throws IOException,InterruptedException
    {
        String t="/";
        for(int i=10;i>=0;i--)
        {
            System.out.print(t);
            Thread.sleep(1000);
        }
        return t;
    }
    void math()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        fill abc=new fill();
        System.out.println("\t\t\t1.Play\n\t\t\t2.Instructions\n\t\t\t3.Highscore\n\t\t\t4.Quit");
        int z=Integer.parseInt(br.readLine());
        switch(z)
        {
            case 1:
            System.out.print("\u000C");
            abc.load();
            questions();
            break;
            case 2:
            System.out.print("\u000C");
            abc.load();
            Instructions bcd=new Instructions();
            bcd.rules();
            break;
            case 3:
            System.out.print("\u000C");
            Players ob7=new Players();
            ob7.score();
            break;
            case 4:
            System.out.print("\u000C");
            System.exit(0);
            break;
            default:
            System.out.println("INVALID");
            math();
        }
    }
}                     