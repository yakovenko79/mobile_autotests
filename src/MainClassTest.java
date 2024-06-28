import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Result of function getLocalNumber is not equal 14", 14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber returns value of 45 or less", getClassNumber() > 45);
    }
}

