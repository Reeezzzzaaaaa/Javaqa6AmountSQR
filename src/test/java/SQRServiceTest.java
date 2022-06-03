import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn.services.RangeService;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/amountSQR.csv")
    public void shouldCalcExactRange(int expected, int rangeMin, int rangeMax) {
        RangeService rangeService = new RangeService();

        int actual = rangeService.calcRange(rangeMin,rangeMax);

        Assertions.assertEquals(expected, actual);
    }
}
