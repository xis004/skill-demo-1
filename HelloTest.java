import static org.junit.Assert.*;
import org.junit.*;

public class HelloTest {
    @Test
    public void testHello(){
        assertEquals("Goodbye", Hello.hello());
    }
}
