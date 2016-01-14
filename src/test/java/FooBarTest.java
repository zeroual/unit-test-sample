import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Abdellah on 14/01/2016.
 */
public class FooBarTest {

    @Test
    public void shouldReturnTheSameAsParam(){
        FooBar foobar = new FooBar();
        String actual = foobar.process(1);
        String expected = "1";
        Assert.assertEquals(expected,actual);

        expected = "2";
        actual = foobar.process(2);
        Assert.assertEquals(expected,actual);
    }

}
