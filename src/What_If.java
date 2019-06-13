import java.util.Scanner;
public class What_If {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number: ");
        num1 = keyboard.nextInt();

        System.out.print("Second number: ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        if(sum < 200) {
            System.out.println("The sum of the two numbers is " + sum);
        }
        else{
            System.out.println("The sum of the two numbers is " + "*" + sum);
        }
        System.out.println("The product of the two numbers is " + num1 * num2);
        System.out.println("The average of the two numbers is " + (num1 + num2)/2);
    }

}

