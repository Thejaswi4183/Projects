import java.io.*;
class BrainTeasers
{
    void questions()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print('\u000C');
        System.out.println("\t\t\t\t\tBRAIN TEASERS\nJUST ANSWER THE FOLLOWING AND COUNT YOUR SCORE.READ THE QUESTIONS AND COMPARE YOUR ANSWER");
         System.out.println("DO NOT CHEAT!!");
        System.out.println("1.You walk into a room with a match. In the room there is a stove, a heater and a candle."); 
        System.out.println("What do you light first?");
        Thread.sleep(13000);
        System.out.println("ANSWER");
        System.out.println("You will first light the match!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("NOW I WILL MAKE IT A LITTLE BIT DIFFICULT");
        System.out.println("2.Mary's father had five daughters-Lala,Lele,Lili,Lolo and the fifith daughter"); 
        System.out.println("Who is the fifth daughter?");
        Thread.sleep(10000);
        System.out.println("ANSWER");
        System.out.println("Mary!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("This one will beat your Brain.");
        System.out.println("3.A is the father of B. But B is not the son of A. How’s that POSSIBLE???????"); 
        Thread.sleep(10000);
        System.out.println("ANSWER");
        System.out.println("B is the daughter of A!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("NOW THIS IS IMPOSSIBLE!I FEEL YOU CANNOT ANSWER THIS IN 10 SECONDS!");
        System.out.println("4.A truck driver is going down a one way street,in the wrong way, and passes at least ten cops(police).");
        System.out.println("He was not caught."); 
        System.out.println("Why was he not caught?????????????????????????");
        Thread.sleep(10000);
        System.out.println("ANSWER");
        System.out.println("He was not caught because he was not driving! He’s walking on the footpath!!!!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("99.9% PEOPLE FAIL!");
        System.out.println("5.If it took eight men ten hours to build a wall,HOW LONG would it take four men to build it?");
        Thread.sleep(10000);
        System.out.println("ANSWER");
        System.out.println("No time at all because it is ALREADY BUILT!!!!!:)");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("THIS ONE IS SIMPLE!");
        System.out.println("6.A man was outside taking a walk, when it started to rain.");
        System.out.println("The man didn't have an umbrella and he wasn't wearing a hat. His clothes got soaked, yet not a single hair on his head got wet.");
        System.out.println("How could this happen?");
        Thread.sleep(10000);
        System.out.println("ANSWER");
        System.out.println("The man was bald!!!:-D");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("THIS ONE IS GOING TO PRANK WITH YOUR BRAIN!");
        System.out.println("7.What is as big as an elephant but weighs nothing?");
        System.out.println("ANSWER");
        System.out.println("An elelphant's shadow!!!!:-D");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("YOU WOULD HAVE HEARD THIS QUESTION.");
        System.out.println("8.What can you feed but if you give it water it will die?");
        System.out.println("ANSWER");
        System.out.println("FIRE!!!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("THE QUESTION BELOW IS VERY EASY BUT SOME GET CONFUSED.");
        System.out.println("9.You buy it to eat, but you don't eat it. What is it?");
        System.out.println("ANSWER");
        System.out.println("A PLATE!!!");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("THE ANSWER TO THIS MAY SOUND SILLY.");
        System.out.println("10.A girl is sitting in a house at night that has no lights on at all.");
        System.out.println("There is no lamp, no candle, nothing. Yet she is reading. How?");
        System.out.println("ANSWER");
        System.out.println("The woman is BLIND and is reading BRAILLE.");
        Thread.sleep(4000);
        System.out.print('\u000C');
        System.out.println("                  CHECK HOW GENIUS ARE YOU!");
        System.out.println("    NO. OF CORRECT ANSWERS                    REMARKS");
        System.out.println("          0-2                         BETTER LUCK NEXT TIME");
        System.out.println("          3-5                                 NOT BAD");
        System.out.println("          6-7                                  GOOD");
        System.out.println("          8-9                                  VERY GOOD");
        System.out.println("          10                             YOU ARE A GENIUS");
        Thread.sleep(7000);
        System.out.print('\u000C');
        System.out.println("Press Enter to Continue...");
        br.readLine();
        MAIN ab=new MAIN();
        ab.menu();
    }
    void Brain()throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        fill abc=new fill();
        System.out.println("\t\t\t1.Play\n\t\t\t2.Instructions\n\t\t\t3.Quit");
        int z=Integer.parseInt(br.readLine());
        switch(z)
        {
            case 1:
            System.out.print('\u000C');
            abc.load();
            questions();
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
            default:
            System.out.println("INVALID");
            Brain();
        }
    }
}                     
