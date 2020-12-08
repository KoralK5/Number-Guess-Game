import java.util.Random;
import java.util.Scanner;

public class javaGame1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random random = new Random();
        
        boolean fin = false;
        int num = random.nextInt(101);
        System.out.print("Guess Amount: ");
        int guess = input.nextInt();

        System.out.println("Guess A Number Between 0 - 100");
        System.out.println("You have "+ guess +" guesses");

        for(int i = 1; i < guess; i++) {
            System.out.println("");
            System.out.print("Guess " + i + "- ");
            int numGuess = input.nextInt();

            if (numGuess > num) {
                System.out.println("↓ Lower ↓");
            }

            else if (numGuess < num) {
                System.out.println("↑ Higher ↑");
            }
            
            else {
                System.out.println("");
                System.out.println("! Correct !");
                i = guess;
                fin = true;
            }
              
          }
        
        if (fin == false) {
            System.out.println("");
            System.out.println("You ran out of guesses");
        }
        
        input.close();
    }
}
