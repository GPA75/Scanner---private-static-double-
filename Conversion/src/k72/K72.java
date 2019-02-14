package k72;

// method Scanner
//input of fahrenheit for conversion into cels
import java.util.Scanner; 

public class K72 {
    
    public static void main(String[] args) {
        
        // input of the scanner 
        Scanner input = new Scanner(System.in);
        
        // input of the value in fahrenheit
        System.out.print("Enter the value in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // output of result into celsius
        System.out.printf(""
           + "\nResult of value in celsius: %.2f%n\n", result(fahrenheit));
    } // End of method determineResult
    
    // Calculates and returns the result celsius
    private static double result (double fahrenheit) {
    
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    } // End of method result
} // End of class K72