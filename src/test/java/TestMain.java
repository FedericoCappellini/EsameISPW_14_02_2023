import main.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    public void testMain1(){
        boolean result;
        result = Main.branch(true, true);
        Assertions.assertTrue(result);
    }

     @Test
    public void testMain2(){
        boolean result;
        result = Main.branch(false, false);
        Assertions.assertFalse(result);
     }
}
