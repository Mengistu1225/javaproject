import java.util.Scanner;

public class FithBuzz {
    public static void main(String[]arg) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte number =scanner.nextByte();
        if(number%5==0 && number%3==0) {
            System.out.println("FizzBuzz");
        } else if (number%5==0 ) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(number);
        }

    }
}
