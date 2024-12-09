import java.util.Scanner; // use for user input from the keyboard

public class CountOfDigits {
    public static void main(String[] args) {
        // Write a Java program to ask user to enter a number and tell how many digits it has.

        // Sample Input: 1234
        // Sample Output: 4

        Scanner scan = new Scanner(System.in); // an object from Scanner class to take input
        System.out.println("Enter a number: "); // Message for user (optional but good programming practice)
        int num = scan.nextInt(); // taken the input from the user thru keyboard
        int count = 0; // decalared a variable with value zero
        // imagine user has entered 12345
        while (num != 0) {  // 1. TRUE   2. TRUE  3. TRUE 4. TRUE 5. TRUE  6. FALSE (LOOP TERMINATES)

            num = num / 10; // 1. 1234  // 2. 123  // 3. 12  //4. 1  //5. 0
            count++;        // 1. 1   //2. 2  //3. 3  //4. 4 //5. 5
        }

        System.out.println(count);
    }
}
