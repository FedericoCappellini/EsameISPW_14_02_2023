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

    @Test
    public void testMain3(){
        boolean result;
        result = Main.branch(true, false);
        Assertions.assertFalse(result);
    }

    @Test
    public void testMain4(){
        boolean result;
        result = Main.branch(false, true);
        Assertions.assertTrue(result);
    }
}
