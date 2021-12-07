import java.util.Scanner;
public class RandomNumbers {

    public static void main(String[] args) {
        
       String lottery = "" + (int) (Math.random()* 10) + (int) (Math.random()* 10);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Lottery ticket(two digits):");  
       String guess = sc.nextLine();

       char lotteryDigit1 = lottery.charAt(0);
       char lotteryDigit2 = lottery.charAt(1);     
       
       char guessDigit1 = guess.charAt(0); 
       char guessDigit2 = guess.charAt(1);  
System.out.println("The lottery number is: " + lottery);
if (guess.equals(lottery))
System.out.println("Exact Match: Prize is $5,000");
else if (guessDigit2 == lotteryDigit1 && guessDigit2 == lotteryDigit2 )
System.out.println("Match all digits: Prize is $3,000");
else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
System.out.println("Match one digit: Prize is $1,000");
else System.out.println("Sorry no match!");
    }
}