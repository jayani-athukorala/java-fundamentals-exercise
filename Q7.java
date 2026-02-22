import java.util.Scanner;

public class Q7{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int timeInSecond;

        System.out.print("Insert time in Seconds (s) :");
        timeInSecond = scanner.nextInt();

        String formattedTime = formatTime(timeInSecond);
        System.out.println("The formatted Time : "+formattedTime);

    }

    public static String formatTime(int time){
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 3600 % 60;

        return hours+":"+minutes+":"+seconds;
    }
}