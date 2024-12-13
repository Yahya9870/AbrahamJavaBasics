import java.util.Scanner;


// A Concept

// Suppose you have a number N and you have to add another number Y on the right hand side of that number then:

// we need to multiply N with 10 then add Y into it.

// For example N=4 and Y=3

// 4X10+3 = 43

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The reversed number is: " + reverse(num));
    }

    public static int reverse(int num) {
        int rev = 0;  // we have declared a reverse variable with initial value as 0

        int R;       // Remainder
        // imagine user entered 12       3                             4
        while (num != 0) {     // 1. True  2. True   3. True  4. True  5. False loop terminated finally
            R = num % 10;      // 1. 4   2. 3        3. 2     4. 1
            rev = rev * 10 + R; //1. 4   2. 43       3. 432   4. 4321
            num = num / 10;     // 1. 123 2. 12      3. 1     4. 0
        }


        return rev;


    }
}
