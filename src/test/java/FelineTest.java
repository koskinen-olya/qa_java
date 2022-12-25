import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline felineFakeInFeline;

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline(felineFakeInFeline);
        List<String> expectedList = Arrays.asList("Животные", "Птицы","Рыба");
        Mockito.when(felineFakeInFeline.getFood("Хищник")).thenReturn(expectedList);
        Assert.assertEquals(expectedList,feline.eatMeat()) ;
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline(felineFakeInFeline);
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline(felineFakeInFeline);
        Mockito.when(felineFakeInFeline.getKittens(1)).thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetCountKittens(){
        Feline feline = new Feline(felineFakeInFeline);
        Assert.assertEquals(2, feline.getKittens(2));
    }
}
