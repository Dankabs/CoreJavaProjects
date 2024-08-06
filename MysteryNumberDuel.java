import java.util.Scanner;
import java.util.Random;
public class MysteryNumberDuel{
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();
while(true){
int[]bot = {1,2,3,4,5,6,7,8,9,10};
int randomIndex = random.nextInt(bot.length);
int botChoice = bot[randomIndex];

System.out.println("Enter a number between 1 and 10 ");
int user = scanner.nextInt();
if (user > 10 || user < 1){ //to insure user input is strictly between 1 and 10
     System.out.println("brev I clearly said between 1 and 10! smh");
     
}

 else if(user < botChoice && user != botChoice){ //the user input has to be less than the bots number to win
System.out.println("bot chose "+botChoice);
     System.out.println("YOU LOSE");
 }

 else if (user == botChoice){
     System.out.println("bot chose "+botChoice); //if the user and bot guess the same number you lose
     System.out.println("YOU LOSE!!!");
 }

 else {
     System.out.println("bot chose "+botChoice);
     System.out.println("YOU WIN");
 }
}

    }
}



