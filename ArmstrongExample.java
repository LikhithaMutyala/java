import java.util.Scanner;

public class ArmstrongExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int remainder, result = 0;
        int digits = String.valueOf(num).length();

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
