package numberBaseball;

import java.util.*;

public class Main {

    List<Integer> comNumber = new ArrayList<>();

    int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    void addNumber(){
        int ranNum = getRandomNumber();
        if (!comNumber.contains(ranNum)) {
            comNumber.add(ranNum);
        }
    }

    void makeNewComNumber() {
        while (comNumber.size() < 3) {
            addNumber();
        }
    }

    void endGameView() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    String stringResult(int result) {
        String resultStr = "";
        return resultStr;
    }

    void resultView(int result) {
        if (result == 0) {
            System.out.println();
        }
    }

    void handleResult(int result){


        resultView(result);
    }

    int compareToComputer(int input) {
        int result = 0;

        return result;
    }

    int getInputNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    void inputNumberView() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    void startNewGame(){
        makeNewComNumber();
        inputNumberView();
        handleResult(compareToComputer(getInputNumber()));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startNewGame();
    }
}
