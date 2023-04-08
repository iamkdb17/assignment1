import java.util.Scanner;

public class Main {
    public static int FindGCD(int a, int b) // Creating function to find GCD of user values a and b
    {
        int c; // Creating variable c without value
        if (a == b) // First statement with condition a is equal b
        {
            return a; // If statement true it will return function with value of given numbers
        }
        if (a == 1 || b == 1) // Second statement checking is any value are equal to 1
        {
            return 1; // If statement true it will return function with value 1
        }
        if (a == 0 || b == 0) // Third statement checking is any value are equal to 0
        {
            return 0; // If statement true it will return function with value 0
        }
        c = Math.min(a, b); // Giving variable c the minimal value of the a or b
        while(a % b != 0) // Creating the loop to find out the greatest common divisor
        {
            c = a % b;
            a = b;
            b = c;
        }
        return c; // Returns the GCD of a and b

    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in); // Creating Scanner function to read user input values
        int a = number.nextInt(); // Creating and giving variable a user values
        int b = number.nextInt(); // Creating and giving variable b user values
        System.out.println(FindGCD(a,b)); // Output the GCD of a and b by using function
    }
}