package de.renekokott.romannumeralgenerator;

public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please add a number as the first argument.");
            System.exit(1);
        }

        RomanNumeralGenerator generator = new RomanNumeralGenerator();
        String romanNumeral = "";
        try {
            int number = Integer.parseInt(args[0]);
            romanNumeral = generator.generate(number);
        } catch (NumberFormatException e) {
            System.err.println("Please add a number as the first argument.");
            System.exit(1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.out.println(romanNumeral);
        System.exit(0);
    }
}
