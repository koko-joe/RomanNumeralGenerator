package de.renekokott.romannumeralgenerator;

import java.util.Map;

public class RomanNumeralGenerator {

    // https://en.wikipedia.org/wiki/Roman_numerals#%22Standard%22_forms
    public static final Map<Integer, String> ROMAN_NUMERAL_MAP = Map.ofEntries(
            // numerals for every digit
            Map.entry(0, ""),
            Map.entry(1, "I"),
            Map.entry(2, "II"),
            Map.entry(3, "III"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(6, "VI"),
            Map.entry(7, "VII"),
            Map.entry(8, "VIII"),
            Map.entry(9, "IX"),
            // numerals for every tens digit
            Map.entry(10, "X"),
            Map.entry(20, "XX"),
            Map.entry(30, "XXX"),
            Map.entry(40, "XL"),
            Map.entry(50, "L"),
            Map.entry(60, "LX"),
            Map.entry(70, "LXX"),
            Map.entry(80, "LXXX"),
            Map.entry(90, "XC"),
            // numerals for every hundreds digit
            Map.entry(100, "C"),
            Map.entry(200, "CC"),
            Map.entry(300, "CCC"),
            Map.entry(400, "CD"),
            Map.entry(500, "D"),
            Map.entry(600, "DC"),
            Map.entry(700, "DCC"),
            Map.entry(800, "DCCC"),
            Map.entry(900, "CM"),
            // numerals for every thousands digit
            Map.entry(1000, "M"),
            Map.entry(2000, "MM"),
            Map.entry(3000, "MMM")
    );

    public String generate(int number) throws Exception {
        if (number < 1 || number > 3999) {
            throw new Exception("Number must be between 1 and 3999");
        }

        StringBuilder romanNumeral = new StringBuilder();
        int remainder = number;
        int decimalPower = 1;
        while (remainder > 0) {
            int divisor = (int) Math.pow(10, decimalPower);
            int currentNumeral = remainder % divisor;
            romanNumeral.insert(0, ROMAN_NUMERAL_MAP.get(currentNumeral));
            remainder -= currentNumeral;
            decimalPower++;
        }

        return romanNumeral.toString();
    }
}
