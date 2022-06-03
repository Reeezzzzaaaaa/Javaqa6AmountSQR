import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.RangeService;


public class SQRServiceTest {

    @Test
    public void shouldCalcExactRange() {
        RangeService rangeService = new RangeService();

        int expected = 6;
        int actual = rangeService.calcRange(576,873);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactBegin1() {
        RangeService rangeService = new RangeService();

        int expected = 20;
        int actual = rangeService.calcRange(1,873);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactBegin99() {
        RangeService rangeService = new RangeService();

        int expected = 20;
        int actual = rangeService.calcRange(99,873);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactBegin100() {
        RangeService rangeService = new RangeService();

        int expected = 20;
        int actual = rangeService.calcRange(100,873);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactEnd9800() {
        RangeService rangeService = new RangeService();

        int expected = 89;
        int actual = rangeService.calcRange(100,9800);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactEnd9801() {
        RangeService rangeService = new RangeService();

        int expected = 90;
        int actual = rangeService.calcRange(100,9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactEnd9802() {
        RangeService rangeService = new RangeService();

        int expected = 90;
        int actual = rangeService.calcRange(100,9802);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactEnd100_000() {
        RangeService rangeService = new RangeService();

        int expected = 90;
        int actual = rangeService.calcRange(100,100_000);

        Assertions.assertEquals(expected, actual);
    }
}
