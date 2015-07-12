package java7;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutJava7LiteralsEnhancements {

    @Koan
    public void binaryLiterals() {
        //binary literals are marked with 0b prefix
        short binaryLiteral  = 0b1111;
        short var = 15;
        assertEquals(binaryLiteral, var);
    }

    @Koan
    public void binaryLiteralsWithUnderscores() {
        //literals can use underscores for improved readability
        short binaryLiteral  = 0b1111_1111;
        short var = 255;
        assertEquals(binaryLiteral, var);
    }

    @Koan
    public void numericLiteralsWithUnderscores() {
        long literal = 111_111_111L;
        //notice capital "B" - a valid binary literal prefix
        short multiplier = 0B1_000;
        long var1 = 111_111_111L ;
        short var2 = 8;

        assertEquals(literal * multiplier, var1 * var2);
    }

    @Koan
    public void negativeBinaryLiteral() {
        int negativeBinaryLiteral = 0b1111_1111_1111_1111_1111_1111_1111_1100 / 4;
        int var1 = -4 ;
        int var2 = 4;
        assertEquals(negativeBinaryLiteral, var1 / var2);
    }

    @Koan
    public void binaryLiteralsWithBitwiseOperator() {
        int binaryLiteral = ~0b1111_1111;
        int var1 = -256;
        assertEquals(binaryLiteral, var1);
    }

}
