package numberBaseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    Main main = new Main();
    private List<Integer> comNumberList = new ArrayList<>();
    @BeforeEach
    void setUp(){
        comNumberList.add(3);
        comNumberList.add(2);
        comNumberList.add(5);
        main.comNumberList = comNumberList;
    }

    @Test
    @DisplayName("랜덤숫자_BEFOREEACH_테스트")
    void makeNewComNumber() {
        main.makeNewComNumber();
        assertThat(comNumberList).isEqualTo(main.comNumberList);
    }

    @ParameterizedTest
    @ValueSource(ints = {315, 125, 326})
    @DisplayName("입력값과_랜덤값_비교_테스트")
    void checkInputTest(int source){
        assertThat(main.checkInput(source)).isEqualTo(20);

    }

    @Test
    @DisplayName("결과값_문장으로_전환_테스트")
    void getResultStr() {
        assertThat(main.getResultStr(210)).isEqualTo("2볼 1스트라이크");
    }
}