import java.util.Scanner;

//class declaration
public class UserInput {
    
    //Main class
    public static void main(String[] args) {
        //initialize Scanner
        Scanner scanner = new Scanner(System.in);
        int firstInput = getValidInput(scanner, "Enter the first non-zero integer: ");
        int secondInput = getValidInput(scanner, "Enter the second non-zero integer: ");

        System.out.println("First input: " + firstInput + " Second input: " + secondInput);

        addition(firstInput, secondInput);
        subtraction(firstInput, secondInput);
        division(firstInput, secondInput);
        multiplication(firstInput, secondInput);

        scanner.close();
    }


        //Method to validate input value
        private static int getValidInput(Scanner scanner, String prompt) {
            int input = 0;
            while (true) {
                try {
                    //Get user input
                    System.out.print(prompt);
                    input = scanner.nextInt();
    
                    //check if input is 0
                    if (input == 0) {
                        throw new IllegalArgumentException("Input cannot be zero.");
                    }
    
                    //if both input are valid, break the loop
                    break;
    
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // TODO: handle any other input error
                    System.out.println("Invalid input. Please enter a valid number");
                    scanner.next(); //Clear the invalid input
                }
            
            }
            return input; // return input
        }

        
        private static void addition(int firstInput, int secondInput) {
            //Arithmetic operations
            //Addition
            int addResult = firstInput + secondInput;
            System.out.println("Addition result: " + addResult);
        }


        private static void subtraction(int firstInput, int secondInput) {
            //Subtraction
            int subResult = firstInput - secondInput;
            System.out.println("Subtraction result: " + subResult);
        }


        private static void division(int firstInput, int secondInput) {
            //Division
            double divResult = firstInput / secondInput;
            System.out.println("Division result: " + divResult);
        }


        private static void multiplication(int firstInput, int secondInput) {
            //Multiplication
            int mulRresult = firstInput * secondInput;
            System.out.println("Multiplication result: " + mulRresult);
        }

     
    }
