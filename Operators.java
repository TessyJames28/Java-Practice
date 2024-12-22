public class Operators {

   /**
    * A method that performs division operations
    *
    * @param a - an int numerator
    * @param b - an int divisor
    * @return an int value of the division between a and b
    */
    public int division(int a, int b) {
        int c;
        c = a /  b;
        return c;
    }

    public static void main(String[] args) {
        Operators division = new Operators();
        int result = division.division(4, 3);
        System.out.print(result);
    }
}

