import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      while(true){
      System.out.print("Enter your choice: ");
      String user = scanner.nextLine();
      
      String[] bot = {"rock", "paper","scissors"};
      int randomIndex = random.nextInt(bot.length);
      String botChoice = bot[randomIndex];
      
      String userChoice = (user.equals(botChoice))?"tie": (user.equals("rock") && botChoice.equals("paper"))?"you lose":(user.equals("paper")&&botChoice.equals("rock"))?"you win":(user.equals("scissors")&&botChoice.equals("rock"))?"you lose":(user.equals("rock")&&botChoice.equals("scissors"))?"you win":(user.equals("paper")&&botChoice.equals("scissors"))?"you lose":(user.equals("scissors")&&botChoice.equals("paper"))?"you win":"please enter, rock paper or scissors";
      System.out.println("bot played: " +botChoice+ "\n"+userChoice);
    }  
  }
}
