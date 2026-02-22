import java.util.Scanner;

public class Q6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter larger number :");
        number1 = scanner.nextInt();

        System.out.print("Enter smaller number :");
        number2 = scanner.nextInt();

        int sum = addTwoNumbers(number1, number2);
        System.out.println(number1+" + "+number2+" = "+sum);

        int difference = subtractTwoNumbers(number1, number2);
        System.out.println(number1+" - "+number2+" = "+difference);

        int multiplication = multiplyTwoNumbers(number1, number2);
        System.out.println(number1+" x "+number2+" = "+multiplication);

        double division = divideTwoNumbers(number1, number2);
        System.out.println(number1+" / "+number2+" = "+division);

    }

    private static int addTwoNumbers(int n1, int n2){
        return n1 + n2;
    }

    private static int subtractTwoNumbers(int n1, int n2){
        return n1 - n2;
    }

    private static int multiplyTwoNumbers(int n1, int n2){
        return n1 * n2;
    }

    private static double divideTwoNumbers(int n1, int n2){
        return n1 / n2;
    }
}
