import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;


public class LionTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineFakeInLion;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец",felineFakeInLion);
        Mockito.when(felineFakeInLion.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец",felineFakeInLion);
        List<String> expectedList = Arrays.asList("Животные", "Птицы","Рыба");
        Mockito.when(felineFakeInLion.getFood("Хищник")).thenReturn(expectedList);
        Assert.assertEquals(expectedList, lion.getFood());
    }

    @Test
    public void testBoyInHaveMane() throws Exception{
      Lion lionBoy = new Lion("Самец",felineFakeInLion);
      Assert.assertEquals(true,lionBoy.doesHaveMane());

    }

    @Test
    public void testGirlInHaveMane() throws Exception {
        Lion lionGirl = new Lion("Самка",felineFakeInLion);
        Assert.assertEquals(false,lionGirl.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testExceptionInHaveMane() throws Exception {
        Lion lionUnknown = new Lion("Оно",felineFakeInLion);
        lionUnknown.doesHaveMane();
    }

}
