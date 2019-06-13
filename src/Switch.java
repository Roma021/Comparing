import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        int numberOfDays = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of days: ");
        numberOfDays = keyboard.nextInt();

        String months = " ";
        switch (numberOfDays){
            case 28: months = "February";
                break;
            case 29: months = "February";
                break;
            case 30: months = "September, April, June, and November";
                break;
            case 31: months = "January, March, May, July, August, October, December";
                break;
            default: months = "No month has exactly " + numberOfDays + " days";
        }

        System.out.println(months);

    }
}

