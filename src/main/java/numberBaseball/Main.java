package numberBaseball;

import java.util.*;

public class Main {

    List<Integer> comNumberList = new ArrayList<>();

    int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    void addNumber(){
        int ranNum = getRandomNumber();
        if (!comNumberList.contains(ranNum)) {
            comNumberList.add(ranNum);
        }
    }

    void makeNewComNumber() {
        while (comNumberList.size() < 3) {
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

    String getResultStr(int result) {
        String resultStr = "";
        if (result == 0) {
            return "낫싱";
        }
        if (result / 100 != 0) {
            resultStr += result / 100 + "볼";
            result = result % 100;
        }
        if (result / 10 != 0) {
            resultStr += result / 10 + "스트라이크";
        }

        return resultStr;
    }

    void resultView(String resultStr) {
        System.out.println(resultStr);
    }

    void handleResult(int result){
        resultView(getResultStr(result));
        resultView(result);
    }

    int compareToComNumber(int comNum, int inputNum) {
        if (comNum == inputNum) {
            return 10;
        }
        if (comNumberList.contains(inputNum)) {
            return 100;
        }
        return 0;
    }

    int checkInput(int input) {
        int result = 0;

        for (int i = 2; i >= 0; i--) {
            int tmp = input % 10;
            input = input / 10;

            result += compareToComNumber(comNumberList.get(i), tmp);
        }
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
        handleResult(checkInput(getInputNumber()));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startNewGame();
    }
}
