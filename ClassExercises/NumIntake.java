package ClassExercises;
import java.util.Scanner;

public class NumIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");

        int num = sc.nextInt();
        int result;

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                result = i * j;
                System.out.print(i + " * " + j + " = " + result + "\t");
            }
            System.out.println();
        }
        sc.close();

    }
}