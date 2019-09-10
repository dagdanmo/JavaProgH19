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




    public static String toRoman(int number){

            if(number == 1){
                return "I";
            }else if(number == 2){
                return "II";
            }

        return null;
    }


}
