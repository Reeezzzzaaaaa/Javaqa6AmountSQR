import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn.services.RangeService;


public class RangeServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/amountSQR.csv")
    public void shouldCalcExactRange(int expected, int rangeMin, int rangeMax) {

    RangeService service = new RangeService();

    int actual = service.calcRange(rangeMin,rangeMax);

        Assertions.assertEquals(expected, actual);
    }
}
