package numberBaseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void makeNewComNumber() {
        main.makeNewComNumber();
        System.out.println(main.comNumber);
    }

    @Test
    void compareToComputer() {
    }
}