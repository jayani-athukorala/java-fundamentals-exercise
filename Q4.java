import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int number;
        int i = 1, sum = 0, num_of_times = 3;
        
        while(i <= num_of_times){
            System.out.print("Input first number :");
            number = scanner.nextInt();
            sum = sum + number;
            i++;
        }
        double average = sum /num_of_times;
        System.out.print("Average is "+average);
        
    }
}