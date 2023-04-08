import java.util.Scanner;

public class Main {
    public static int FindBinomialCoefficient(int n, int k) // Creating the function to find binomial coefficent by using user values n and k
    {
        if (k == 0 || n == k) // Creating statement to check if k is equal 0, or is n equal k
        {
            return 1; // Returns 1 if statement is true
        }
        else {
            return FindBinomialCoefficient(n-1, k-1) + FindBinomialCoefficient(n-1, k); // Returns the final solution by using the recursive function
        }
    }
 //no changes
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Creating Scanner function to read user input
        int n = scanner.nextInt(); // Creating and giving value to variable n
        int k = scanner.nextInt(); // Creating and giving value to variable k
        System.out.println(FindBinomialCoefficient(n,k)); // Output the final solution of function by using user values of n and k
    }
}