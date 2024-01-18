import java.io.*;
class IQtest
{
    void questions()throws IOException,InterruptedException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.print('\u000C');
         System.out.println("\t\t\t\t\tIQ TEST\nJUST ANSWER THE FOLLOWING AND COUNT YOUR SCORE.READ THE QUESTIONS AND COMPARE YOUR ANSWER");
         System.out.println("DO NOT CHEAT");
         System.out.println("1.Some months have 30 days,some have 31 days.");
         System.out.println("How many months have 28 days?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("All months have 28 days.\nEvery month has atleast 28 days");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("2.Divide 30 by half and add 10.");
         System.out.println("What will you get?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("70.DIVIDING BY HALF is same as multiplying by 2.\nWhen 30is multiplied by 2 we get 60.On adding 10 we get 70.");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("3.At a conference, 12 members shook hands with each other before & after the meeting.");
         System.out.println("How many total number of hand shakes occurred?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("132.");
         System.out.println("Explanation: The first person shook hands with 11 remaining people, the second person also shook hands with 11 people,");
         System.out.println("but we count 10, as the hand shake with the first person has already been counted. Then add 9 for the third person,"); 
         System.out.println("8 for the fourth one & proceeding in this fashion we get: 11 + 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 66.");
         System.out.println("Hence 66 hand shakes took place before & 66 after the meeting, for a total of 132.");
         Thread.sleep(8000);
         System.out.print('\u000C');
         System.out.println("4.Forest is to tree as tree is to ?");
         System.out.println("a.plant\nb.leaf\nc.branch\nd.mangroove");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("b.leaf");
         System.out.println("Explanation: As forest houses several trees, a tree has many leaves.");
         System.out.println("Branches is a close choice but it is incorrect as all tress do not have branches.");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("5.The day after the day after tomorrow is four days before Monday. What day is it today?");
         System.out.println("a.MONDAY\nb.TUESDAY\nc.WEDNESDAY\nd.THURSDAY");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("MONDAY");
         System.out.println("Explanation: Four days before Monday is Thursday, simply because four days after Thursday is Monday.");
         System.out.println("Besides, day after the day after tomorrow is Thursday only if present day is Monday.");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("6.If Bob sold 15 apples in a working week, what is the average number of apples he sells each day?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("3 – there are 5 days in a working week, so you divide 15 by 5 = 3");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("7.If it takes 2 hours to drive to City A and the city is 120km away, what speed was the vehicle travelling at?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("60km per hour – Take the number of kms 120 and divide by the number of hours, then you get the kilometres per hour");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("8.Before Mt. Everest was discovered, what was the highest mountain in the world?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("Mt. Everest. It just wasn’t discovered yet.");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("9.What word in the English language is always spelled incorrectly?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("Incorectly!!");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("10.A farmer has five haystacks in one field and four haystacks in another.");
         System.out.println("How many haystacks would he have if he combined them all in one field?");
         Thread.sleep(10000);
         System.out.println("ANSWER");
         System.out.println("One. If he combines all his haystacks, they all become one big stack.");
         Thread.sleep(4000);
         System.out.print('\u000C');
         System.out.println("                   CHECK YOUR IQ!");
         System.out.println("    NO. OF CORRECT ANSWERS                    REMARKS");
         System.out.println("          0-2                                  LOW IQ");
         System.out.println("          3-6                                      OK");
         System.out.println("          7-9                                 GOOD IQ");
         System.out.println("           10                            VERY GOOD IQ");
         Thread.sleep(7000);
         System.out.print('\u000C');
         System.out.println("Press Enter to continue...");
         br.readLine();
         MAIN ab=new MAIN();
         ab.menu();
    }
    void iq()throws IOException,InterruptedException
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
            iq();
        }
    }
}                     