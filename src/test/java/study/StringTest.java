package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

import static java.lang.invoke.MethodHandles.throwException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void 요구사항_1번() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void 요구사항_2번() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).contains("1,2");
    }

    @Test
    @DisplayName("요구사항 3번 에러 처리 확인")
    void 요구사항_3번() {
        assertThatThrownBy(() -> {
            char test = "abc".charAt(4);
            }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("out of range");
    }

    @Test
    void exception() throws Exception {
        assertThatThrownBy(() -> throwException())
                .isInstanceOf(Exception.class)
                .hasMessage("예외 던지기!")              // Verifies that the message of the actual Throwable is equal to the given one.
                .hasStackTraceContaining("Exception");
    }

    private void throwException() throws Exception {
        throw new Exception("예외 던지기!");
    }

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void set_요구사항_1번() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void set_요구사항_2번(int source) {
        assertThat(numbers.contains(source));
    }

    @ParameterizedTest
    @CsvSource(value = {"1, true", "2, true", "3, true", "4, false", "5, false"})
    void set_요구사항_3번(int source, boolean isContain) {
        assertThat(numbers.contains(source)).isEqualTo(isContain);
    }
}
