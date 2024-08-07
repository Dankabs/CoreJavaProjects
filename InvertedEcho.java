import java.util.Scanner;

public class Backwards {

public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);

System.out.println("Enter a word or sentence: ");

String input = scanner.nextLine();

StringBuilder backwards = new StringBuilder(); //StringBuilder is used to construct the reversed string efficiently.
int length = input.length();

for (int i = length - 1; i >= 0; i--) //for loop with i initialized to the last index of the string (length - 1) 
                                    //and decrements i until it reaches 0. This loop iterates through the string in reverse order.
{
backwards.append(input.charAt(i)); //Appends the character at index i from the original string input to the backwards StringBuilder. This builds the reversed string one character at a time.
}
System.out.println(backwards.toString()); //Converts the StringBuilder object backwards to a string using toString() method and prints the reversed string to the console.
}
}
