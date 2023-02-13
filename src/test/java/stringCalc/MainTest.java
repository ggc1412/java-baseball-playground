package stringCalc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    Main main = new Main();

    @Test
    void 문자열계산기_테스트() {
        String actual = "2 + 3 * 4 / 2";
        assertThat(main.stringCalculate(actual.split(" "))).isEqualTo(10);
    }
}