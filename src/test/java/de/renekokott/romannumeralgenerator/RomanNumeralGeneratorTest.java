package de.renekokott.romannumeralgenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RomanNumeralGeneratorTest {

    private static RomanNumeralGenerator romanNumeralGenerator;

    @BeforeAll
    public static void setup() {
        romanNumeralGenerator = new RomanNumeralGenerator();
    }

    @Test
    public void testThatSmallestNumberIsGenerated() throws Exception {
        Assertions.assertEquals("I", romanNumeralGenerator.generate(1));
    }

    @Test
    public void testThatBiggestNumberIsGenerated() throws Exception {
        Assertions.assertEquals("MMMCMXCIX", romanNumeralGenerator.generate(3999));
    }

    @Test
    public void testThatMediumNumberIsGenerated() throws Exception {
        Assertions.assertEquals("DCCCXXXVII", romanNumeralGenerator.generate(837));
    }

    @Test
    public void testThatZeroThrowsException() {
        Assertions.assertThrows(Exception.class, () -> romanNumeralGenerator.generate(0));
    }

    @Test
    public void testThatTooBigNumberThrowsException() {
        Assertions.assertThrows(Exception.class, () -> romanNumeralGenerator.generate(4000));
    }

    @Test
    public void testThatNegativeNumberThrowsException() {
        Assertions.assertThrows(Exception.class, () -> romanNumeralGenerator.generate(-1));
    }
}
