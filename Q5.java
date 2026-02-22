import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Enter Your name : ");
        name = scanner.nextLine();

        System.out.println("Hello,"+name+"!");
    }
}