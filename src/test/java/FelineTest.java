import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = Arrays.asList("Животные", "Птицы","Рыба");
        Assert.assertEquals(expectedList,feline.eatMeat()) ;
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetCountKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(2, feline.getKittens(2));
    }
}
