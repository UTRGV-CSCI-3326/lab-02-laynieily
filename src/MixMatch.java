public class MixMatch {
    public static void main(String[] args) {
        // Declare and initialize 8 variables of type String, char, short, int, long, float, double, and boolean
        String name = "Laynie";
        System.out.println(name + " <- String, holds a collection of characters.");

        char initial = 'L';
        System.out.println(initial + " <- char, stores a single character.");

        short num1 = -32768;
        System.out.println(num1 + " <- short, stores an integer between -32,768 and +32,767");

        int num2 = 10;
        System.out.println(num2 + " <- int, stores an integer between -2^31 and +2^31-1");

        long num3 = 100000000;
        System.out.println(num3 + " <- long, stores an integer between -2^63 and +2^63-1");

        float num4 = 10.22222f;
        System.out.println(num4 + " <- float, numbers that can contain decimal places, accurate to 7 decimal places.");

        double num5 = 10.222222222222;
        System.out.println(num5 + " <- double, numbers also containing decimal places, accurate to 15 decimal places.");

        boolean fact = true;
        System.out.println(fact + " <- boolean, can only be true or false.");

        //Lastly, practice outputting multiple variables with a single print method.
        System.out.println(num1 + ", " + num2 + ", " + fact + ", These are some of the variables i have declared.");
    }
}