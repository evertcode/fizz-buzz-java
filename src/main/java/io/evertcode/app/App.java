package io.evertcode.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        final App app = new App();
        for(int i = 1; i <= 100; i++) {
            System.out.print(app.fizzBuzz(i).concat(" "));
        }
    }

    /**
     * This is a comment for the method
     * @param number
     * @return
     */
    public String fizzBuzz(final int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
