/**
 * Created by Abdellah on 14/01/2016.
 */
public class FooBar {
    public String process(int n) {
        String res ="";
        if (n==3){
            res ="Foo";
        }
        String contain3 = ""+n;
        if (contain3.contains("3"))
            return res+"Foo";

        return res;
    }

}
