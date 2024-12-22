package ClassExercises;

import java.util.Scanner;


public class LeapYear {

    // Main function to check if a year is a leap year
    /**
     * Description of the method
     *
     * @param param1 - Description of parameter
     * @return Description of the return value
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.print("Enter any year to check for leap year: ");
        int year = sc.nextInt();
        System.out.println("===========================================");

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.print(year + " is a leap year.");
                } else System.out.print(year + " is not a leap year.");
            } else System.out.print(year + " is a leap year.");
                
        } else System.out.print(year + " is not a leap year.");

        sc.close();
        }         
    }
    