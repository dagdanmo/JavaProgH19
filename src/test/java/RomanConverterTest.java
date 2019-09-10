import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RomanConverterTest {


    @Test
    public void shouldReturnIWhen1(){
        assertEquals("I", toRoman(1));

    }

    @Test
    public void shouldReturnIIWhen2(){
        assertEquals("II", toRoman(2));
    }
    @Test
    public void shouldReturnIIIWhen3(){
        assertEquals("III", toRoman(3));
    }
    @Test
    public void shouldReturnIVWhen4(){
        assertEquals("IV", toRoman(4));
    }
    @Test
    public void shouldReturnVWhen5(){
        assertEquals("V", toRoman(5));
    }@Test
    public void shouldReturnVIIIWhen8(){
        assertEquals("VIII", toRoman(8));
    }
    @Test
    public void shouldReturnIXWhen9(){
        assertEquals("IX", toRoman(9));
    }@Test
    public void shouldReturnXWhen10(){
        assertEquals("X", toRoman(10));
    }
    @Test
    public void shouldReturnXLWhen40(){
        assertEquals("XL", toRoman(40));
    }
    @Test
    public void shouldReturnLXIXWhen69(){
        assertEquals("LXIX", toRoman(69));
    }
    @Test
    public void shouldReturnXCIXWhen99(){
        assertEquals("XCIX", toRoman(99));
    }
    @Test
    public void shouldReturnCCCXXIWhen321(){
        assertEquals("CCCXXI", toRoman(321));
    }
    @Test
    public void shouldReturnCDLIXWhen459(){
        assertEquals("CDLIX", toRoman(459));
    }
    @Test
    public void shouldReturnDCCIVWhen704(){
        assertEquals("DCCIV", toRoman(704));
    }
    @Test
    public void shouldReturnCMLXXXVIWhen986(){
        assertEquals("CMLXXXVI", toRoman(986));
    }







    public static String toRoman(int number) {
    String output = "";
        while (number > 0) {
            if (number < 4) {
                output += "I";
                number -= 1;
            } else if (number == 4) {
                output += "IV";
                number -= 4;
            } else if (number >= 5 && number < 9) {
                output += "V";
                number -= 5;
            } else if(number == 9){
                output += "IX";
                number -= 9;
            }else if(number >= 10 && number < 40){
                output += "X";
                number -= 10;
            }else if(number >= 40 && number < 50){
                output += "XL";
                number -= 40;
            }else if(number >= 50 && number < 90){
                output += "L";
                number -= 50;
            }else if(number >= 90 && number < 100){
                output += "XC";
                number -= 90;
            }else if(number >= 100 && number < 400){
                output += "C";
                number -= 100;
            }else if(number >= 400 && number < 500){
                output += "CD";
                number -= 400;
            }else if(number >= 500 && number < 900){
                output += "D";
                number -= 500;
            }

            else{
                break;
            }

        }
        return output;
    }


}
