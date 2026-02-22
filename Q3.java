public class Q3{

    public static void main(String[] args){

        int number1 = 250, number2 = 45;

        int sum = addTwoNumbers(number1, number2);
        System.out.println(number1+" + "+number2+" = "+sum);

        int sub = subtractTwoNumbers(number1, number2);
        System.out.println(number1+" - "+number2+" = "+sub);

        int multiplication = multiplyTwoNumbers(number1, number2);
        System.out.println(number1+" x "+number2+" = "+multiplication);

        double division = divisionTwoNumbers(number1, number2);
        System.out.println(number1+" / "+number2+" = "+division);

    }

    public static int addTwoNumbers(int number1, int number2){
        return number1 + number2;
    }

    public static int subtractTwoNumbers(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplyTwoNumbers(int number1, int number2){
        return number1 * number2;
    }

    public static double divisionTwoNumbers(int number1, int number2){
        return number1 / number2;
    }
}