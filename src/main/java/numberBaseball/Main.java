package numberBaseball;

import java.util.Scanner;

public class Main {

    void startNewGame(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    String stringResult(int result) {
        String resultStr = "";
        return resultStr;
    }
    void resultView(int result){

        if (result == 0) {
            System.out.println();
        }
    }

    int compareToComputer(int input) {
        int result = 0;

        return result;
    }

    int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Main main = new Main();
        int input = 0;
        while (input != 2) {
            input = main.inputNumber();
            main.resultView(main.compareToComputer(input));
        }
    }
}
