import java.util.Scanner;

public class Q2{
    public static void main(String[] args){

        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year : ");
        year = scanner.nextInt();

        boolean is_leap_year = isLeapYear(year);
        if(is_leap_year){
            System.out.println(year+" is a Leap Year.");
        }else{
            System.out.println(year+" is a NOT a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0))){
            return true;
        }
        return false;
    }
}