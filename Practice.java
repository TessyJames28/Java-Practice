import java.util.Date;

public class Practice {
    public static void main(String[] args) {
        String empty = new String();
        String copy = new String("Let's have it");
        char[] c = {'J', 'a', 'v', 'a'};
        String ofChar = new String(c);
        System.out.println(ofChar);
        System.out.println(empty);
        System.out.println(copy);

        // Generating String from truth values or numbers
        int a = 12;
        float f = 1.42f;

        // Generating a string representation by concatenating with empty string
        String aString = "" + a;
        String fString = "" + f;

        //Generating a string representation via the static method valueOf from the string class
        String aString1 = String.valueOf(a);
        String fString1 = String.valueOf(f);

        //Printing results
        System.out.println("aString: " + aString);
        System.out.println("aString1: " + aString1);
        System.out.println("fString: " + fString);
        System.out.println("fString: " + fString1);

        // Date and time
        Date date1 = new Date();
        System.out.println(date1);


    }
}
