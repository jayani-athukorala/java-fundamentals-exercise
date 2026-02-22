import java.util.Scanner;
import java.util.Random;

public class Q8{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randNumber = rand.nextInt(500)+1;
        int userNumber;
        int count = 1;

        do{
            System.out.print("Guess the generated number :");
            userNumber = scanner.nextInt();

            if(userNumber < randNumber){
                System.out.println("Your guess was too small!");
                count++;
            }else if(userNumber > randNumber){
                System.out.println("Your guess was too big!");
                count++;
            }

        }while(userNumber != randNumber);

        System.out.print("Your guess is Correct!\nNumber of Guesses you have made :"+count);
    }
}