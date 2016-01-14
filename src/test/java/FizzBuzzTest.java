import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Abdellah on 11/01/2016.
 */
public class FizzBuzzTest {

    @Test
    public void shouldReturn1() {
       FizzBuzz fizzBuzz=new FizzBuzz();
        String actual=fizzBuzz.process(1);
        String expected = "1";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn2() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        String actual=fizzBuzz.process(2);
        String expected = "2";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        String actual=fizzBuzz.process(3);
        String expected = "Fizz";
        Assert.assertEquals(actual, expected);

        actual=fizzBuzz.process(6);
        Assert.assertEquals(actual, expected);

        actual=fizzBuzz.process(9);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnBuzz() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        String actual=fizzBuzz.process(5);
        String expected = "Buzz";
        Assert.assertEquals(actual, expected);

        actual=fizzBuzz.process(10);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        String actual=fizzBuzz.process(15);
        String expected = "FizzBuzz";
        Assert.assertEquals(actual, expected);

        actual=fizzBuzz.process(30);
        Assert.assertEquals(actual, expected);
    }

}