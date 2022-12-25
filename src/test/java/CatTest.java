import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline felineFakeInCat;

    @Test
    public void testGetSound(){
        Feline feline = new Feline(felineFakeInCat);
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(felineFakeInCat);
        List<String> expectedList = Arrays.asList("Животные", "Птицы","Рыба");
        Mockito.when(felineFakeInCat.eatMeat()).thenReturn(expectedList);
        Assert.assertEquals(expectedList, cat.getFood());
    }

}
