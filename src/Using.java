
import java.util.Scanner;
public class Using {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.nextLine();
        System.out.println("Enter a number as an index:");
        int index = scan.nextInt();

        System.out.println("The length of " + word + " is: " + word.length());

        System.out.println("The substring from 0 to " + index + " " + "is: " + word.substring(0, index));

    }
}


