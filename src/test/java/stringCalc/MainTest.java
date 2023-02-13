package stringCalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    Main main = new Main();

    @ParameterizedTest
    @CsvSource(value = {"+,1,3", "-,5,1", "*,2,2", "/,8,2"})
    void 문자열_사칙연산변환_테스트(String opt, int a, int b) {
        assertThat(main.operator(opt, a, b)).isEqualTo(4);
    }

    @Test
    void 문자열_계산기_테스트() {
        String actual = "2 + 3 * 4 / 2";
        assertThat(main.stringCalculate(actual.split(" "))).isEqualTo(10);
    }


}